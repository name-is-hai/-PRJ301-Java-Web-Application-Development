<%-- 
    Document   : index_residenthistory
    Created on : Oct 27, 2022, 2:38:42 PM
    Author     : haiqd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Room History-FPT On Campus</title>
    <link rel="shortcut icon" type="x-icon" href="img/icon.png">
    <link rel="stylesheet" href="css/indexstyle_residenthistory.css">
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
                                        <a href="index_studentboard.html">
                                            Home
                                        </a>
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
    <div class="resident_history">
        <h1 style="text-align: center;">Resident History</h1>
        <table>
            <tr>
                <th>StudentId</th>
                <th>Bed Information</th>
                <th>Date Check in</th>
                <th>Date Check Out</th>
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
</body>

</html>
