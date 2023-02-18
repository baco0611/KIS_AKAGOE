import fetchAPI from "./loadComment.js"

// fetch API based on value of sort btn
const sortBtn = $('.review-content-containt .sort-btn select')
sortBtn.onchange = () => {
    // console.log(sortBtn.value)
    let commentsApi = "http://localhost:8081" + sortBtn.value
    fetchAPI(commentsApi)
}

// Handle readmore
var readmoreBtns = $$('.review-main .review-readmore')
// console.log(readmoreBtns)

readmoreBtns.forEach(readmoreBtn => {
    readmoreBtn.onclick = () => {
        const id = '#rv-' + readmoreBtn.id
        const openReadmore = $(id)

        openReadmore.classList.add('open')
    }
})

var readmoreDivs = $$('.review-readmore-hidden')

readmoreDivs.forEach(readmoreDiv => {
    readmoreDiv.onclick = () => {
        readmoreDiv.classList.remove('open')
    }
})

const reviewContainers = $$('.review-container');
for(const reviewContainer of reviewContainers)
{
    reviewContainer.addEventListener('click', function(e){
        e.stopPropagation();
    });
}


// Handle close comment
function closeComment(cmtBox){
    cmtBox.classList.add('out')
    setTimeout(() => {
        cmtBox.classList.remove('open')
        cmtBox.classList.remove('out')
    }, 500)
}

// Handle text according to the rating
function restartStar()
{

    const stars = $$('.comment-rating input')
    
    stars.forEach(star => {
        const header = $('.comment-box form header')
        const h1 = $('.comment-box form h1')
        const button = $('.comment-box form .submit-button')
        const inputArea = $('.comment-box form .comment-input')
        star.onclick = () => {
            // console.log(star.id)
            if(star.checked)
            {
                switch (star.id) {
                    case 'rate-5':
                        header.innerHTML = 'I just love it!!!'
                        break;
                    case 'rate-4':
                        header.innerHTML = 'I just like it!!'
                        break;
                    case 'rate-3':
                        header.innerHTML = 'It\'s awesome!'
                        break;
                    case 'rate-2':
                        header.innerHTML = 'I don\'t like it!!'
                        break;
                    case 'rate-1':
                        header.innerHTML = 'I just hate it!!!'
                        break;
                
                    default:
                        break;
                }
                inputArea.style.display = "block"
                button.style.display = "block"
                h1.classList.add('none')       
            }
        }    
    })
}

// Handle open comment box
const cmtBtn = $('.cmt-btn')
const cmtBox = $('.comment-box')
const cmtCon = $('.comment-container')
const closeBtn = $('.comment-container i')
const submitBtn = $('.comment-box button')

cmtBtn.onclick = () => {
    cmtBox.classList.add('open')
    restartStar()
}

cmtBox.onclick = () => {
    closeComment(cmtBox)
}

closeBtn.onclick = () => {
    closeComment(cmtBox)
}

cmtCon.onclick = e => {
    e.stopPropagation()
}

function restartTheForm() {
    cmtBox.classList.add('out')
    setTimeout(() => {
        cmtBox.classList.remove('open')
        
        // Restart Star box
        const stars = $$('.comment-rating input')
        stars.forEach(star => {
            star.checked = false
        })
        
        // Restart Input box
        const inputs = $$('.comment-input input')
        inputs.forEach(input => {
            input.value = ''
        })

        const textArea = $('.comment-input textarea')
        textArea.value =''

        // Hide form input
        const formInput = $('.comment-input')
        formInput.removeAttribute("style")

        submitBtn.removeAttribute("style")

        // Open h1
        const h1 = $('form h1')
        h1.removeAttribute('class')

        // Delete content of header
        const header = $('form header')
        header.innerHTML = ''

        cmtBox.classList.remove('out')
    }, 500)
    // e.preventDefault()
}

export default restartTheForm