var btn_drop = document.querySelector('#home-session .btn-drop')

btn_drop.onclick = () => {
    var drop_menu = document.querySelector('#home-session .drop-menu')
    drop_menu.classList.toggle('none')
    // console.log(drop_menu)
}

// const scroll = new SmoothScroll('.home-down-btn a[href*="#"]', {
// 	speed: 500
// });