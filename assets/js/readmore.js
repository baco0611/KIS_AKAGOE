// Handle readmore

function readMoreHandling() {
    var readmoreBtns = $$('.review-main .review-readmore')
    // console.log(readmoreBtns)
    
    readmoreBtns.forEach(readmoreBtn => {
        readmoreBtn.onclick = () => {
            const id = '#rv-' + readmoreBtn.id
            const openReadmore = $(id)
    
            openReadmore.classList.add('open')
        }
    })
    
    var readmoreDivs = $$('.review-readmore-hidden')
    
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
}

export default readMoreHandling