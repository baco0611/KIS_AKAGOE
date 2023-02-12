function postCommentToBe(formValues) {
    // var commentsApi = 'http://localhost:8081/feedback'
    var commentsApi = 'http://localhost:3000/comment'
    console.log(formValues)
    fetch(commentsApi, {
        method: 'POST',
        body: JSON.stringify(formValues), 
        headers: {
            'Content-Type': 'application/json'
        }
    })
    .catch(error => {
        console.log(error)
    })
}

export default postCommentToBe