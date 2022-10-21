<%-- 
    Document   : Ex2
    Created on : Sep 30, 2022, 9:47:25 AM
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
            <h2 style="color: blue">TÌM MAX VÀ TÌM MIN</h2>
            <form action="ex2" method="post">
                Nhập a: <input type="text" name="a" value="${a}"><br><br>
                Nhập b: <input type="text" name="b" value="${b}"><br><br>
                Nhập c: <input type="text" name="c" value="${c}"><br><br>
                Kết quả:<input type="text" name="Ketqua" value="${output435}" readonly=""><br><br>
                <div>${Error}</div>
                <input type="radio" name="compare" value="greater">Tìm số lớn nhất
                <input type="radio" name="compare" value="less">Tìm số nhỏ nhất
                <br><br>
                <input type="submit" name="find" value="Tìm">
                <input type="submit" name="dele" value="Xóa">
            </form>
        </div>
    </body>
</html>
