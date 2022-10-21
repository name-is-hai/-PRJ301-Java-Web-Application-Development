<%-- 
    Document   : Test2
    Created on : Oct 5, 2022, 9:22:12 AM
    Author     : haiqd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test 02</title>
    </head>
    <body>
        <div style="border: 1px solid #007d00; width: 300px; padding-bottom: 20px; ">
            <h3 style="text-align: center; color: #ffa100;margin-top: 5px">PRIME NUMBER</h3>
            <form id="f1" action="test2" method="post">
                <p style="font-style: italic;">Enter an integer n:</p>
                <input type="text" name="input" style="margin-left: 75px; width: 100px" value="${input}"><input type="submit" value="RESET" name="reset" style="font-weight:750; color: #ff0000;margin-left: 5px">
                <br><br><div style="text-align: center">
                    <span style="font-weight: 500">Show n prime numbers >= n</span><br>
                    <input type="submit" name="submit" value="--V--"style="font-weight:750; color: #ff0000;padding: 0 10px; margin-top: 5px"><br><br>
                    <input type="text" name="output" style="background-color: #e5e5e5;border: 0.5px solid #c3c3c3" value="${output}" readonly="">
                </div>
            </form>
        </div>
    </body>
</html>
