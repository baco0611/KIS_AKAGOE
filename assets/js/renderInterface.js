    import handleExplore from "./explore.js";
    import languageBtn from "./home.js";
    import { defaultReview } from "./loadComment.js";
    import { handleTheChangeOfReview } from "./review.js";
    import Validator from "./validcomment.js";

    function renderInterface(format) {
    // Xử lý url API ở đây

    // const backgroundApi = "http://localhost:3000/background";
    // const aboutApi = "http://localhost:3000/about";
    // const exploreApi = "http://localhost:3000/explore";
    // const characterApi = "http://localhost:3000/character";
    // const reviewApi = "http://localhost:3000/comment";
    // const otherApi = "http://localhost:3000/other";

    const loaderDiv = document.createElement("div");
    loaderDiv.className = "square-div";
    const loader = document.createElement("div");
    loader.className = "square-wrap";
    for (var i = 0; i < 30; i++) {
        const loaderElement = document.createElement("div");
        loaderElement.className = "square";
        loader.appendChild(loaderElement);
    }

    loaderDiv.appendChild(loader);
    document.querySelector("#root").appendChild(loaderDiv);

    const backgroundApi = `http://localhost:8081/background/${format.name}`
    const exploreApi = `http://localhost:8081/explore/${format.language}/${format.name}`
    const characterApi = `http://localhost:8081/character/${format.language}/${format.name}`
    const aboutApi = `http://localhost:8081/about/${format.language}/${format.name}`
    const reviewApi = `http://localhost:8081/about/${format.language}/${format.name}`
    const otherApi = "http://localhost:8081/other"
    


    // fetch(exploreApipush, {
    //     method: 'POST',
    //     body: JSON.stringify(),
    //     headers: {
    //         'Content-Type': 'application/json'
    //     }
    // })

    // fetch(characterApipush, {
    //     method: 'POST',
    //     body: JSON.stringify(),
    //     headers: {
    //         'Content-Type': 'application/json'
    //     }
    // })

    fetch(backgroundApi)
        .then((response) => response.json())
        .then((data) => {
        createMain(
            format.language,
            data.nameOfGame,
            format.name,
            data.urlDownLoad
        );
        })
        .then(() => {
        fetch(aboutApi)
            .then((response) => response.json())
            .then((data) => {
            createABout(data.listContent[0]);
            })
            .then(() => {
            fetch(exploreApi)
                .then((response) => response.json())
                .then((data) => {
                createExplore(data.listResult);
                })
                .then(() => {
                fetch(characterApi)
                    .then((response) => response.json())
                    .then((data) => {
                    createCharacter(data.listResult[0]);
                    })
                    .then(() => {
                    fetch(reviewApi)
                        .then((response) => response.json())
                        .then(() => {
                            createReview(format.name);
                        })
                        .then(() => {
                        fetch(otherApi)
                            .then((response) => response.json())
                            .then((data) => {
                                createOtherAndFeedback(
                                    data.other,
                                    format.name,
                                    format.language
                                );
                            })
                            .then(() => {
                                fetch(backgroundApi)
                                    .then((response) => response.json())
                                    .then((data) => {
                                    changeBackground(data.background);
                                    })
                                .then(() => {
                                document
                                    .querySelector("#root")
                                    .removeChild(loaderDiv);
                                });
                            });
                        });
                    });
                });
            });
        });
    }

