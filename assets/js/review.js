// const $ = document.querySelector.bind(document);
// const $$ = document.querySelectorAll.bind(document);

// const reviewBoxesOfficial = $$('.review-main .review-box')
// var reviewBoxes = reviewBoxesOfficial
// console.log(reviewBoxes)

// const backBtn = $('.review-main .back-btn')
// const nextBtn = $('.review-main .next-btn')

// console.log(backBtn)
// console.log(nextBtn)

// var main = $('.review-main .main').innerHTML
// console.log(String(main))
// main = main.split('</div>')
// console.log(main)

// const mainElement = $('.review-main .main')
// var childElement = document.createElement('div')

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