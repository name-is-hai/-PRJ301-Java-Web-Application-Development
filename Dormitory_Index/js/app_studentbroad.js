$(document).ready(function () {
    $(".hamburger_wrap").click(function () {
        $(this).parent().toggleClass("active");
        $(".dd_list").toggleClass("active");
    });
});