function changeBackground(data) {
    data.forEach((background) => {
        switch (background.pageName) {
        case "main":
            if (document.querySelector("#home-session")) {
            if (background.imageLink[0] != "#")
                document.querySelector(
                "#home-session"
                ).style.background = `url(${background.imageLink}) no-repeat center/cover`;
            else
                document.querySelector("#home-session").style.background =
                background.imageLink;
            }
            break;
        case "introduce":
            if (document.querySelector("#introduce-session")) {
            if (background.imageLink[0] != "#")
                document.querySelector(
                "#introduce-session"
                ).style.background = `url(${background.imageLink}) no-repeat center/cover`;
            else
                document.querySelector("#introduce-session").style.background =background.imageLink;
            }
            break;
        case "explore":
            if (document.querySelector("#explore-session")) {
            if (background.imageLink[0] != "#")
                document.querySelector("#explore-session").style.background = `url(${background.imageLink}) no-repeat center/cover`;
            else
                document.querySelector("#explore-session").style.background =background.imageLink;
            }
            break;
        case "character":
            if (document.querySelector("#character-session")) {
            if (background.imageLink[0] != "#")
                document.querySelector("#character-session").style.background = `url(${background.imageLink}) no-repeat center/cover`;
            else
                document.querySelector("#character-session").style.background =background.imageLink;
            }
            break;
        case "review":
            if (document.querySelector("#review-session")) {
            if (background.imageLink[0] != "#")
                document.querySelector("#review-session").style.background = `url(${background.imageLink}) no-repeat center/cover`;
            else
                document.querySelector("#review-session").style.background =background.imageLink;
            }
            break;
        case "other":
            if (document.querySelector("#other-session")) {
            if (background.imageLink[0] != "#")
                document.querySelector("#other-session").style.background = `url(${background.imageLink}) no-repeat center/cover`;
            else
                document.querySelector("#other-session").style.background =background.imageLink;
            }
            break;
        }
    });
}

function createMain(language, nameGame, name, download) {
    const homeSection = document.createElement("div");
    homeSection.id = "home-session";
    homeSection.className = "home";

    const nameList = nameGame.split(/\r\n/);

    homeSection.innerHTML = `
        <div class="contain wraper">
                    <div class="header">
                        <div class="language">
                            <button class="btn-drop">
                                ${language}
                                <i class="ti-angle-down"></i>
                            </button>
                            <ul class="drop-menu none">
                                <li data="ENG"><a href="/${name + "/eng.html"}">ENG</a></li>
                                <li data="VIE"><a href="/${name + "/vie.html"}">VIE</a></li>
                                <li data="JPN"><a href="/${name + "/jpn.html"}">JPN</a></li>
                            </ul>
                        </div>
                        <div class="menu-button">
                            <label for="menu-mobile-input"  class="menu-btn">
                                <div>
                                    <i class="ti-menu"></i>
                                </div>
                            </label>
                            <input type="checkbox" hidden class="menu-mobile-check" id="menu-mobile-input">
                            <label for="menu-mobile-input" class="menu-overlay"></label>
                            <ul class="menu-mobile">
                                <label for="menu-mobile-input"><i class="ti-close"></i></label>
                                <div class="menu-nav">
                                    <li><a href="#home-session">MAIN</a></li>
                                    <li><a href="#introduce-session">INTRODUCE</a></li>
                                    <li><a href="#explore-session">EXPLORE</a></li>
                                    <li><a href="#character-session">CHARACTER</a></li>
                                    <li><a href="#review-session">REVIEW</a></li>
                                    <li><a href="#other-session">OTHER</a></li>
                                </div>
                            </ul>
                        </div>
                        <div class="navbar">
                            <ul>
                                <li><a href="#home-session">MAIN</a></li>
                                <li><a href="#introduce-session">INTRODUCE</a></li>
                                <li><a href="#explore-session">EXPLORE</a></li>
                                <li><a href="#character-session">CHARACTER</a></li>
                                <li><a href="#review-session">REVIEW</a></li>
                                <li><a href="#other-session">OTHER</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="home-main">
                        <h1>${nameList[0] || ""}</h1>
                        <h2>${nameList[1] || ""}</h2>
                        <button class="download"><a href="${download}" download="">Download now</a></button>
                    </div>
                    <div class="home-down-btn">
                        <a href="#introduce-session">THE STORY</a>
                        <a href="#introduce-session"><i class="ti-arrow-circle-down"></i></a>
                    </div>
                </div>
                <a id="download-game" style="display: none" href="${download}" download="">
                    <i class="ti-download"></i>
                </a>
                <div class="page-back home-back"></div>
        `;
    document.querySelector("#root").appendChild(homeSection);
    languageBtn();

    window.onscroll = () => {
        // console.log(window.innerHeight)
        const downBtn = document.querySelector("#download-game");
        if (window.scrollY <= 500) downBtn.style.display = "none";
        else downBtn.removeAttribute("style");
    };
}

