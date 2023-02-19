import {createMainBox, createCommentBox} from "./handelCreateComment.js";

function fetchAPI(API) {
    const rvMainContain = $('.review-main .main')

    rvMainContain.innerHTML = ''

    const mainBoxApi = 'http://localhost:8081/akagoe/mainbox'

    fetch(mainBoxApi)
    .then(response => response.json())
    .then(data => {
        createMainBox(data)
    })    
    .then(() => {
        fetch(API)
        .then(response => response.json())
        .then(comments => {
            // console.log(comments.listFeedback)
            comments.listFeedback.forEach(comment => createCommentBox(comment))
            // comments.forEach(comment => createCommentBox(comment))
        })
        .catch((error) => {
            console.log(error)
            console.log('Can\'t load the comment')
        }) 
    })
    .catch(() => {
    })
}

function defaultReview() {
    const sortBtn = $('.review-content-containt .sort-btn select')
    let commentsApi = "http://localhost:8081" + sortBtn.value
    fetchAPI(commentsApi)
}

export {fetchAPI, defaultReview}