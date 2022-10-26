const selected = document.querySelector(".selected");
const optionsContainer = document.querySelector(".option-container");
const optionsList = document.querySelectorAll(".option")

const element = document.querySelector('#changepic');

selected.addEventListener("click", () => {
    optionsContainer.classList.toggle("active");
});

optionsList.forEach(o => {
    o.addEventListener("click", () => {
      selected.innerHTML = o.querySelector("label").innerHTML;
      optionsContainer.classList.remove("active");
    });
  });

  