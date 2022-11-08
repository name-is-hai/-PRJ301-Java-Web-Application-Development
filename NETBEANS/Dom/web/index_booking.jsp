<%-- 
    Document   : index_booking
    Created on : Oct 31, 2022, 11:34:47 PM
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
        <link rel="stylesheet" href="css/style_booking.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js"
                integrity="sha512-aVKKRRi/Q/YV+4mjoKBsE4x3H+BkegoM/em46NNlCqNTmUYADjBbeNefNxYV7giUp0VxICtqdrbqU7iVaeZNXA=="
        crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
    </head>

    <body>
    <c:if test="${mess != null}"><%@include  file="PopUp.jsp"%></c:if>
    <header>
        <div class="logo">
            <img src="img/logo.png" alt="">
        </div>
        <div class="menu_icon">
            <div class="icon">
                <img src="img/Profile/${sessionScope.Student.getImg()}" alt="">
            </div>
            <nav class="menu">
                <div class="logo">
                    <img src="img/logo.png" alt="">
                </div>
                <div class="icon_close"><img src="img/arrow-down.svg" alt=""></div>
                    <div class="banner">
                        <h1 class="banner__title">Hello ${sessionScope.Student.getName()}</h1>
                    </div>
                    <ul>
                        <li><a class="nav-link " href="menu">Home</a></li>
                        <li><a class="nav-link " href="#">Profile</a></li>
                        <li><a class="nav-link " href="#">Wallet</a></li>
                        <li><a class="nav-link " href="logout">Log Out</a></li>
                    </ul>
            </nav>
        </div>
    </header>
    <div id="background-pattern"></div>
    <div id="background-image" style="background-image: url(img/form-background.webp);">
    </div>
    <div class="text">
        <div class="header">
            <h1>Book Room</h1>
        </div>
    </div>
    <div class="container">
        <div class="booking_body">
            <div class="card s1">
                <div class="card-img"><img src="img/1 people.jpg" alt=""></div>
                <div class="card-info">
                    <form action="booking" method="post">
                        <p class="text-title">1 Bed</p>
                        <p class="text-body">Lorem Ipsum dolor sit amet</p>
                        <button class="card-button" type="submit">Book Now</button>
                    </form>
                </div>
            </div>
            <div class="card s2">
                <div class="card-img"><img src="img/2 people.jpg" alt=""></div>
                <div class="card-info">
                    <form action="booking" method="post">
                        <p class="text-title">2 Bed</p>
                        <p class="text-body">Lorem Ipsum dolor sit amet</p>
                        <button class="card-button" type="submit">Book Now</button>
                    </form>
                </div>
            </div>
            <div class="card s3">
                <div class="card-img"><img src="img/3 people.jpg" alt=""></div>
                <div class="card-info">
                    <form action="booking" method="post">
                        <p class="text-title">3 Bed</p>
                        <p class="text-body">Lorem Ipsum dolor sit amet</p>
                        <button class="card-button" type="submit">Book Now</button>
                    </form>
                </div>
            </div>
            <div class="card s4">
                <div class="card-img"><img src="img/4 people.jpg" alt=""></div>
                <div class="card-info">
                    <form action="booking" method="post">
                        <p class="text-title">4 Bed</p>
                        <p class="text-body">Lorem Ipsum dolor sit amet</p>
                        <button class="card-button" type="submit">Book Now</button>
                    </form>
                </div>
            </div>
            <div class="card s5">
                <div class="card-img"><img src="img/5 people.jpg" alt=""></div>
                <div class="card-info">
                    <form action="booking" method="post">
                        <p class="text-title">5 Bed</p>
                        <p class="text-body">Lorem Ipsum dolor sit amet</p>
                        <button class="card-button" type="submit">Book Now</button>
                    </form>
                </div>
            </div>
            <div class="card s6">
                <div class="card-img"><img src="img/6 people.jpg" alt=""></div>
                <div class="card-info">
                    <form action="booking" method="post">
                        <p class="text-title">6 Bed</p>
                        <p class="text-body">Lorem Ipsum dolor sit amet</p>
                        <button class="card-button" type="submit">Book Now</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <div class="footer">
        © Copyright 2022 - FPT Education | Developed by
        <a target="_blank" href="https://linktr.ee/__nameishai"> Vũ Đào Ngọc Hải</a>
    </div>
</body>
<script src="js/app_booking.js"></script>

</html>
