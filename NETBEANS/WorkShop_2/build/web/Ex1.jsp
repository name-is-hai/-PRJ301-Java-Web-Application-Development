<%-- 
    Document   : newjsp
    Created on : Sep 30, 2022, 8:19:50 AM
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
        <div style="background-color: whitesmoke; padding: 20px 0; border: 1px blue solid" id="dis">
            <h2 style="color: blue">THỰC HIỆN PHÉP TOÁN</h2>
            <form id="f1" action="ex1" method="post">
                Nhập a:<input type="text" name="a" value="${Input113}"><br><br>
                Nhập b:<input type="text" name="b" value="${Input114}"><br><br>
                <div style="margin-left: 30px">
                    <input type="submit" name="a+b" value="a+b" >
                    <input type="submit" name="a-b" value="a-b" >
                    <input type="submit" name="a*b" value="a*b" >
                    <input type="submit" name="a/b" value="a/b" >
                </div>
                <br>
            </form>
            <div style="flex-direction: row">
                <span>KẾT QUẢ</span><input type="text" name="ketqua" value="${Output113}" readonly="">
            </div>
        </div>
    </body>
</html>
