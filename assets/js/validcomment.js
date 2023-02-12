// const $ = document.querySelector.bind(document);
// const $$ = document.querySelectorAll.bind(document);
import createCommentBox from "./handelCreateComment.js";
import restartTheForm from "./review.js";
import postCommentToBe from "./postCommentToBE.js";

// Contructor function
function Validator(option) {

    function getParent(element, selector) {
        while(element.parentElement) {
            if(element.parentElement.matches(selector))
                return element.parentElement
            
            element = element.parentElement
        }
    }
    
    var selectorRules = {}

    // The function that does the validation
    function validate(inputElement, rule) {
        //value: inputElement.value
        //test: rule.test
        // var errorElement = inputElement.parentElement.querySelector(option.errorSelector) 
        var errorElement = getParent(inputElement, option.formGroupSelector).querySelector(option.errorSelector) 
        var errorMessage;

        // Get rules of selector
        var rules = selectorRules[rule.selector]
        
        // Loop each rule and validate the value by rule
        // In the case of error, break the loop
        for (var i = 0; i < rules.length; i++)
        {
            errorMessage = rules[i](inputElement.value)
            if(errorMessage)
                break
        }

        if(errorMessage) {
            errorElement.innerText = errorMessage
            getParent(inputElement, option.formGroupSelector).classList.add('invalid')
        } else {
            errorElement.innerText = ''
            getParent(inputElement, option.formGroupSelector).classList.remove('invalid')
        }
        
        return !errorMessage
    }

    // Get the element of the form to validate
    var formElement = $(option.form)


    if(formElement) {

        // When the form be submitted
        formElement.onsubmit = (e) => {
            e.preventDefault()

            var isFormValid = true
            // Loop through each rule and validate in any case
            option.rules.forEach(rule => {
                var inputElement = formElement.querySelector(rule.selector)
                if(inputElement) {
                    var isValid = validate(inputElement, rule)

                    if(!isValid)
                        isFormValid = false
                }
            })

            if(isFormValid)
            {
                if(typeof option.onSubmit === 'function')
                {
                    var enableInputs = formElement.querySelectorAll('[name]:not([disabled])')
                    var formValues = Array.from(enableInputs).reduce((values, input) => {
                        values[input.name] = input.value
                        return values
                    }, {})

                    const ratingBtns = $$('.comment-box .comment-rating input')
                    var id
                    ratingBtns.forEach(rating => {
                        if(rating.checked)
                            id = rating.id[rating.id.length - 1]
                    })

                    formValues['star'] = Number(id)

                    // option.onSubmit(formValues)
                    const mainBox = $('.review-main .main-box')
                    createCommentBox(formValues, mainBox)
                    postCommentToBe(formValues)
                    restartTheForm()
                }
            }

        }

        // Loop through each rule and listen event for handling
        option.rules.forEach(rule => {
            var inputElement = formElement.querySelector(rule.selector)
            
            // Save the rule for each element
            if(Array.isArray(selectorRules[rule.selector])){
                selectorRules[rule.selector].push(rule.test)
            } else {
                selectorRules[rule.selector] = [rule.test]
            }

            if(inputElement) {
                // Handling the case when blur out inputElement
                inputElement.onblur = () => {
                    validate(inputElement, rule)
                }

                // Handling the case when user fill the value in inputElement
                inputElement.oninput = () => {
                    var errorElement = getParent(inputElement, option.formGroupSelector).querySelector(option.errorSelector) 
                    errorElement.innerText = ''
                    getParent(inputElement, option.formGroupSelector).classList.remove('invalid')
                }
            }
        })
    }

}

// Define rules
// Principals of rule
// 1. Khi có lỗi thì trả về message lỗi
// 2. Khi không có lỗi thì trả về undefines
Validator.isRequired = (selector, message) => {
    return {
        selector,
        test(value) {
            return value.trim() ? undefined : message || 'Vui lòng nhập trường này'
        }
    }
}

Validator.isEmail = (selector, message) => {
    return {
        selector,
        test(value) {
            var regex = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/
            return regex.test(value) ? undefined : message || 'Trường này phải là email'
        }
    }
}

Validator.minLength = (selector, min, message) => {
    return {
        selector,
        test(value) {
            return value.length >= min ? undefined : message || `Vui lòng nhập mật khẩu ít nhất ${min} ký tự`
        }
    }
}

Validator({
    form: '#comment-form',
    formGroupSelector: '.form-group',
    errorSelector: '.form-message',
    rules: [
        Validator.isRequired('#comment-name', 'Please fill your full name'),
        Validator.isRequired('#comment-email', 'Please fill your email'),
        Validator.isEmail('#comment-email', 'Please fill correct email'),
        Validator.isRequired('#comment-phone'),
        Validator.minLength('#comment-phone', 10),
        Validator.isRequired('#comment-text'),
    ],
    onSubmit(data) {
        console.log(data)
    }
});