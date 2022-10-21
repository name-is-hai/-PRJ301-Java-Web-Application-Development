<%-- 
    Document   : Ex5
    Created on : Sep 30, 2022, 9:47:59 AM
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
            String input2 = "";
            if(request.getAttribute("input")!= null){
                input2 = (String)request.getAttribute("input");
            }
            String output3 = "";
            if(request.getAttribute("output")!= null){
                output3 = (String)request.getAttribute("output");
            }
            
            String input3 = "";
            if(request.getAttribute("input1")!= null){
                input3 = (String)request.getAttribute("input1");
            }
            String output4 = "";
            if(request.getAttribute("output1")!= null){
                output4 = (String)request.getAttribute("output1");
            }
            
            String input4 = "";
            if(request.getAttribute("input2")!= null){
                input4 = (String)request.getAttribute("input2");
            }
            String output5 = "";
            if(request.getAttribute("output2")!= null){
                output5 = (String)request.getAttribute("output2");
            }
            
            String input5 = "";
            if(request.getAttribute("input3")!= null){
                input5 = (String)request.getAttribute("input3");
            }
            String output6 = "";
            if(request.getAttribute("output3")!= null){
                output6 = (String)request.getAttribute("output3");
            }
            String input6 = "";
            if(request.getAttribute("input4")!= null){
                input6 = (String)request.getAttribute("input4");
            }
        %>
        <div style="background-color: whitesmoke; padding: 20px 0; border: 1px blue solid">
        <h2 style="text-align: center">ĐỐI TƯỢNG STRING</h2>
        <form action="ex5" method="post">
                <div style="border-bottom: 1px solid black; border-top: 1px solid black;">
                    <p>Nhập đoạn văn:</p><input type="text" name="input" style="width: 250px; height: 100px" value="<%=input2%>"><br><br>
                    Tổng số ký tự: <input type="text" value="<%=output3%>" readonly=""> <input type="submit" name="tong" value="submit"><br><br>
                </div>
                <div style="border-bottom: 1px solid black;">
                    Nhập vị trí<input type="text" name="input2" style="width: 50px" value="<%=input3%>">Ký tự tương ứng <input type="text" style="width: 50px" value="<%=output4%>" readonly=""><input type="submit" name="ktri" value="submit"><br><br>
                </div>
                <div style="border-bottom: 1px solid black;">
                    Nhập chuỗi <input type="text" name="input3" style="width: 50px" value="<%=input4%>">Vị trí tương ứng <input type="text" style="width: 50px" value="<%=output5%>" readonly=""><input type="submit" name="vtri" value="submit"><br><br>
                </div>
                <div>
                    Nhập vị trí cần tách Từ:<input type="text" name="input4" style="width: 50px" value="<%=input6%>"> Đến <input type="text" name="input5" style="width: 50px" value="<%=input5%>">Kết quả<input type="text" style="width: 50px" value="<%=output6%>" readonly=""><input type="submit" name="ketqua" value="submit"><br><br>
                </div>
            </form>
        </div>
    </body>
</html>