function createABout(data) {
    const titles = data.title.split(/\r?\n/);
    const contents = data.contentDetails.split(/\r?\n/);

    //I. Create heading
    const heading = document.createElement("div");
    heading.className = "heading";
    const h3 = document.createElement("h3");
    const h1 = document.createElement("h1");
    if(titles.length > 1)
    {
        h3.innerText = titles[0];
        h1.innerText = titles[1];
    } else
    {
        h1.innerText = titles[0]
    }
    heading.appendChild(h3);
    heading.appendChild(h1);

    //I. Create line
    const line = document.createElement("div");
    line.className = "line";

    //I. Create content
    const contentUl = document.createElement("ul");
    contentUl.className = "content";
    contents.forEach((content) => {
        const liElement = document.createElement("li");
        liElement.innerHTML = content;
        contentUl.appendChild(liElement);
    });

    //II. Create all
    const pageFront = document.createElement("div");
    pageFront.classList.add("page-back", "page-front");

    //II.2. Create wraper
    const contentWraper = document.createElement("div");
    contentWraper.classList.add("containt", "wraper");
    contentWraper.appendChild(heading);
    contentWraper.appendChild(line);
    contentWraper.appendChild(contentUl);

    //II.3. Create page-back
    const pageBack = document.createElement("div");
    pageBack.classList.add("page-back");

    //Create all
    const aboutSection = document.createElement("div");
    aboutSection.id = "introduce-session";
    aboutSection.className = "introduce";
    aboutSection.appendChild(pageFront);
    aboutSection.appendChild(contentWraper);
    aboutSection.appendChild(pageBack);

    document.querySelector("#root").appendChild(aboutSection);
}

