import createCommentBox from "./handelCreateComment.js";

var commentsApi = 'http://localhost:3000/comment'

fetch(commentsApi)
    .then(response => response.json())
    .then(comments => {
        comments.forEach(comment => createCommentBox(comment))
    })
    .catch(() => {
        console.log('Can\'t load the comment')
    }) 

var API = 'http://localhost:3000/feedbacks'

// fetch(API)
//     .then(response => response.json())
//     .then(data => console.log(data))