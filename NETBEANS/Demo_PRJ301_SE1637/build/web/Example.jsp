<%-- 
    Document   : Example
    Created on : Sep 26, 2022, 9:47:14 AM
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
        <h1>Hello World!</h1>

        <%
            //scriplet
            //là nơi chứa các code java nếu muốn
            String message = "Hell scriplet";
            out.println(message);
            
            //khơi tạo 2 số nguyên sau đó tính tổng tính thương chia dư của a, b 
            double a = 100;
            double b = 300;
            out.println("<br>Tong: "+ (a+b));
            out.println("<br>Hieu: "+ (a-b));
            out.println("<br>Tich: "+ (a*b));
            out.println("<br>Thuong: "+ (a/b));
            out.println("<br>Du: "+ (a%b));
            
            //1. Tạo 1 hàm tim ucln của 2 số a và b
            //o day, gọi lại hàm để hiện ra kết quả 
            double n = USCLN(a,b);
            out.println("<br>UCLN: " + n);
            
            //2.Tạp hàm check số nguyên tố
            //áp dụng n số nguyên tố đầu tiên (n=UCLN da tim dc)
            out.println("<br>PrimeNumber: " + printPrimeNumber(n));
        %>

        <%!
            String message = "Hello java";
            public static double USCLN(double a, double b) {
                if (b == 0) {
                    return a;
                }
                return USCLN(b, a % b);
            }

            public static boolean isPrimeNumber(int k) {
                if (k < 2) {
                    return false;
                }
                int squareRoot = (int) Math.sqrt(k);
                for (int i = 2; i <= squareRoot; i++) {
                    if (k % i == 0) {
                        return false;
                    }
                }
                return true;
            }

            public static String printPrimeNumber(double n){
                String out = "";
                for (int i = 0; i <= n; i++) {
                    if (isPrimeNumber(i)) {
                        out += i + " ";
                    }
                }
                return out;
            }
        %>
        
        <br>a=<%=a%>
        <br>b=<%=b%>
        <br>a+b = <%=a+b%>
        <br>a-b = <%=a-b%>
        <br>a/b = <%=(double)a/b%>
        <br>a*b = <%=a*b%>
    </body>
</html>
