
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author haiqd
 */
public class EX_3 extends HttpServlet {

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {
            out.println("<html>");
            out.println("<body>");
            //Nhan thong tin tu phia client
            String tmp1 = req.getParameter("n");
            if (tmp1.isEmpty()) {
                out.println("<br>Input n is blank!");
            } else {
                if (!tmp1.matches("[0-9]+")) {
                    out.print("<br>Input n is only integer number!");
                }
            }
            int n = Integer.parseInt(tmp1);
            String change = req.getParameter("op");
            if ("Tổng n số liên tiếp".equalsIgnoreCase(change)) {
                int result = 0;
                for (int i = 0; i < n; i++) {
                    result += i;
                }
                out.println(result + n);
            }
            if ("Tính n!".equalsIgnoreCase(change)) {
                int result = 1;
                for (int i = 1; i < n; i++) {
                    result = result * i;
                }
                out.println(result * n);
            }
            if ("In dãy lẻ".equalsIgnoreCase(change)) {
                for (int i = 1; i <= n; i++) {
                    if (i % 2 != 0) {
                        out.println(i + " ");
                    }
                }
            }
            if ("In dãy số chẵn".equalsIgnoreCase(change)) {
                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 0) {
                        out.println(i + " ");
                    }
                }
            }
            if ("Kiểm tra số nguyên tố".equalsIgnoreCase(change)) {
                for (int i = 0; i < n; i++) {
                    if (isPrimeNumber(i)) {
                        out.println(i + " ");
                    }
                }
            }
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
        }
    }

}
