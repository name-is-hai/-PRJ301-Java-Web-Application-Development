<%-- 
    Document   : index
    Created on : Oct 28, 2022, 9:38:15 AM
    Author     : haiqd
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Department"%>
<%@page import="Model.Student"%>
<%@page import="Model.Employee"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Add new student <br>
        <form action="add" method="post">
            ID: <input type="text" name="id" required=""><br>
            Name: <input type="text" name="name" required=""><br>
            Gender: <input type="radio" name="gender" value="1" required="">Male<input type="radio" name="gender" value="0" required="">Female<br>
            Department:<select name="select" required="">
                <option></option>
                <c:forEach items="${listD}" var="item">
                    <option value="${item.getId()}">${item.getName()}</option>
                </c:forEach>
            </select><br>
            <input type="submit" name="add" value="Add">
        </form>
        <table border = "1">
            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>Gender</td>
                <td>Department</td>
            </tr>
            <c:forEach items="${list}" var="item">
                <tr>
                    <td>${item.getStdID()}</td>
                    <td>${item.getStdName()}</td>
                    <td>${item.getGender()}</td>
                    <td>${item.getdID()}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
