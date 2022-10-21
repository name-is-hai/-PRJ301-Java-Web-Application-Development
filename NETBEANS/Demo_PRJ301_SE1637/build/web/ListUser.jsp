<%-- 
    Document   : ListUser
    Created on : Oct 12, 2022, 11:37:07 AM
    Author     : haiqd
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.User"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>login ok!</h1>
        <%
            ArrayList<User> list = new ArrayList<>();
            if(request.getAttribute("list") != null){
                list = (ArrayList<User>)request.getAttribute("list");
            }
            
            ArrayList<User> listAcc = new ArrayList<>();
            if(request.getAttribute("listAcc") != null){
                listAcc = (ArrayList<User>)request.getAttribute("listAcc");
            }
        %>
        
        <form action="search" method="post">
            <input type="text" name="search"><button type="submit">Search</button>
        </form><br>
        
        <div>
            List Account:
            <table border = "1">
            <tr>
                <td>Account</td>
                <td>Name</td>
                <td>Gender</td>
                <td>Birthday</td>
                <td>Address</td>
            </tr>
            <%
                for(User item1 : listAcc){
                    out.println("<tr>");
                    out.println("<td>"+item1.getAccount()+"</td>");
                    out.println("<td>"+item1.getName()+"</td>");
                    out.println("<td>"+item1.getGender()+"</td>");
                    out.println("<td>"+item1.getDob()+"</td>");
                    out.println("<td>"+item1.getAddress()+"</td>");
                    out.println("</tr>");
                }
            %>
        </div>
        <br><br>
        List Users:
        <table border = "1">
            <tr>
                <td>Account</td>
                <td>Name</td>
                <td>Gender</td>
                <td>Birthday</td>
                <td>Address</td>
            </tr>
            <%
                for(User item : list){
                    out.println("<tr>");
                    out.println("<td>"+item.getAccount()+"</td>");
                    out.println("<td>"+item.getName()+"</td>");
                    out.println("<td>"+item.getGender()+"</td>");
                    out.println("<td>"+item.getDob()+"</td>");
                    out.println("<td>"+item.getAddress()+"</td>");
                    out.println("</tr>");
                }
            %>
        </table>
        
        <br>
        List JSPL:
        <table border = "1">
            <tr>
                <td>Account</td>
                <td>Name</td>
                <td>Gender</td>
                <td>Birthday</td>
                <td>Address</td>
            </tr>
            <c:forEach items="${list}" var="item">
                <tr>
                    <td>${item.getAccount()}</td>
                    <td>${item.getName()}</td>
                    <td>${item.getGender()}</td>
                    <td>${item.getDob()}</td>
                    <td>${item.getAddress()}</td>
                    
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
