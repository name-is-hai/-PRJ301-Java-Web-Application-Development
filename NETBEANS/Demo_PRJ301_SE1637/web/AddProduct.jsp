<%-- 
    Document   : AddProduct
    Created on : Oct 27, 2022, 8:57:24 PM
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
        Add Product
        <form action="add" method="post">
            ProductID <input type="text" name="id"><br>
            ProductName <input type="text" name="name" ><br>
            UnitPrice <input type="text" name="price" ><br>
            UnitsInstock <input type="text" name="stock" ><br>
            Image <input type="text" name="img" ><br>
            CategoryID <input type="text" name="category" ><br>
            Discontinued <input type="text" name="discontinued" ><br>
            <input type="submit" value="Add New Product" name="add">
        </form>
    </body>
</html>
