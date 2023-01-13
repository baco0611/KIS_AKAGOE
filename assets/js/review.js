const $ = document.querySelector.bind(document);
const $$ = document.querySelectorAll.bind(document);

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
});

var readmoreBtns = $$('.review-main .review-readmore')
console.log(readmoreBtns)

readmoreBtns.forEach(readmoreBtn => {
    readmoreBtn.onclick = () => {
        const id = '#rv-' + readmoreBtn.id
        const openReadmore = $(id)

        openReadmore.classList.add('open')
    }
});

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