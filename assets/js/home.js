function languageBtn() {
    var btn_drop = document.querySelector('#home-session .btn-drop')
    
    btn_drop.onclick = () => {
        var drop_menu = document.querySelector('#home-session .drop-menu')
        drop_menu.classList.toggle('none')
    }
}

export default languageBtn