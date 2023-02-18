import handleExplore from "./explore.js";

function renderInterface(name) {
    // Xử lý url API ở đây

    const exploreApi = "http://localhost:3000/explore";
    const characterApi = "http://localhost:3000/character"
    
    fetch(exploreApi)
    .then((response) => response.json())
    .then((data) => {
        createExplore(data.listResult)
    })
    .then(() => {
        fetch(characterApi)
        .then(response => response.json())
        .then(data => {
            createCharacter(data.listResult[0])
        })
    })
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
    p.innerHTML = data.description.replace(/\n/g, "<br />")
    
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