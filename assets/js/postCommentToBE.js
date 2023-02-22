import { fetchAPI } from "./loadComment.js"

function postCommentToBe(formValues) {
    var commentsApi = 'http://localhost:8081/feedback'
    // var commentsApi = 'http://localhost:3000/comment'
    fetch(commentsApi, {
        method: 'POST',
        body: JSON.stringify(formValues), 
        headers: {
            'Content-Type': 'application/json'
        }
    })
    .then(() => {
        const sortBtn = $('.review-content-containt .sort-btn select')
        let commentsApi = "http://localhost:8081" + sortBtn.value
        fetchAPI(commentsApi, formValues.idName)
    })
    .catch(error => {
        console.log(error)
    })
}

export default postCommentToBe