<%-- 
    Document   : Caculation
    Created on : Sep 28, 2022, 9:36:52 AM
    Author     : haiqd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TODO supply a title</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%
            String c = "";
            if(request.getAttribute("c")!=null){
                c = (String)request.getAttribute("c");
            }
            String b = "";
            if(request.getAttribute("b")!=null){
                b = (String)request.getAttribute("b");
            }            
//            String a = "";
//            if(request.getAttribute("a")!=null){
//                a = (String)request.getAttribute("a");
//            }
            String op ="";
            if(request.getAttribute("op")!=null){
                op = (String)request.getAttribute("op");
            }
        %>
        
        <form id="f" action ='cal' method = 'post'>
            Enter a:<input type ='text' name ='a' value="${a}">
            <br>Enter b:<input type ='text' name ='b' value="<%=b%>">
            <br>Operater:
            <select name="op" onchange="change()">
                <option>All operators</option>
                <option>+</option>
                <option>-</option>
                <option>*</option>
                <option>/</option>
            </select>
            <br><input type ='submit' name ='OK' value = 'OK'>
            <br><input type = 'submit' name = 'UCLN' value='UCLN'> 
            <br>Result: <input type="text" value="<%=c%>" name="result" readonly=>
        </form>
        <script>
            function change() {
                document.getElementById('f').submit();
            }
        </script>
    </body>
</html>
