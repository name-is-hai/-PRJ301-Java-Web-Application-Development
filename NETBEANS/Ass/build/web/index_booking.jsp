<%-- 
    Document   : index_booking
    Created on : Oct 27, 2022, 2:37:11 PM
    Author     : haiqd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Booking Room-FPT On Campus</title>
    <link rel="shortcut icon" type="x-icon" href="img/icon.png">
    <link rel="stylesheet" href="css/indexstyle_booking.css">
    <script src="http://code.jquery.com/jquery-3.6.1.min.js"></script>
    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</head>
<script>
    $(document).ready(function () {
        $(".hamburger_wrap").click(function () {
            $(this).parent().toggleClass("active");
            $(".dd_list").toggleClass("active");
        });
    });
</script>

<body>
    <div class="navbar">
        <div class="navbar__left">
            <a href="https://daihoc.fpt.edu.vn/" target="_blank"><img src="img/logo.png"
                    alt="logo__FPT__University"></a>
        </div>
        <div class="navbar__right">
            <p>Xin chào haivdnhe160490</p>
            <div class="wrapper">
                <div class="dd_wrap">
                    <div class="hamburger_wrap">
                        <div></div>
                        <div></div>
                        <div></div>
                    </div>
                    <div class="dd_list">
                        <ul>
                            <li>
                                <div class="icon">
                                    <ion-icon name="home"></ion-icon>
                                </div>
                                <div class="text">
                                    <p>
                                        <a href="index_studentboard.html">Home</a>
                                    </p>
                                </div>
                            </li>
                            <li>
                                <div class="icon">
                                    <ion-icon name="person-circle"></ion-icon>
                                </div>
                                <div class="text">
                                    <p>
                                        <a href="">Profile</a>
                                    </p>
                                </div>
                            </li>
                            <li>
                                <div class="icon">
                                    <ion-icon name="call"></ion-icon>
                                </div>
                                <div class="text">
                                    <p>
                                        <a href="">Contact</a>
                                    </p>
                                </div>
                            </li>
                            <li>
                                <div class="icon">
                                    <ion-icon name="log-out"></ion-icon>
                                </div>
                                <div class="text">
                                    <p><a href="">Log Out</a></p>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <hr style="margin: 0 10px;">
    <div class="booking">
        <div class="booking_header" style="text-align: center;">
            <h1>Reservations</h1>
        </div>
        <div class="booking_body">
            <div class="booking_body_top">
                <div class="card">
                    <div class="card-img"><img src="img/1 people.jpg" alt=""></div>
                    <div class="card-info">
                        <form action="">
                            <p class="text-title">1 Bed</p>
                            <p class="text-body">Lorem Ipsum dolor sit amet</p>
                            <button class="card-button" type="submit">Book Now</button>
                        </form>
                    </div>
                </div>

                <div class="card">
                    <div class="card-img"><img src="img/2 people.jpg" alt=""></div>
                    <div class="card-info">
                        <form action="">
                            <p class="text-title">2 Bed</p>
                            <p class="text-body">Lorem Ipsum dolor sit amet</p>
                            <button class="card-button" type="submit">Book Now</button>
                        </form>
                    </div>
                </div>

                <div class="card">
                    <div class="card-img"><img src="img/3 people.jpg" alt=""></div>
                    <div class="card-info">
                        <form action="">
                            <p class="text-title">3 Bed</p>
                            <p class="text-body">Lorem Ipsum dolor sit amet</p>
                            <button class="card-button" type="submit">Book Now</button>
                        </form>
                    </div>
                </div>
            </div>
            <div class="booking_body_bottom">
                <div class="card">
                    <div class="card-img"><img src="img/4 people.jpg" alt=""></div>
                    <div class="card-info">
                        <form action="">
                            <p class="text-title">4 Bed</p>
                            <p class="text-body">Lorem Ipsum dolor sit amet</p>
                            <button class="card-button" type="submit">Book Now</button>
                        </form>
                    </div>
                </div>
                <div class="card">
                    <div class="card-img"><img src="img/5 people.jpg" alt=""></div>
                    <div class="card-info">
                        <form action="">
                            <p class="text-title">5 Bed</p>
                            <p class="text-body">Lorem Ipsum dolor sit amet</p>
                            <button class="card-button" type="submit">Book Now</button>
                        </form>
                    </div>
                </div>
                <div class="card">
                    <div class="card-img"><img src="img/6 people.jpg" alt=""></div>
                    <div class="card-info">
                        <form action="">
                            <p class="text-title">6 Bed</p>
                            <p class="text-body">Lorem Ipsum dolor sit amet</p>
                            <button class="card-button" type="submit">Book Now</button>
                        </form>
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
<script src="js/app_booking.js"></script>

</html>
