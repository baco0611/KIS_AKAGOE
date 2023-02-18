
function handleExplore() {
    const $ = document.querySelector.bind(document);
    const $$ = document.querySelectorAll.bind(document);
    const imgs = $$('.image-area .item')
    const dots = $$('.dots label')

    function changeContent (id) {
        const contents = $$('.content-main p')
        contents.forEach(content => {
            if(content.id == id)
            {
                content.classList.remove('none')
            }
            else
                content.classList.add('none')
            })
    }

    imgs.forEach(img => {
        img.onclick = () => {
            const id = 'for-' + img.htmlFor
            changeContent(id)
        }
    })

    dots.forEach(dot => {
        dot.onclick = () => {
            const id = 'for-' + dot.htmlFor
            changeContent(id)
        }
    })
}

export default handleExplore