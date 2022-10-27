<%-- 
    Document   : ListProduct
    Created on : Oct 21, 2022, 10:17:57 AM
    Author     : haiqd
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Product"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            ArrayList<Product> listProduct = new ArrayList<>();
            if(request.getAttribute("listProduct") != null){
                listProduct = (ArrayList<Product>)request.getAttribute("listProduct");
            }
        %>
        <h1><a href="AddProduct.jsp">Add Product</a></h1>
        List Product:
            <table border = "1">
            <tr>
                <td>ProductId</td>
                <td>ProductName</td>
                <td>UnitPrice</td>
                <td>UnitsInstock</td>
                <td>Image</td>
            </tr>
            <c:forEach items="${listProduct}" var="item">
                <tr>
                    <td>${item.getCode()}</td>
                    <td>${item.getName()}</td>
                    <td>${item.getPrice()}</td>
                    <td>${item.getUnitsInStock()}</td>
                    <td><img src="images/${item.getImage()}" alt="alt" style="width: 80px; height: 80px" /></td>
                    <td><a href="Edit?mod=0&id=${item.getCode()}">Update</a></td>
                    <td><a href="Edit?mod=1&id=${item.getCode()}">Delete</a></td>
                    
                </tr>
            </c:forEach>
    </body>
</html>
