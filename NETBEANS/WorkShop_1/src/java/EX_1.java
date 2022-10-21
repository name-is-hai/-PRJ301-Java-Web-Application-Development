
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
public class EX_1 extends HttpServlet {

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
            String tmp1 = req.getParameter("a");
            String tmp2 = req.getParameter("b");
            if (tmp1.isEmpty()) {
                out.println("<br>Input a is blank!");
            } else {
                if (!tmp1.matches("[0-9]+")) {
                    out.print("<br>Input a is only integer number!");
                }
            }
            if (tmp2.isEmpty()) {
                out.println("<br>Input b is blank!");
            } else {
                if (!tmp2.matches("[0-9]+")) {
                    out.print("<br>Input b is only integer number!");
                }
            }
            int a = Integer.parseInt(tmp1);
            int b = Integer.parseInt(tmp2);
            String cong = req.getParameter("a+b");
            String tru = req.getParameter("a-b");
            String nhan = req.getParameter("a*b");
            String chia = req.getParameter("a/b");
            if ("a+b".equalsIgnoreCase(cong)) {
                int c = a + b;
                out.println(c);
            }
            if ("a-b".equalsIgnoreCase(tru)) {
                int c = a - b;
                out.println(c);
            }
            if ("a*b".equalsIgnoreCase(nhan)) {
                int c = a * b;
                out.println(c);
            }
            if ("a/b".equalsIgnoreCase(chia)) {
                int c = a / b;
                out.println(c);
            }
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
        }
    }

}