function createExplore(data) {
    //I. Create content div
    //I.1. Heading
    const contentHeading = document.createElement("div");
    const contentHeadingH1 = document.createElement("h1");
    contentHeadingH1.innerText = "EXPLORE";
    contentHeading.appendChild(contentHeadingH1);
    contentHeading.className = "heading";

    //I.2. Line
    const line = document.createElement("div");
    line.className = "line";

    //I.3. Main
    const contentMain = document.createElement("div");
    contentMain.className = "content-main";
    for (var i = 1; i <= data.length; i++) {
        const contentMainP = document.createElement("p");
        contentMainP.id = "for-img-" + i;
        if (i != 1) {
        contentMainP.className = "none";
        }
        contentMainP.innerHTML = data[i - 1].contentExplore;
        contentMain.appendChild(contentMainP);
    }

    //I.4. Create div
    const content = document.createElement("div");
    content.className = "content";
    content.appendChild(contentHeading);
    content.appendChild(line);
    content.appendChild(contentMain);

    //II. Create slider
    const imgSlide = document.createElement("div");
    imgSlide.className = "img-slide";

    //II.1. Create input element
    for (var i = 0; i < data.length; i++) {
        const inputType = document.createElement("input");
        inputType.type = "radio";
        inputType.name = "testimonial";
        inputType.id = "img-" + (i + 1);

        if (i == 0) {
        inputType.checked = true;
        }
        imgSlide.appendChild(inputType);
    }

    //II.2. Create image area
    const imgArea = document.createElement("div");
    imgArea.className = "image-area";
    for (var i = 0; i < data.length; i++) {
        const imgLabel = document.createElement("label");
        imgLabel.className = "item";
        imgLabel.setAttribute("for", "img-" + (i + 1));

        const labelChild = document.createElement("div");
        labelChild.style.backgroundImage = `url(${data[i].imageLink})`;
        imgLabel.appendChild(labelChild);

        imgArea.appendChild(imgLabel);
    }
    imgSlide.appendChild(imgArea);

    //II.3. Create dots element
    const dots = document.createElement("div");
    dots.className = "dots";
    for (var i = 0; i < data.length; i++) {
        const imgLabel = document.createElement("label");
        imgLabel.setAttribute("for", "img-" + (i + 1));
        dots.appendChild(imgLabel);
    }
    imgSlide.appendChild(dots);

    //I.3. Main
    const contentMain2 = document.createElement("div");
    contentMain2.className = "content-main";
    for (var i = 1; i <= data.length; i++) {
        const contentMainP = document.createElement("p");
        contentMainP.id = "for-img-" + i;
        if (i != 1) {
        contentMainP.className = "none";
        }
        contentMainP.innerHTML = data[i - 1].contentExplore;
        contentMain2.appendChild(contentMainP);
    }
    imgSlide.appendChild(contentMain2);

    //III. Create Section

    //III.1. Create page-front
    const pageFront = document.createElement("div");
    pageFront.classList.add("page-back", "page-front");

    //III.2. Create wraper
    const contentWraper = document.createElement("div");
    contentWraper.classList.add("containt", "wraper");
    contentWraper.appendChild(content);
    contentWraper.appendChild(imgSlide);

    //III.3. Create page-back
    const pageBack = document.createElement("div");
    pageBack.classList.add("page-back");

    //Create all
    const exploreSection = document.createElement("div");
    exploreSection.id = "explore-session";
    exploreSection.className = "explore";
    exploreSection.appendChild(pageFront);
    exploreSection.appendChild(contentWraper);
    exploreSection.appendChild(pageBack);

    document.querySelector("#root").appendChild(exploreSection);
    handleExplore();
}

function createCharacter(data) {
    //I. Create character content
    const heading = document.createElement("div");
    heading.className = "heading";
    const h3 = document.createElement("h3");
    const h1 = document.createElement("h1");
    h3.innerText = "INTRODUCE";
    h1.innerText = "CHARACTER";
    heading.appendChild(h3);
    heading.appendChild(h1);

    const p = document.createElement("p");
    p.innerHTML = data.description.replace(/\n/g, "<br /><br />");

    const characterContent = document.createElement("div");
    characterContent.className = "character-content";
    characterContent.appendChild(heading);
    characterContent.appendChild(p);

    //II. Create character img
    const characterImg = document.createElement("div");
    characterImg.className = "character-img";
    if (data.imageType == "3D") {
        const modelViewer = document.createElement("model-viewer");
        modelViewer.setAttribute("src", data.imageLink);
        modelViewer.setAttribute("camera-controls", "");
        modelViewer.setAttribute("auto-rotate", "");
        modelViewer.setAttribute("ar", "");

        const pImg = document.createElement("p");
        pImg.innerHTML = "Dùng chuột kéo thả để xem và con lăn để zoom";

        characterImg.appendChild(modelViewer);
        characterImg.appendChild(pImg);
    } else {
        const image = document.createElement("div");
        image.style.background = `url(${data.imageLink}) center/cover`;

        characterImg.appendChild(image);
    }

    //Create section
    //III.1. Create page-front
    const pageFront = document.createElement("div");
    pageFront.classList.add("page-back", "page-front");

    //III.2. Create wraper
    const contentWraper = document.createElement("div");
    contentWraper.classList.add("containt", "wraper");
    contentWraper.appendChild(characterContent);
    contentWraper.appendChild(characterImg);

    //Create all
    const characterSection = document.createElement("div");
    characterSection.id = "character-session";
    characterSection.className = "character";
    characterSection.appendChild(pageFront);
    characterSection.appendChild(contentWraper);

    document.querySelector("#root").appendChild(characterSection);
}

