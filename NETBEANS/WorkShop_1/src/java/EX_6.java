
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
public class EX_6 extends HttpServlet {

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

            String output = req.getParameter("giai");
            String thoat = req.getParameter("out");
            if ("Giải PT".equalsIgnoreCase(output)) {
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

                double a = Double.parseDouble(tmp1);
                double b = Double.parseDouble(tmp2);
                double result = 0;
                result = -b / a;
                out.println("Phuong trinh co nghiem x= " + result);
            }
            if ("Thoát".equalsIgnoreCase(thoat)) {

            }
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
        }
    }

}
