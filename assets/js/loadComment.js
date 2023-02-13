import {createCommentBox, createMainBox} from "./handelCreateComment.js";

function fetchAPI(API) {

    const rvMainContain = $('.review-main .main')

    rvMainContain.innerHTML = ''

    createMainBox()

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
}

const sortBtn = $('.review-content-containt .sort-btn select')
// console.log(sortBtn.value)
// var commentsApi = 'http://localhost:8081/feedback/StarDesc'
// var commentsApi = 'http://localhost:3000/comment'
let commentsApi = "http://localhost:8081" + sortBtn.value
fetchAPI(commentsApi)

export default fetchAPI