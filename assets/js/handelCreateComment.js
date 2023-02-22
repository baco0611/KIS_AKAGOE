import readMoreHandling from './readmore.js'
import makeSwiper from './swiper.js'

function createCommentBox(formValues, element) {
    formValues.content = formValues.content.split("\n").join(" <br> ")
    
    // Create box-star
    const rvBoxStar = document.createElement("div")
    const text = '<div class="box-star">\n<i class="ti-star"></i>\n</div>'
    var boxInnerHTML = ''

    for (var i = 0; i < formValues.star; i++)
    {
        boxInnerHTML += text
    }

    rvBoxStar.innerHTML = boxInnerHTML
    rvBoxStar.classList.add('review-box-star')
    
    // Create pDate
    const pDate = document.createElement('p')
    if(formValues.time)
    {
        pDate.innerHTML = formValues.time
    } else pDate.innerHTML = 'Current'
    pDate.classList.add('review-box-date')

    // Create review-box-header
    const rvBoxHeader = document.createElement("div")
    rvBoxHeader.appendChild(rvBoxStar)
    rvBoxHeader.appendChild(pDate)
    rvBoxHeader.classList.add("review-box-header")

    // Create review-name
    const rvName = document.createElement('h2')
    rvName.innerHTML = formValues.fullName
    rvName.classList.add('review-name')

    // Create review-content
    // const rvText = formValues.content.slice(0, 65) + "..."
    const rvContent = document.createElement('p')
    rvContent.innerHTML = formValues.content
    rvContent.classList.add('review-content')

    // Create box-content
    const rvBoxContent = document.createElement('div')
    rvBoxContent.appendChild(rvName)
    rvBoxContent.appendChild(rvContent)
    rvBoxContent.classList.add('review-box-content')

    //Create total review-box-readmore-hidden
    const rvBoxContainer = document.createElement('div')
    rvBoxContainer.appendChild(rvBoxHeader)
    rvBoxContainer.appendChild(rvBoxContent)
    rvBoxContainer.classList.add('review-container')

    const cmtBoxTotal = document.createElement('div')
    cmtBoxTotal.appendChild(rvBoxContainer)
    cmtBoxTotal.classList.add('review-readmore-hidden')
    
    // Add to review-readmore-box
    const rvBoxReadmore = $('.review-readmore-box')
    // id will be 1 unit larger than the number of available elements
    const id = String(Array.from(rvBoxReadmore.querySelectorAll('.review-readmore-hidden')).length + 1)
    cmtBoxTotal.id = 'rv-' + id
    rvBoxReadmore.appendChild(cmtBoxTotal)


    // Do it again
    // Create box-star
    const rvBoxStar2 = document.createElement("div")
    const text2 = '<div class="box-star">\n<i class="ti-star"></i>\n</div>'
    var boxInnerHTML = ''

    for (var i = 0; i < formValues.star; i++)
    {
        boxInnerHTML += text2
    }

    rvBoxStar2.innerHTML = boxInnerHTML
    rvBoxStar2.classList.add('review-box-star')
    
    // Create pDate
    const pDate2 = document.createElement('p')
    if(formValues.time)
    {
        pDate2.innerHTML = formValues.time
    } else pDate2.innerHTML = 'Current'
    pDate2.classList.add('review-box-date')

    // Create review-box-header
    const rvBoxHeader2 = document.createElement("div")
    rvBoxHeader2.appendChild(rvBoxStar2)
    rvBoxHeader2.appendChild(pDate2)
    rvBoxHeader2.classList.add("review-box-header")

    // Create review-name
    const rvName2 = document.createElement('h2')
    rvName2.innerHTML = formValues.fullName
    rvName2.classList.add('review-name')

    // Create review-content
    // const rvText = formValues.content.slice(0, 65) + "..."
    const rvContent2 = document.createElement('p')
    rvContent2.innerHTML = formValues.content
    rvContent2.classList.add('review-content')

    // Create box-content
    const rvBoxContent2 = document.createElement('div')
    rvBoxContent2.appendChild(rvName2)
    rvBoxContent2.appendChild(rvContent2)
    rvBoxContent2.classList.add('review-box-content')

    //Create total review-box-readmore-hidden
    
    const rvBoxContainer2 = document.createElement('div')
    rvBoxContainer2.appendChild(rvBoxHeader2)
    rvBoxContainer2.appendChild(rvBoxContent2)
    rvBoxContainer2.classList.add('review-container')

    const cmtBoxTotal2 = document.createElement('div')
    cmtBoxTotal2.appendChild(rvBoxContainer2)
    cmtBoxTotal2.classList.add('review-readmore-hidden')

    const line = document.createElement('div')
    line.classList.add('line')

    const readmoreBtn = document.createElement('button')
    readmoreBtn.id = id
    readmoreBtn.classList.add('review-readmore')
    readmoreBtn.innerText = 'Read more'

    rvBoxContent2.appendChild(line)
    rvBoxContent2.appendChild(readmoreBtn)

    // Create comment not hidden (open)
    const rvBoxContainerOpen = document.createElement('div')
    rvBoxContainerOpen.appendChild(rvBoxHeader2)
    rvBoxContainerOpen.appendChild(rvBoxContent2)
    rvBoxContainerOpen.classList.add('review-box')
    rvBoxContainerOpen.classList.add('swiper-slide')
    rvBoxContainerOpen.classList.add('item')
    rvBoxContainerOpen.setAttribute('open', '')

    // Add to UI
    if(!element)
    {
        const swiperWrapper = $('.review-main .main')
        swiperWrapper.appendChild(rvBoxContainerOpen)
    } else {
        // const mainElement = $('.review-main .main-box')
        element.after(rvBoxContainerOpen)
    }
    readMoreHandling()
    makeSwiper()

    // const mainBox = $('.main-box.review-box.swiper-slide')
    // if(mainBox) {
        
    // }
}

