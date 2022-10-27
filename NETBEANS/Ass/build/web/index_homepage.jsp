<%-- 
    Document   : index_homepage
    Created on : Oct 19, 2022, 9:49:39 PM
    Author     : haiqd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>FPT On Campus Dormitory</title>
    <link rel="stylesheet" href="css/indexstyle_homepage.css">
    <link rel="shortcut icon" type="x-icon" href="img/icon.png">
    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>

</head>

<body style="background-image: url(img/form-background.webp);">
    <div class="navbar">
        <div class="navbar__left">
            <a href="https://daihoc.fpt.edu.vn/" target="_blank"><img src="img/logo.png"
                    alt="logo__FPT__University"></a>
        </div>
        <div class="navbar__right">
            <ul class="tabs">
                <div class="link">
                    <li>Home</li>
                </div>
                <div class="link">
                    <li>About</li>
                </div>
                <div class="link">
                    <li>Contact</li>
                </div>
            </ul>
        </div>
    </div>
    <div class="container">
        <div class="content">
            <div class="login" style="margin-top:20px;">
                <div class="login__left">
                    <img src="img/ban-do-dai-hoc-fpt.jpg" alt="">
                </div>
                <div class="login__right" style="margin-bottom: 10%; margin-left: 200px;">
                    <h1 style="color: #fc873f;">Sign in</h1>
                    <form action="login" method="post">
                        <div class="inputfill">
                            <ion-icon name="person-circle-outline"></ion-icon>
                            <input type="text" name="username" placeholder="Username" required>
                        </div>
                        <div class="inputfill">
                            <ion-icon name="key-outline"></ion-icon>
                            <input type="password" name="password" placeholder="Password" required>

                        </div>
                        <div class="forgotpass">
                            <ul class="tabs">
                                <li style="list-style: none;"><a href="index_resetpass.jsp" style="text-decoration: none;">Forgot Password?</a></li>
                            </ul>
                        </div>
                        <div style="display: flex; justify-content: center; align-items: center;">
                            <span class="front__text" style="margin-right: 15px;"><button type="submit"
                                    class="login__buttum">Login</button></span>
                        </div>
                    </form>
                <div style="text-align: center; color: red">${error}</div>
                </div>
            </div>
        </div>
        <div class="content">
            <div class="about">
                <div class="about__left">
                    <img src="img/aboutme.jpg" alt="aboutme">
                </div>
                <div class="about__right">
                    <h1 style="text-align: center; color: #fc873f;">ABOUT US</h1>
                    <p class="fistline">Introduction in the dormitory management web</p>
                    <p>This software is a project product of PRJ subject, by students <a
                            href="https://linktr.ee/__nameishai" target="_blank">Vũ Đào Ngọc Hải</a>,<br>
                        Developer/BE/FE,student ID number HE160490, student of course K16, majoring in SE.
                    </p>
                    <p>Mentor: <a href="https://www.facebook.com/groups/883448222623395/user/1759471669/"
                            target="_blank">Tiện Đình Tá</a>.</p>
                </div>
            </div>
        </div>
        <div class="content">
            <div class="contact">
                <h2 style="position: absolute; left: 43vw; white-space: nowrap; font-size: 3em; color: #f36b17;">Contact
                    Us
                </h2>
                <div class="send__mess" style="white-space: nowrap">
                    <p style="font-weight: 600; font-size: 20px; color: #fc873f; text-align: center;">Send a Message</p>
                    <form action="https://formsubmit.co/08495d4d83702164073aa3d8f04bf6ef" method="POST">
                        <div class="line1">
                            <div class="col">
                                <p>Name</p>
                                <div class="inputfill"><input type="text" name="name" id="name"
                                        placeholder="Vũ Đào Ngọc Hải" required></div>
                            </div>
                            <div class="col">
                                <p>Student ID</p>
                                <div class="inputfill"><input type="text" name="idSV" id="idSV" placeholder="HE160490"
                                        required>
                                </div>
                            </div>
                        </div>
                        <div class="line2">
                            <div class="col">
                                <p>Email</p>
                                <div class="inputfill"><input type="email" name="email" id="email"
                                        placeholder="Ex:haivdnhe160490@fpt.edu.vn" required></div>
                            </div>
                            <div class="col">
                                <p>Phone Number</p>
                                <div class="inputfill"><input type="tel" name="phone" id="phone"
                                        placeholder="0123456789" required>
                                </div>
                            </div>
                        </div>
                        <div class="line3">
                            <p>Message</p><textarea name="message" id="message" cols="30" rows="10"
                                placeholder="Write your message here..." required></textarea>
                        </div>
                        <span class="front__text"><button type="submit" class="send__buttum">Send</button></span>
                    </form>
                </div>
                <div class="contact__info" style="white-space: nowrap;">
                    <p style="font-weight: 600; font-size: 20px; color: #fc873f; text-align: center;">Contact Info</p>
                    <div class="infomation">
                        <span class="icon">
                            <ion-icon name="location"></ion-icon>
                        </span>
                        <span>Đất Thổ Cư Hòa Lạc, Km29 Đường Cao Tốc 08,<br> Thạch Hoà, Thạch Thất, Hà Nội 10000,
                            Vietnam.
                        </span>
                    </div>
                    <div class="infomation">
                        <span class="icon">
                            <ion-icon name="mail"></ion-icon>
                        </span>
                        <span><a href="mailto:haivdnhe160490@fpt.edu.vn">haivdnhe160490@fpt.edu.vn</a></span>
                    </div>
                    <div class="infomation">
                        <span class="icon">
                            <ion-icon name="call"></ion-icon>
                        </span>
                        <span><a href="tel:+84961718609">+84961718609</a></span>
                    </div>
                    <div class="infomation">
                        <span class="icon">
                            <ion-icon name="unlink"></ion-icon>
                        </span>
                        <span><a href="https://linktr.ee/__nameishai" target="_blank">Vũ Đào Ngọc Hải</a></span>
                    </div>
                </div>
                <div class="map">
                    <iframe
                        src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d8021.277888228767!2d105.5261212!3d21.0122247!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31345b465a4e65fb%3A0xaae6040cfabe8fe!2sFPT%20University!5e1!3m2!1sen!2s!4v1665485452343!5m2!1sen!2s"
                        style="border:0;" allowfullscreen="" loading="lazy"
                        referrerpolicy="no-referrer-when-downgrade">
                    </iframe>
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
<script src="https://smtpjs.com/v3/smtp.js"></script>


</html>