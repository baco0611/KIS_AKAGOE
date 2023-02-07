import createCommentBox from "./handelCreateComment.js";
import readMoreHandling from "./readmore.js";

var commentsApi = 'http://localhost:3000/comment'

fetch(commentsApi)
    .then(response => response.json())
    .then(comments => {
        console.log(comments)
        comments.forEach(comment => createCommentBox(comment))
        readMoreHandling()
    })
