const menu_icon = document.querySelector(".menu_icon .icon");
const menu_icon_close = document.querySelector(".menu_icon  .icon_close");
const menu1 = document.querySelector(".menu_icon .menu");
const navLinks = Array.from(document.querySelectorAll(".nav-link"));
const banner = document.querySelector(".banner__title");
console.log(banner);

menu_icon.addEventListener("click", openMenu);
menu_icon_close.addEventListener("click", closeMenu);

function openMenu() {
  menu1.classList.add("active");
  banner.classList.add("active");
  navLinks.forEach((link, index) => {
    setTimeout(() => {
      link.classList.add("active");
    }, index * 200)
  })
}

function closeMenu() {
  menu1.classList.remove("active");
  banner.classList.remove("active");
  setTimeout(() => {
    navLinks.forEach(link => link.classList.remove("active"))
  }, 200)

}


const popup = document.querySelectorAll('#popup');
const overlay = document.getElementById('backgroundOverlay');
const openButton = document.querySelectorAll('#openOverlay');
document.onclick = function (e) {
  if (e.target.id == 'backgroundOverlay') {
    popup.forEach((item) => {
      item.style.display = 'none';
    })
    overlay.style.display = 'none';
  }
  openButton.forEach((item, index) => {
    if (e.target === item) {
      popup[index].style.display = 'block';
      overlay.style.display = 'block';
    }
  })
};

const text = document.querySelector('.text');
const header = document.querySelector('.header');
const container = document.querySelector('.container');

var state = history.state || {};
var reloadCount = state.reloadCount || 0;

if (performance.navigation.type === 1) {
  state.reloadCount = ++reloadCount;
  history.replaceState(state, null, document.URL);
} else if (reloadCount) {
  delete state.reloadCount;
  reloadCount = 0;
  history.replaceState(state, null, document.URL);
}

if (reloadCount < 1) {
  setTimeout(() => {
    header.style.opacity = '1';
  }, 300)

  setTimeout(() => {
    text.style.top = '-25vh';
    header.style.fontSize = '20px';
    container.style.opacity = '1';
  }, 700)

} else {
  text.style.transition = 'none';
  header.style.transition = 'none';
  header.style.opacity = '1';
  text.style.top = '-25vh';
  header.style.fontSize = '20px';
  container.style.opacity = '1';
}