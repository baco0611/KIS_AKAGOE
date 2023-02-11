function postCommentToBe(formValues) {
    var commentsApi = 'http://localhost:8081/feedback'
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