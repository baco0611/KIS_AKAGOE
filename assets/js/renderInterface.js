import handleExplore from "./explore.js";
import languageBtn from "./home.js";

function renderInterface(format) {
    // Xử lý url API ở đây

    const backgroundApi = "http://localhost:3000/background"
    const aboutApi = "http://localhost:3000/about"
    const exploreApi = "http://localhost:3000/explore";
    const characterApi = "http://localhost:3000/character"
    // const exploreApi = `http://localhost:8081/${format.name}/explore/${format.language}`
    // const characterApi = `http://localhost:8081/${format.name}/character/${format.language}`

    // const exploreApipush = `http://localhost:8081/${format.name}/explore/pushData`
    // const characterApipush = `http://localhost:8081/${format.name}/about/pushData`
    
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
    .then(response => response.json())
    .then(data => {
        createMain(format.language, data.nameOfGame)
    })

    fetch(aboutApi)
    .then(response => response.json())
    .then(data => {
        createABout(data.listContent[0])
    })

    fetch(exploreApi)
    .then((response) => response.json())
    .then((data) => {
        createExplore(data.listResult)
    })

    fetch(characterApi)
    .then(response => response.json())
    .then(data => {
        createCharacter(data.listResult[0])
    })

}

function createMain(language, name) {
    const homeSection = document.createElement('div')
    homeSection.id = "home-session"
    homeSection.className = "home"

    const nameList = name.split(/\r\n/)

    homeSection.innerHTML = 
    `
    <div class="contain wraper">
                <div class="header">
                    <div class="language">
                        <button class="btn-drop">
                            ${language}
                            <i class="ti-angle-down"></i>
                        </button>
                        <ul class="drop-menu none">
                            <li data="ENG"><a href="#">ENG</a></li>
                            <li data="VIE"><a href="#">VIE</a></li>
                            <li data="JPN"><a href="#">JPN</a></li>
                        </ul>
                    </div>
                    <div class="navbar">
                        <ul>
                            <li><a href="#home-session">MAIN</a></li>
                            <li><a href="#introduce-session">INTRODUCE</a></li>
                            <li><a href="#explore-session">EXPLORE</a></li>
                            <li><a href="#character-session">CHARACTER</a></li>
                            <li><a href="#review-session">REVIEW</a></li>
                            <li><a href="#">OTHER</a></li>
                        </ul>
                    </div>
                </div>
                <div class="home-main">
                    <h1>${nameList[0]}</h1>
                    <h2>${nameList[1] || ''}</h2>
                    <button class="download"><a href="./assets/file/setup.exe" download="">Download now</a></button>
                </div>
                <div class="home-down-btn">
                    <a href="#introduce-session">THE STORY</a>
                    <a href="#introduce-session"><i class="ti-arrow-circle-down"></i></a>
                </div>
            </div>
            <div class="page-back home-back"></div>
    `
    document.querySelector("body").appendChild(homeSection);
    languageBtn()
}

function createABout(data) {
    const titles = data.title.split(/\r?\n/)
    const contents = data.contentDetails.split(/\r?\n/)

    //I. Create heading
    const heading = document.createElement('div')
    heading.className = "heading"
    const h3 = document.createElement('h3')
    const h1 = document.createElement('h1')
    h3.innerText = titles[0]
    h1.innerText = titles[1]
    heading.appendChild(h3)
    heading.appendChild(h1)

    //I. Create line
    const line = document.createElement("div");
    line.className = "line";

    //I. Create content
    const contentUl = document.createElement('ul')
    contentUl.className = 'content'
    contents.forEach(content => {
        const liElement = document.createElement('li')
        liElement.innerHTML = content
        contentUl.appendChild(liElement)
    })
    

    //II. Create all
    const pageFront = document.createElement("div");
    pageFront.classList.add("page-back", "page-front");

    //II.2. Create wraper
    const contentWraper = document.createElement("div");
    contentWraper.classList.add("containt", "wraper");
    contentWraper.appendChild(heading)
    contentWraper.appendChild(line)
    contentWraper.appendChild(contentUl)

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

    document.querySelector("body").appendChild(aboutSection);
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

    document.querySelector("body").appendChild(exploreSection);
    handleExplore();
}

function createCharacter(data) {
    //I. Create character content
    const heading = document.createElement('div')
    heading.className = "heading"
    const h3 = document.createElement('h3')
    const h1 = document.createElement('h1')
    h3.innerText = 'INTRODUCE'
    h1.innerText = 'CHARACTER'
    heading.appendChild(h3)
    heading.appendChild(h1)

    const p = document.createElement('p')
    p.innerHTML = data.description.replace(/\n/g, "<br /><br />")
    
    const characterContent = document.createElement('div')
    characterContent.className = 'character-content'
    characterContent.appendChild(heading)
    characterContent.appendChild(p)

    //II. Create character img
    const characterImg = document.createElement('div')
    characterImg.className = 'character-img'
    if(data.imageType == '3D')
    {
        const modelViewer = document.createElement('model-viewer')
        modelViewer.setAttribute('src', data.imageLink)
        modelViewer.setAttribute('camera-controls', '')
        modelViewer.setAttribute('auto-rotate', '')
        modelViewer.setAttribute('ar', '')

        const pImg = document.createElement('p')
        pImg.innerHTML = 'Dùng chuột kéo thả để xem và con lăn để zoom'

        characterImg.appendChild(modelViewer)
        characterImg.appendChild(pImg)
    } else {
        const image = document.createElement('img')
        image.style.backgroundImage = `url(${data.imageLink})`

        characterImg.appendChild(image)
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

    document.querySelector("body").appendChild(characterSection);

}
export default renderInterface