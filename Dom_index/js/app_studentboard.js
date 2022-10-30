const menu = document.getElementById("menu");

Array.from(document.getElementsByClassName("menu-item"))
  .forEach((item, index) => {
    item.onmouseover = () => {
      menu.dataset.activeIndex = index;
    }
  });

const menu_icon = document.querySelector(".menu_icon .icon");
const menu_icon_close = document.querySelector(".menu_icon  .icon_close");
const menu1 = document.querySelector(".menu_icon .menu");
const navLinks = Array.from(document.querySelectorAll(".nav-link"));
// const tabs = document.querySelectorAll(".nav-link");
const banner = document.querySelector(".banner__title");
console.log(banner);

menu_icon.addEventListener("click", openMenu);
menu_icon_close.addEventListener("click", closeMenu);

function openMenu(){
  menu1.classList.add("active");
  banner.classList.add("active");
  navLinks.forEach((link, index)=>{
    setTimeout(()=>{
      link.classList.add("active");
    }, index * 200)
  })
}

function closeMenu(){
  menu1.classList.remove("active");
  banner.classList.remove("active");
    setTimeout(()=>{
      navLinks.forEach(link => link.classList.remove("active"))
    }, 200)
  
}

// tabs.forEach((tab, index) => {
//   tab.addEventListener("click", () => {
//       tabs.forEach((tab) => tab.classList.remove("active-link"));
//       tab.classList.add("active-link");
//   });
// });