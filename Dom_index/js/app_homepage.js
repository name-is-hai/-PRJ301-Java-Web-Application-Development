//intro
const intro = document.querySelector('.intro');
const logo = document.querySelector('.logo-header');
const logoSpan = document.querySelectorAll('.logo');

// window.addEventListener('DOMContentLoaded', ()=>{
//     setTimeout(()=>{
//         logoSpan.forEach((span, idx)=>{
//             setTimeout(()=>{
//                 span.classList.add('active');
//             }, (idx +1) * 600)
//         });

//         setTimeout(()=>{
//             logoSpan.forEach((span, idx)=>{
//                 setTimeout(()=>{
//                     span.classList.remove('active');
//                     span.classList.add('fade');
//                 }, (idx +1) * 50)
//             })
//         }, 2200); 

//         setTimeout(()=>{
//             intro.style.top = '-100vh';
//         }, 2300)

//     })
// })

var state = history.state || {};
var reloadCount = state.reloadCount || 0;
if (performance.navigation.type === 1) { // Reload
    state.reloadCount = ++reloadCount;
    history.replaceState(state, null, document.URL);
} else if (reloadCount) {
    delete state.reloadCount;
    reloadCount = 0;
    history.replaceState(state, null, document.URL);
}
if (reloadCount < 1) {
    setTimeout(()=>{
        logoSpan.forEach((span, idx)=>{
            setTimeout(()=>{
                span.classList.add('active');
            }, (idx +1) * 600)
        });

        setTimeout(()=>{
            logoSpan.forEach((span, idx)=>{
                setTimeout(()=>{
                    span.classList.remove('active');
                    span.classList.add('fade');
                }, (idx +1) * 50)
            })
        }, 2200); 

        setTimeout(()=>{
            intro.style.top = '-100vh';
        }, 2300)

    })
}else{
    intro.style.transition = 'none';
    intro.style.top = '-100vh';
}

//img background
document.onmousemove = function(a){
    var x = (a.pageX * -1/15);
    var y = (a.pageY * -1/15);
    console.log(x);
    console.log(y);
    document.body.style.backgroundPositionX = x + "px";
    document.body.style.backgroundPositionY = y + "px";
}

function ul(index) {
	console.log('click!' + index)
	
	var underlines = document.querySelectorAll(".underline");

	for (var i = 0; i < underlines.length; i++) {
		underlines[i].style.transform = 'translate3d(' + index * 100 + '%,0,0)';
	}
}

//tab navbar
const tabs = document.querySelectorAll(".tab");
const contents = document.querySelectorAll(".content");

tabs.forEach((tab, index) => {
    tab.addEventListener("click", () => {
        tabs.forEach((tab) => tab.classList.remove("active"));
        tab.classList.add("active");

        contents.forEach((c) => c.classList.remove("active"));
        contents[index].classList.add("active");
    });
});

tabs[0].click();

//form sign in & sign up
const signInBtn = document.getElementById("signIn");
const signUpBtn = document.getElementById("signUp");
const fistForm = document.getElementById("form1");
const secondForm = document.getElementById("form2");
const container = document.querySelector(".login .container");

signUpBtn.addEventListener("click", () => {
    container.classList.add("right-panel-active");
});
signInBtn.addEventListener("click", () => {
	container.classList.remove("right-panel-active");
});
