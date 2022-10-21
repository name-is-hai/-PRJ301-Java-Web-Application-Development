<%-- 
    Document   : login
    Created on : Sep 30, 2022, 9:43:27 AM
    Author     : haiqd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="login" method="POST" style="margin:auto">
            <span>Username:</span><input type="text" name="acc" value="${account}"><br><br>
            <span>Password:</span><input type="text" name="pass" value="${pass}"><br><br>
            <input type="submit" value="LOGIN" name="login">
        </form>
        <a href="Regester.jsp">Regester</a>
        <a href="ForgotPassword.jsp">Forgot Password???</a>
    </body>
</html>
