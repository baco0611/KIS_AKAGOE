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
            console.log(content);
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
        console.log(id)
        changeContent(id)
    }
})

// ,
//     {
//       "content": "That my best friend, she a real bad bitch Got her own money, she 'on't need no nig' On the dance floor, she had two-three drinks\nNow she twerkin', she throw it out and come back in That's my best friend, she a real bad bitch Drive her own car, she 'on't need no Lyft",
//       "fullName": "Blink Blink Bao",
//       "star": "3",
//       "time": "20/10/2023",
//       "id": 2
//     },
//     {
//       "content": "I love you and me Dancing in the moonlight Nobody can see It's just you and me tonight I love you and me Dancing in the moonlight Nobody can see It's just you and me tonight",
//       "fullName": "Jennie",
//       "star": "5",
//       "time": "01/01/2023",
//       "id": 3
//     }