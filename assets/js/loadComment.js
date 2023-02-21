import {createMainBox, createCommentBox, createMainBoxFail} from "./handelCreateComment.js";

function fetchAPI(API, name) {
    const rvMainContain = $('.review-main .main')

    rvMainContain.innerHTML = ''

    const mainBoxApi = `http://localhost:8081/mainbox/${name}`

//     fetch('https://jsonplaceholder.typicode.com/posts/1483948389')
//   .then(response => {
//     console.log(response.status, response.ok); // 404 false 
//   })
//   .catch(error => {
//     console.log('API failure' + error);
//   });

    fetch(mainBoxApi)
    .then(response => {
        if(response.ok)
            return response.json()
        else
            return response.ok
    })
    .then(data => {
        if(data)
            createMainBox(data)
        else 
            createMainBoxFail()
    })    
    .then(() => {
        fetch(API)
        .then(response => response.json())
        .then(comments => {
            if(comments.listFeedback.length > 0)
                comments.listFeedback.forEach(comment => createCommentBox(comment))
        })
        .catch((error) => {
            console.log(error)
            console.log('Can\'t load the comment')
        }) 
    })
    .catch(() => {})
}

function defaultReview(name) {
    const sortBtn = $('.review-content-containt .sort-btn select')
    let commentsApi = "http://localhost:8081" + sortBtn.value
    fetchAPI(commentsApi, name)
}

export {fetchAPI, defaultReview}