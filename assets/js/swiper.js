function makeSwiper() {
    const swiperItems = $$('.review-box')

    // Make pagination

    const wraper = $('.review-content-containt.wraper')
    var swiperWidth = wraper.offsetWidth * 80/100

    const numberOfItems = Math.floor(swiperWidth / swiperItems[0].offsetWidth)
    const numberOfPages = Math.ceil(swiperItems.length/ numberOfItems)
    const pagination = $('.pagination')
    pagination.innerHTML = `<input type="radio" name="review" id="page0" checked>

    <div class="dots">
        <label for="page0" class="active"></label>
    </div>`

    const dots = $('.pagination .dots')

    for (var i = 1; i < numberOfPages; i++)
    {
        const input = document.createElement('input')
        input.type = 'radio'
        input.name = 'review'
        input.id = 'page' + String(i)
        pagination.appendChild(input)

        const label = document.createElement('label')
        label.setAttribute("for", 'page' + String(i))
        dots.appendChild(label)
    }

    dots.onclick = () => {
        setTimeout(() => {
            // console.log(dots)
            const inputs = $$('.pagination input')
            inputs.forEach(input => {
                if(input.checked) {
                    var id = input.id
                    var page = id.slice(4, id.length)
    
                    const dotsLabel = $$('.pagination .dots label')
                    dotsLabel.forEach(label => {
                        label.classList.remove('active')
                    })
    
                    const active = $(`.pagination .dots label[for=${id}]`)
                    active.classList.add('active')

                    showPage(numberOfItems, page)
                }
            })
        }, 1)
    }

    const nextBtn = $('.review-main .next-btn')
    nextBtn.onclick = () => {
        const inputs = $$('.pagination input')
        
        for(var i = 0; i<inputs.length; i++) {
            if(inputs[i].checked) {
                var id = inputs[i].id
                var page = Number(id.slice(4, id.length))
                
                page += 1
                if(page >= numberOfPages) {
                    page = 0;
                }
    
                id = id.slice(0, 4) + String(page)
                // console.log(id)

                const dotsLabel = $$('.pagination .dots label')
                dotsLabel.forEach(label => {
                    label.classList.remove('active')
                })
                
                const active = $(`.pagination .dots label[for=${id}]`)
                active.classList.add('active')

                showPage(numberOfItems, page)

                const inputcheck = $(`.review-main #${id}`)
                inputcheck.checked = true
                break
            }
        }
    }

    const prevBtn = $('.review-main .back-btn')
    prevBtn.onclick = () => {
        const inputs = $$('.pagination input')
        
        for(var i = 0; i<inputs.length; i++) {
            if(inputs[i].checked) {
                var id = inputs[i].id
                var page = Number(id.slice(4, id.length))
                
                page -= 1
                if(page < 0) {
                    page = numberOfPages - 1;
                }
    
                id = id.slice(0, 4) + String(page)
                // console.log(id)

                const dotsLabel = $$('.pagination .dots label')
                dotsLabel.forEach(label => {
                    label.classList.remove('active')
                })
                
                const active = $(`.pagination .dots label[for=${id}]`)
                active.classList.add('active')

                showPage(numberOfItems, page)

                const inputcheck = $(`.review-main #${id}`)
                inputcheck.checked = true
                break
            }
        }
    }

    function showPage(numberOfItems, page) {
        const swiperItems = $$('.review-box')
        const numberClose = page * numberOfItems
        var i = 0;
        
        for(; i<numberClose; i++)
        {
            console.log(swiperItems[i]);
            swiperItems[i].classList.add('none')
        }

        // console.log(i)

        for(; i < swiperItems.length; i++)
        {
            swiperItems[i].classList.remove('none')
        }
    }
}  

window.onresize = makeSwiper

export default makeSwiper