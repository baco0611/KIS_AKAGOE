const $ = document.querySelector.bind(document);
const $$ = document.querySelectorAll.bind(document);

// Make swiper of comment
var swiper = new Swiper(".mySwiper", {
    slidesPerView: 4,
    spaceBetween: 30,
    slidesPerGroup: 4,
    loop: true,
    loopFillGroupWithBlank: true,
    pagination: {
      el: ".swiper-pagination",
      clickable: true,
    },
    navigation: {
      nextEl: ".swiper-button-next",
      prevEl: ".swiper-button-prev",
    },
})

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

const readmoreDivs = $$('.review-readmore-hidden')

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
function closeComment(cmtBox, cmtCon, cmtConOff){
    cmtBox.classList.remove('open')
    cmtCon.innerHTML = cmtConOff
}

// Handle text according to the rating
function restartStar()
{

    const stars = $$('.comment-rating input')
    console.log(stars)
    
    stars.forEach(star => {
        const header = $('form header')
        const h1 = $('form h1')
        const textArea = $('form textarea')
        const button = $('form button')
        star.onclick = () => {
            console.log(star.id)
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
                h1.classList.add('none')
                textArea.classList.add('open')        
                button.classList.add('open')        
            }
        }    
    })
}

// Handle add comment
const cmtBtn = $('.cmt-btn')
const cmtBox = $('.comment-box')
const cmtCon = $('.comment-container')
const cmtConOff = cmtCon.innerHTML

cmtBtn.onclick = () => {
    cmtBox.classList.add('open')
    restartStar()
}

cmtBox.onclick = () => {
    closeComment(cmtBox, cmtCon, cmtConOff)
}

cmtCon.onclick = e => {
    e.stopPropagation()
}



