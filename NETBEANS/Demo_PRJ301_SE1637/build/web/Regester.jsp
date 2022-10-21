<%-- 
    Document   : Regester
    Created on : Oct 12, 2022, 11:36:31 AM
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
        <h1>Regester</h1>
        <form action="regester" method="post">
            Account: <input type="text" name="acc" value="${account}"><br>
            Password: <input type="text" name="pass" ><br>
            Name: <input type="text" name="name" ><br>
            Gender: <input type="radio" name="gender" value="1">Male <input type="radio" name = "gender" value="2">Female<br>
            Birthdate: <input type="text" name="dob" ><br>
            Address: <input type="text" name="address" ><br>
            <input type="submit" value="REGISTER" name="REGISTER">
        </form>
    </body>
</html>
