<%-- 
    Document   : Ex3
    Created on : Sep 30, 2022, 9:47:39 AM
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
        <div style="background-color: whitesmoke; padding: 20px 0; border: 1px blue solid; ">
            <h2 style="color: blue">THỰC HIỆN PHÉP TOÁN</h2>
            <form action="ex3" id="f" method="post">
                Nhập n: <input type="text" name="n" value="${input111}"> (1 < n <100)<br><br>
                Chọn phép toán 
                <select name="op" onchange="change()" >
                    <option>${change}</option>
                    <option>Tổng n số liên tiếp</option>
                    <option>Tính n!</option>
                    <option>In dãy lẻ</option>
                    <option>In dãy số chẵn</option>
                    <option>Kiểm tra số nguyên tố</option>
                </select><br><br>
            </form>
            Kết quả <input type="text" name="ketqua" value="${output111}" readonly="">
        </div>
    </body>
    <script>
        function change() {
            document.getElementById('f').submit();
        }
    </script>
</html>
