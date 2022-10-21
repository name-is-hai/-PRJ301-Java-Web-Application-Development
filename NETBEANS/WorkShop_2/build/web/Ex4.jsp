<%-- 
    Document   : Ex4
    Created on : Sep 30, 2022, 9:47:48 AM
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
        <%
            String output2 = "";
            if(request.getAttribute("output23")!= null){
                output2 = (String)request.getAttribute("output23");
            }
            
            String input1 = "";
            if(request.getAttribute("input23")!= null){
                input1 = (String)request.getAttribute("input23");
            }
        %>
        <div style="background-color: whitesmoke; padding: 20px 0; border: 1px blue solid">
        <h2 style="color: blue">THỰC HIỆN PHÉP TOÁN</h2>
        <form action="ex4" id="f4" method="post">
                Kết quả: <input type="text" name="ketqua" style="width: 150px; height: 50px;" value="<%=output2%>" readonly=""><br><br>
                <span style="font-style: italic; margin-right: 10px">Chọn</span>Nhập mảng<input type="text" name="input" value="<%=input1%>">
                <br><br><input type="radio" name="ouput" value="ouput">In mảng<br><br>
                <div><input type="radio" name="ouput" value="le">Tổng lẻ 
                    <input type="radio" name="ouput" value="chan">Tích chẵn 
                    <input type="radio" name="ouput" value="sort">Sắp xếp
                </div>
                <div style="margin-left: 100px">
                    <input type="submit" name="thuchien" value="Thực hiện">
                    <input type="submit" name="thoat" value="Thoát"> 
                </div>
            </form>
        </div>
    </body>
</html>
