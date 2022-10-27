<%-- 
    Document   : EditProduct
    Created on : Oct 24, 2022, 10:29:19 AM
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
        <form action="Edit" method="post">
            Code:<input type="text" name="code" value="${code}" readonly=""><br>
            Name:<input type="text" name="name" value="${name}"><br>
            Price:<input type="text" name="price" value="${price}">
            <input type="submit" name="submitbutton" value="Update">
            <input type="submit" name="submitbutton" value="Delete">
        </form>
    </body>
</html>
