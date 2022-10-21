<%-- 
    Document   : index_studentboard
    Created on : Oct 19, 2022, 9:52:53 PM
    Author     : haiqd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Board-FPT On Campus Dormitory</title>
    <link rel="shortcut icon" type="x-icon" href="img/icon.png">
    <link rel="stylesheet" href="css/indexstyle_studentbroad.css">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<script>
    $(document).ready(function () {
        $(".wrapper .btn").click(function () {
            $(this).toggleClass("active");
            $(".menu").toggleClass("active");
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
                <div class="contaniner">
                    <div class="btn">
                        <div class="one"></div>
                        <div class="two"></div>
                        <div class="three"></div>
                    </div>
                    <div class="menu">
                        <ul>
                            <div class="link">
                                <ion-icon name="home-outline"></ion-icon>
                                <li> Home </li>
                            </div>
                            <div class="link">
                                <ion-icon name="person-circle-outline"></ion-icon>
                                <li> Profile </li>
                            </div>
                            <div class="link">
                                <ion-icon name="reader-outline"></ion-icon>
                                <li> About </li>
                            </div>
                            <div class="link">
                                <ion-icon name="call-outline"></ion-icon>
                                <li> Contact </li>
                            </div>
                            <div class="link">
                                <ion-icon name="wallet-outline"></ion-icon>
                                <li> Wallet </li>
                            </div>
                            <div class="link">
                                <ion-icon name="log-out-outline"></ion-icon>
                                <li> Log Out </li>
                            </div>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <hr style="margin: 0 10px;">
    <div class="studentBoard">
        <div class="studentBoard__header">
            <h1>Student Board</h1>
            <p style="color: orangered;">Please contact us at ktx@fpt.edu.vn if you have any question</p>
        </div>
        <div class="studentBoard__Body">
            <div class="studentBoard__Body__left">
                <table>
                    <tr>
                        <th>Actions</th>
                    </tr>
                    <tr>
                        <td>Resident History</td>
                    </tr>
                    <tr>
                        <td>Book a bed</td>
                    </tr>
                    <tr>
                        <td>View Monthly Electric / Water Usage</td>
                    </tr>
                    <tr>
                        <td>Cost</td>
                    </tr>
                    <tr>
                        <td>Request</td>
                    </tr>

                </table>
            </div>
            <div class="studentBoard__Body__right">
                <table>
                    <tr>
                        <th>Notification</th>
                    </tr>
                    <tr>
                        <td>Your gender information at FAP system: Nam(Male), if this information is not correct, please
                            contact Academic staff.</td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
</body>
<script src="js/app_studentbroad.js"></script>
<script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>

</html>
