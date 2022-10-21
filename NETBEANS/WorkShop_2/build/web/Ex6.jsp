<%-- 
    Document   : Ex6
    Created on : Sep 30, 2022, 9:48:10 AM
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
        <div style="background-color: whitesmoke; padding: 20px 0; border: 1px blue solid">
        <h2 style="color: blue;">GIẢI PHƯƠNG TRINH<br>BẬC NHẤT</h2>
        <form action="ex6" method="post">
                Nhập a: <input type="text" name="a" value="${Input}"><br><br>
                Nhập b: <input type="text" name="b"value="${Input1}"><br><br>
                <input type="submit" name="giai" value="Giải PT">
                <input type="submit" name="out" value="Thoát">
            </form><br>
            Kết luận nghiệm<br><input type="text" name="ketqua" value="${Output}">
        </div>
    </body>
</html>