function createMainBox(data) {
    const header = document.createElement('h4')
        header.innerHTML = 'Excellent'

        // Create box star
        const mainBoxStar = document.createElement("div")
        const text = 
        `<div class="box-star">
            <div class="main-back">
                <i class="ti-star"></i>
            </div>
        </div>`

        var boxInnerHTML = ''

        for (var i = 0; i < Number(data.avgStar); i++)
        {
            boxInnerHTML += text
        }

        mainBoxStar.innerHTML = boxInnerHTML
        mainBoxStar.classList.add('main-box-star')

        // Create description
        const description = document.createElement('h3')
        description.innerHTML = `Based on <span class="number bold">${data.numberFB}</span> <span class="bold">reviews</span>`

        // Create line
        const line = document.createElement('div')
        line.classList.add('line')

        // Create footer of mainBox
        const footer = document.createElement('h5')
        footer.innerHTML = 'akagoe reviews database'

        // Create mainBox
        const mainBox = document.createElement('div')
        mainBox.appendChild(header)
        mainBox.appendChild(mainBoxStar)
        mainBox.appendChild(description)
        mainBox.appendChild(line)
        mainBox.appendChild(footer)
        mainBox.classList.add('main-box', 'review-box', 'swiper-slide')

        const swiperWrapper = $('.review-main .main')
        swiperWrapper.appendChild(mainBox)

}

function createMainBoxFail(data) {
    const header = document.createElement('h4')
        header.innerHTML = 'Excellent'

        // Create box star
        const mainBoxStar = document.createElement("div")
        const text = 
        `<div class="box-star">
            <div class="main-back">
                <i class="ti-star"></i>
            </div>
        </div>`

        var boxInnerHTML = ''

        for (var i = 0; i < 5; i++)
        {
            boxInnerHTML += text
        }

        mainBoxStar.innerHTML = boxInnerHTML
        mainBoxStar.classList.add('main-box-star')

        // Create description
        const description = document.createElement('h3')
        description.innerHTML = `Based on <span class="number bold">0</span> <span class="bold">reviews</span>`

        // Create line
        const line = document.createElement('div')
        line.classList.add('line')

        // Create footer of mainBox
        const footer = document.createElement('h5')
        footer.innerHTML = 'akagoe reviews database'

        // Create mainBox
        const mainBox = document.createElement('div')
        mainBox.appendChild(header)
        mainBox.appendChild(mainBoxStar)
        mainBox.appendChild(description)
        mainBox.appendChild(line)
        mainBox.appendChild(footer)
        mainBox.classList.add('main-box', 'review-box', 'swiper-slide')

        const swiperWrapper = $('.review-main .main')
        swiperWrapper.appendChild(mainBox)

}

export {createCommentBox, createMainBox, createMainBoxFail}