function createReview(name) {
    const reviewSection = document.createElement("div");
    reviewSection.id = "review-session";
    reviewSection.className = "review";

    reviewSection.innerHTML = `
        <div class="review-header wraper">
                    <div class="header-blank"></div>
                    <div class="header-content">
                        <div class="heading">
                            <h3>What customers say about us</h3>
                            <h1>REVIEWS</h1>
                        </div>
                        <div class="line"></div>
                    </div>
                </div>

                <div class="review-content-containt wraper">
                    <div class="review-btn">
                        <div class="sort-btn">
                            <p>Sort by:</p>
                            <select id="review-sort" name="sort">
                                <option value="/feedback/TimeDesc/${name}">Select</option>
                                <option value="/feedback/TimeAsc/${name}">Date-Asc</option>
                                <option value="/feedback/TimeDesc/${name}">Date-Desc</option>
                                <option value="/feedback/StarAsc/${name}">Star-Asc</option>
                                <option value="/feedback/StarDesc/${name}">Star-Desc</option>
                            </select>
                        </div>
                        <div class="cmt-btn">
                            <button>
                                <i class="ti-plus"></i>
                                <p>Leave a comment</p>
                            </button>
                        </div>
                    </div>
                    <div class="review-main">
                        <div class="swiper mySwiper">
                            <div class="main"></div>
                        </div>
                        <div class="swiper-button-next next-btn">
                            <i class="ti-angle-right"></i>
                        </div>
                        <div class="swiper-button-prev back-btn">
                            <i class="ti-angle-left"></i>
                        </div>
                        <div class="pagination swiper-pagination"></div>
                    </div>
                    <div class="review-readmore-box"></div>
                    <div class="comment-box">
                        <div class="comment-container">
                            <h1>How was your experience?</h1>
                            <div class="comment-rating">
                                <input type="radio" name="rate" id="rate-5"><label class="ti-star" for="rate-5"></label>
                                <input type="radio" name="rate" id="rate-4"><label class="ti-star" for="rate-4"></label>
                                <input type="radio" name="rate" id="rate-3"><label class="ti-star" for="rate-3"></label>
                                <input type="radio" name="rate" id="rate-2"><label class="ti-star" for="rate-2"></label>
                                <input type="radio" name="rate" id="rate-1"><label class="ti-star" for="rate-1"></label>
                            </div>

                            <form action="#" method="POST" class="form" id="comment-form">
                                <header></header>
                                <h1>PLEASE RATE FIRST ^^</h1>
                                <div class="comment-input">
                                    <div class="form-group">
                                        <label for="comment-name">Name</label>
                                        <input id="comment-name" name="fullName" class="name" type="text" placeholder="Your name">
                                        <span class="form-message"></span>
                                    </div>
                                    <div class="form-group">
                                        <label for="comment-email">Email</label>
                                        <input id="comment-email" name="email" class="email" type="text" placeholder="Your email">
                                        <span class="form-message"></span>
                                    </div>
                                    <div class="form-group">
                                        <label for="comment-phone">Phone number</label>
                                        <input id="comment-phone" name="phone" class="phonenumber" type="text" placeholder="Your phone number">
                                        <span class="form-message"></span>
                                    </div>
                                    <div class="form-group">
                                        <label for="comment-text">Your comment</label>
                                        <textarea name="content" id="comment-text" cols="30" placeholder="Text your comment"></textarea>
                                        <span class="form-message"></span>
                                    </div>
                                </div>
                                <button class="submit-button">Submit</button>
                            </form>

                            <i class="ti-close"></i>
                        </div>
                    </div>
                </div>
        `;

    document.querySelector("#root").appendChild(reviewSection);
    defaultReview(name);
    handleTheChangeOfReview(name);
    Validator({
        name,
        form: '#comment-form',
        formGroupSelector: '.form-group',
        errorSelector: '.form-message',
        rules: [
            Validator.isRequired('#comment-name', 'Please fill your full name'),
            Validator.isRequired('#comment-email', 'Please fill your email'),
            Validator.isEmail('#comment-email', 'Please fill correct email'),
            Validator.isRequired('#comment-phone'),
            Validator.minLength('#comment-phone', 10, "Please fill the correct phone number"),
            Validator.isPhoneNumber('#comment-phone', "Sai tề"),
            Validator.isRequired('#comment-text'),
        ],
        onSubmit(data) {
            console.log(data)
        }
    });
}

