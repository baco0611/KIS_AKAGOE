function languageBtn() {
    const top_btn_drop = document.querySelector('#home-session .btn-drop')
    
    if(top_btn_drop)
        top_btn_drop.onclick = () => {
            var drop_menu = document.querySelector('#home-session .drop-menu')
            drop_menu.classList.toggle('none')
        }

    const bottom_btn_drop = document.querySelector('#footer-session .btn-drop')

    if(bottom_btn_drop)
        bottom_btn_drop.onclick = () => {
            var drop_menu = document.querySelector('#footer-session .drop-menu')
            drop_menu.classList.toggle('none')
        }
}

export default languageBtn