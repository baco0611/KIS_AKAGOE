function createCommentBox(formValues) {
    var fValue = {
        content:"I don't like your little games Don't like your tilted stage The role you made me play of the fool No, I don't like you I don't like your perfect crime How you laugh when you lie\nYou said the gun was mine Isn't cool, no, I don't like you (oh!) But I got smarter, I got harder in the nick of time Honey, I rose up from the dead, I do it all the time",
        email:"baoblink@gmail.com",
        name:"Bao Huynh Van Nguyen",
        phone:"0905920814",
        star: 4
    }
    
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
    rvContent.textContent = formValues.content
    rvContent.classList.add('review-content')

    // Create box-content
    const rvBoxContent = document.createElement('div')
    rvBoxContent.appendChild(rvName)
    rvBoxContent.appendChild(rvContent)
    rvBoxContent.classList.add('review-box-content')

    //Create total review-box-readmore-hidden
    console.log(rvBoxHeader, typeof rvBoxHeader)
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
    rvContent2.textContent = formValues.content
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

    // Add to UI
    const swiperWrapper = $('.review-main .swiper-wrapper')
    swiperWrapper.appendChild(rvBoxContainerOpen)
}

export default createCommentBox