function createOtherAndFeedback(data, name, language) {
    data.sort(function () {
        return 0.5 - Math.random();
    });
    data = data.filter(dataElement => dataElement.idName != name)

    //I. Create other section
    //I.1. Create header
    const header = document.createElement('h1')
    header.className = "other-header"
    header.innerHTML = "OTHER"

    //I.2. Create containt
    const h2Element = document.createElement('h2')
    h2Element.innerHTML = 'Try another game'

    const otherMain = document.createElement('div')
    otherMain.className = "other-main"
    for(var i = 0; i<3; i++) {
        const otherDiv = document.createElement('div')
        otherDiv.className = "other-div"

        const otherImg = document.createElement('a')
        otherImg.className = 'other-img'
        otherImg.setAttribute('href', `/${data[i].idName}/${language.toLowerCase()}.html`)
        otherImg.innerHTML = `<div style="background: url(${data[i].urlImage}) no-repeat center/cover;"></div>`
        
        const otherName = document.createElement('a')
        otherName.className = 'other-name'
        otherName.setAttribute('href', `/${data[i].idName}/${language.toLowerCase()}.html`)
        otherName.innerHTML = `<h4>${data[i].name}</h4>`

        otherDiv.appendChild(otherImg)
        otherDiv.appendChild(otherName)
        otherMain.appendChild(otherDiv)
    }
    
    const otherContaint = document.createElement('div')
    otherContaint.classList.add('containt', 'wraper')
    otherContaint.appendChild(h2Element)
    otherContaint.appendChild(otherMain)

    //I.3. Create full
    const otherSection = document.createElement('div')
    otherSection.id = "other-session"
    otherSection.className = 'other'
    otherSection.appendChild(header)
    otherSection.appendChild(otherContaint)
    document.querySelector("#root").appendChild(otherSection);


    //II. Create footer
    const footerSection = document.createElement('div')
    footerSection.id = "footer-session"
    footerSection.className = 'footer'
    footerSection.innerHTML =
    `
    <div class="containt wraper">
        <div class="footer-nav">
            <div class="language">
                <button class="btn-drop">
                    ENG
                    <i class="ti-angle-down"></i>
                </button>
                <ul class="drop-menu none">
                    <li data="ENG"><a href="/${name}/eng.html">ENG</a></li>
                    <li data="VIE"><a href="/${name}/vie.html">VIE</a></li>
                    <li data="JPN"><a href="/${name}/jpn.html">JPN</a></li>
                </ul>
            </div>
            <div class="navbar">
                <ul>
                    <li><a href="#home-session">MAIN</a></li>
                    <li><a href="#introduce-session">INTRODUCE</a></li>
                    <li><a href="#explore-session">EXPLORE</a></li>
                    <li><a href="#character-session">CHARACTER</a></li>
                    <li><a href="#review-session">REVIEW</a></li>
                    <li><a href="#other-session">OTHER</a></li>
                </ul>
            </div>
        </div>
        <p>&copy Copyright by AKAGOE team of "KIS-GE Internship Program". All Rights Reserved.</p>
    </div>
    `
    document.querySelector("#root").appendChild(footerSection);
    languageBtn();
}
   

export default renderInterface;
