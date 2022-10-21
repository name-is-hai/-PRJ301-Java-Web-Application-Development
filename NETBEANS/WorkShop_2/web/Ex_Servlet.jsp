<%-- 
    Document   : Ex_Servlet
    Created on : Sep 29, 2022, 10:41:13 PM
    Author     : haiqd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vũ Đào Ngọc Hải</title>
        <style>
            .display {
                display: block !important;
            }

            table.main {
                width:100%;
                height:600px;
                border:1px solid black;
            }

            table.main #logo{
                background:Blue;
                width:15%;
                height:15%;
            }
            table.main #banner{
                width:85%;
                height:15%;
            }
            table.main #menu1{
                background:Red;
                width:15%;
                height:70%;
                font-size:22;
                text-align:top;
            }
            table.main #menu1 li {
                /*list-style-type: none;*/
                list-style-position: inside;
                cursor: pointer;
                /*color: #fff;*/
                user-select: none;
            }
            table.main #menu1 li.active {
                font-weight: 700;
            }
            table.main #content1{
                background:yellow;
                width:85%;
                height:70%;
            }
            
            table.main #content1 #wrapper {
                display: flex;
                justify-content: center;
                align-items: center;
            }

            .myForm {
                display: none;
            }

            table.main #footer1{
                background:green;
                width:100%;
                height:15%;
            }
        </style>
    </head>
    <body>
        <table class='main'>
            <tr>
                <td id='logo'><img src='images/logo.jpg'></td>
                <td id='banner' background='images/banner2.jpg'></td>
            </tr>

            <tr>
                <%
                    String type = "1";
                    if (request.getAttribute("type") != null) {
                        type = request.getAttribute("type") + "";                                   
                    }                    
                %>
                <td id='menu1'>
                    <ul>
                        <li id="1" class="<%if (type.equals("1")) {%>active<%}%>">Exercise 1</li>
                        <li id="2" class="<%if (type.equals("2")) {%>active<%}%>">Exercise 2</li>
                        <li id="3" class="<%if (type.equals("3")) {%>active<%}%>">Exercise 3</li>
                        <li id="4" class="<%if (type.equals("4")) {%>active<%}%>">Exercise 4</li>
                        <li id="5" class="<%if (type.equals("5")) {%>active<%}%>">Exercise 5</li>
                        <li id="6" class="<%if (type.equals("6")) {%>active<%}%>">Exercise 6</li>
                    </ul>
                </td>
                <td id='content1'>                    
                    <div id="wrapper">  
                        <!--Form 1-->
                        <div id="form1" class="myForm <%if (type.equals("1")) {%>display<%}%>" style="width: 30%; text-align: center;">
                            <%@include file="Ex1.jsp" %>
                        </div>                        

                        <!--Form 2-->                        
                        <div id="form2" class="myForm <%if (type.equals("2")) {%>display<%}%>" style="width: 30%; text-align: center">
                            <%@include file="Ex2.jsp" %>
                        </div>

                        <!--Form 3-->
                        <div id="form3" class="myForm <%if (type.equals("3")) {%>display<%}%>" style="width: 30%; text-align: center">
                            <%@include file="Ex3.jsp" %>
                        </div>

                        <!--Form 4-->
                        <div id="form4" class="myForm <%if (type.equals("4")) {%>display<%}%>" style="width: 30%; text-align: center">
                            <%@include file="Ex4.jsp" %>
                        </div>

                        <!--Form 5-->
                        <div id="form5" class="myForm <%if (type.equals("5")) {%>display<%}%>" style="width: 50%; text-align: center">
                            <%@include file="Ex5.jsp" %>
                        </div>

                        <!--Form 6-->
                        <div id="form6" class="myForm <%if (type.equals("6")) {%>display<%}%>" style="width: 30%; text-align: center">
                            <%@include file="Ex6.jsp" %>
                        </div>
                    </div>
                </td>
            </tr>

            <tr id='footer1'>
                <td colspan='2' align='center'>©Copyright by Vũ Đào Ngọc Hải</td>	
            </tr>
        </table>


        <script>
            const menu = document.querySelector("#menu1");
            const list = menu.querySelectorAll("li");
            const forms = document.querySelectorAll(".myForm");

            function myClear(x) {
                let inputs = x.querySelectorAll("input[type=text]");
                for (let y of inputs) {
                    y.value = "";
                }
                inputs = x.querySelectorAll("textarea");
                for (let y of inputs) {                       
                    y.value = "";
                }
            }

            for (let li of list) {
                li.addEventListener("click", function (e) {
                    e.target.classList.add("active");
                    for (let i of list) {
                        if (i !== e.target) {
                            i.classList.remove("active");
                        }
                    }
                    for (let x of forms) {
                        if (x.id.includes(e.target.id)) {
                            x.classList.add("display");
                            myClear(x);
                        } else {
                            x.classList.remove("display");
                        }
                    }
                });
            }
        </script>
    </body>
</html>