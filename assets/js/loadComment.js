import createCommentBox from "./handelCreateComment.js";


// var commentsApi = 'http://localhost:8081/feedback/TimeAsc'
var commentsApi = 'http://localhost:3000/comment'

fetch(commentsApi)
    .then(response => response.json())
    .then(comments => {
        // console.log(comments.listFeedback)
        // comments.listFeedback.forEach(comment => createCommentBox(comment))
        comments.forEach(comment => createCommentBox(comment))
    })
    .then(() => {

    })
    .catch((error) => {
        console.log(error)
        console.log('Can\'t load the comment')
    }) 
