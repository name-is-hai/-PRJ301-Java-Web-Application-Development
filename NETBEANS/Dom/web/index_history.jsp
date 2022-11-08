<%-- 
    Document   : index_history
    Created on : Oct 31, 2022, 11:37:37 PM
    Author     : haiqd
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title>FPT Dormity On Campus</title>
        <link rel="shortcut icon" type="x-icon" href="img/icon.png">
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style_history.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js"
                integrity="sha512-aVKKRRi/Q/YV+4mjoKBsE4x3H+BkegoM/em46NNlCqNTmUYADjBbeNefNxYV7giUp0VxICtqdrbqU7iVaeZNXA=="
        crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
    </head>

    <body>
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
                <h1>Resident History</h1>
            </div>
        </div>
        <div class="container">
            <div class="table">
                <table>
                    <tr>
                        <th>StudentID</th>
                        <th>Bed Information</th>
                        <th>Date Checkin</th>
                        <th>Date CheckOut</th>
                        <th>Bed Price</th>
                        <th>Semester</th>
                        <th>Year Of Semester</th>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>2</td>
                        <td>3</td>
                        <td>4</td>
                        <td>5</td>
                        <td>6</td>
                        <td>7</td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>2</td>
                        <td>3</td>
                        <td>4</td>
                        <td>5</td>
                        <td>6</td>
                        <td>7</td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>2</td>
                        <td>3</td>
                        <td>4</td>
                        <td>5</td>
                        <td>6</td>
                        <td>7</td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>2</td>
                        <td>3</td>
                        <td>4</td>
                        <td>5</td>
                        <td>6</td>
                        <td>7</td>
                    </tr>
                </table>
            </div>
        </div>
        <div class="footer">
            © Copyright 2022 - FPT Education | Developed by
            <a target="_blank" href="https://linktr.ee/__nameishai"> Vũ Đào Ngọc Hải</a>
        </div>
    </body>
    <script src="js/app_history.js"></script>

</html>
