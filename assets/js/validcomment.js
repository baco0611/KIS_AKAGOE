// Valid and return form element
const textArea = $('#comment-content')
const submitBtn = $('.comment-box .submit-button')

submitBtn.onclick = (e) => {
    e.stopPropagation()

    const textArea = $('.comment-box form textarea')
    const name = $('.comment-box form .name')
    const email = $('.comment-box form .email')

    console.log(textArea.value)
    console.log(name.value)
    console.log(email.value)
}