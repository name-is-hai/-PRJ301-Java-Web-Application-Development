<%-- 
    Document   : index_homepage
    Created on : Oct 31, 2022, 11:33:14 PM
    Author     : haiqd
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

    <head>
        <title>FPT Dormity On Campus</title>
        <link rel="shortcut icon" type="x-icon" href="img/icon.png">
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Bitter&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="css/style_homepage.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js"
                integrity="sha512-aVKKRRi/Q/YV+4mjoKBsE4x3H+BkegoM/em46NNlCqNTmUYADjBbeNefNxYV7giUp0VxICtqdrbqU7iVaeZNXA=="
        crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
    </head>

    <body style="background-image: url(img/form-background.webp);">
            <div class="intro">
                <h1 class="logo-header">
                    <span class="logo"><img src="img/logo_intro1.png" alt=""></span><span class="logo"><img
                            src="img/logo_intro2.png" alt=""></span>
                </h1>
            </div>
        <c:if test="${mess != null}"><%@include  file="PopUp.jsp"%></c:if>
        <header>
            <img src="img/logo.png" alt="">
            <div class="navbar">
                <nav>
                    <div class="underline"></div>
                    <div class="underline"></div>
                    <div class="underline"></div>
                    <a onClick="ul(0)" class="tab">Home</a>
                    <a onClick="ul(1)" class="tab">About</a>
                    <a onClick="ul(2)" class="tab">Contact</a>
                </nav>
            </div>
        </header>
        <div class="container">
            <div class="content">
                <div class="login">
                    <div class="square" style="--i:0"></div>
                    <div class="square" style="--i:1"></div>
                    <div class="square" style="--i:2"></div>
                    <div class="square" style="--i:3"></div>
                    <div class="square" style="--i:4"></div>
                    <div class="container">
                        <!-- Sign In -->
                        <div class="container__form container--signin">
                            <form action="login" method="post" class="form" id="form2">
                                <h2 class="form__title">Sign In</h2>
                                <input type="text" placeholder="Username" class="input" name="acc" required=""/>
                                <input type="password" placeholder="Password" class="input" name="pass" required=""/>
                                <a href="#" class="link">Forgot your password?</a>
                                <button class="btn" type="submit">Sign In</button>
                            </form>
                        </div>
                        <!-- Sign Up -->
                        <div class="container__form container--signup">
                            <form action="#" class="form" id="form1">
                                <h2 class="form__title">Sign Up</h2>
                                <input type="text" placeholder="User" class="input" name="acc" required=""/>
                                <input type="email" placeholder="Email" class="input" name="email" required=""/>
                                <input type="password" placeholder="Password" class="input" name="pass" required=""/>
                                <button class="btn" type="submit">Sign Up</button>
                            </form>
                        </div>
                        <!-- Overlay -->
                        <div class="container__overlay">
                            <div class="overlay">
                                <div class="overlay__panel overlay--left">
                                    <button class="btn" id="signIn">Sign In</button>
                                </div>
                                <div class="overlay__panel overlay--right">
                                    <button class="btn" id="signUp">Sign Up</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="content">
                <div class="about">
                    <div class="square" style="--i:0"></div>
                    <div class="square" style="--i:1"></div>
                    <div class="square" style="--i:2"></div>
                    <div class="square" style="--i:3"></div>
                    <div class="square" style="--i:4"></div>
                    <div class="square" style="--i:5"></div>
                    <div class="square" style="--i:6"></div>
                    <div class="about_left">
                        <div class="card">
                            <div class="card-liner">
                                <figure><img src="img/aboutme.jpg" alt="" /></figure>
                                <div class="card--social">
                                    <ul>
                                        <li class="twitter"><a href="https://discord.gg/x8rrXfF3" target="_blank">
                                                <ion-icon name="logo-discord"></ion-icon>
                                            </a></li>
                                        <li class="linkedin"><a href="https://github.com/namishai" target="_blank">
                                                <ion-icon name="logo-github"></ion-icon>
                                            </a></li>
                                    </ul>
                                </div>
                                <div class="card--title">
                                    <h3>Vũ Đào Ngọc Hải</h3>
                                    <p>Web Developer</p>
                                </div>
                                <div class="card--desc">
                                    <hr />
                                    <p>Coffee, code, repeat... he doesn't eat food, and only stops to defend the Imortal
                                        Valorant player.</p>
                                </div>
                                <div class="card--btn">
                                    <a target="_blank" href="https://linktr.ee/__nameishai">
                                        <span class="moreinfo"><i class="fa fa-info-circle"></i> More Info</span>
                                        <span class="fullprof">View Full Profile</span>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="about_right">
                        <div class="card">
                            <div class="card-liner">
                                <figure><img src="img/Ta dinh tien.jpg" alt="" /></figure>
                                <div class="card--social">
                                    <ul>
                                        <li class="twitter"><a href="https://www.facebook.com/tien.ta.311" target="_blank">
                                                <ion-icon name="logo-discord"></ion-icon>
                                            </a></li>
                                        <li class="linkedin"><a href="https://www.facebook.com/tien.ta.311" target="_blank">
                                                <ion-icon name="logo-github"></ion-icon>
                                            </a></li>
                                    </ul>
                                </div>
                                <div class="card--title">
                                    <h3>Tạ Đình Tiến</h3>
                                    <p>Mentor</p>
                                </div>
                                <div class="card--desc">
                                    <hr />
                                    <p>Coffee, code, repeat... he doesn't eat food, and only stops to defend the table
                                        tennis crown.
                                    </p>
                                </div>
                                <div class="card--btn">
                                    <a target="_blank" href="https://www.facebook.com/tien.ta.311">
                                        <span class="moreinfo"><i class="fa fa-info-circle"></i> More Info</span>
                                        <span class="fullprof">View Full Profile</span>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="content">
                <div class="contact">
                    <div class="square" style="--i:0"></div>
                    <div class="square" style="--i:1"></div>
                    <div class="square" style="--i:2"></div>
                    <div class="square" style="--i:3"></div>
                    <div class="square" style="--i:4"></div>
                    <div class="square" style="--i:5"></div>
                    <div class="square" style="--i:6"></div>
                    <div class="contact_left">
                        <p>Connect with us</p>
                    </div>
                    <div class="contact_right">
                        <p>SEND US AN E-MAIL</p>
                        <a href="mailto:haivdnhe160490@fpt.edu.com">haivdnhe160490@fpt.edu.com</a>
                        <p>CALL US</p>
                        <a href="tel:+84961718609">+84961718609</a>
                        <div class="contact_bot">
                            <br>
                            <div class="line"></div>
                            <p>Offices</p>
                            <div class="location">
                                <div class="infor">
                                    <h3>Hà Nội</h3>
                                    <span>Đất Thổ Cư Hòa Lạc, Km29 Đường Cao Tốc 08</span>
                                    <span>Thạch Hoà, Thạch Thất, Hà Nội 10000, Vietnam</span>
                                    <span>+84 24 7300 5588</span>
                                </div>
                                <div class="location_addr">
                                    <a href="https://goo.gl/maps/49jQyVFNRU6mwovx9" target="_blank"><img src="img/map.png"
                                                                                                         alt=""></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="footer">
            © Copyright 2022 - FPT Education | Developed by
            <a target="_blank" href="https://linktr.ee/__nameishai"> Vũ Đào Ngọc Hải</a>
        </div>
    </body>
    <script src="js/app_homepage.js"></script>

</html>
