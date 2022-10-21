
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
public class Calculation extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {
            out.println("<html>");
            out.println("<body>");
            //Nhan thong tin tu phia client
            int a = Integer.parseInt(req.getParameter("a"));
            int b = Integer.parseInt(req.getParameter("b"));
            String c = "";
            String op = req.getParameter("op");

            //UCLN
            if (req.getParameter("UCLN") != null) {
                out.print("Hello");
                return;
            }

            if ("All operators".equalsIgnoreCase(op)) {
                //nếu lưu param ở thẻ init -param trong ưeb.xml
                //op = getInitParameter("op");

                //nếu lư param trong thẻ context-param (web.xml)
                op = getServletContext().getInitParameter("op");
            }

            if ("+".equalsIgnoreCase(op)) {
                c = String.valueOf(a + b);
                out.println(c);
            }
            if ("-".equalsIgnoreCase(op)) {
                c = String.valueOf(a - b);
                out.println(c);
            }
            if ("*".equalsIgnoreCase(op)) {
                c = String.valueOf(a * b);
                out.println(c);
            }
            if ("/".equalsIgnoreCase(op)) {
                c = String.valueOf(a / b);
                out.println(c);
            }

            //Su ly thong tin
            //Tra ket qua tro client
            req.setAttribute("op", String.valueOf(op));
            req.setAttribute("a", String.valueOf(a));
            req.setAttribute("b", String.valueOf(b));
            req.setAttribute("c", c);
            req.getRequestDispatcher("Calculation.jsp").forward(req, resp);
            out.println("</html>");
            out.println("</body>");
        } catch (Exception e) {
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {
            out.println("<html>");
            out.println("<body>");
            //Nhan thong tin tu phia client
            int a = Integer.parseInt(req.getParameter("a"));
            int b = Integer.parseInt(req.getParameter("b"));
            String c = "";
            String op = req.getParameter("op");

            //UCLN
            if (req.getParameter("UCLN") != null) {
                out.print("Hello");
                return;
            }

            if ("All operators".equalsIgnoreCase(op)) {
                //nếu lưu param ở thẻ init -param trong ưeb.xml
                //op = getInitParameter("op");

                //nếu lư param trong thẻ context-param (web.xml)
                op = getServletContext().getInitParameter("op");
            }

            if ("+".equalsIgnoreCase(op)) {
                c = String.valueOf(a + b);
                out.println(c);
            }
            if ("-".equalsIgnoreCase(op)) {
                c = String.valueOf(a - b);
                out.println(c);
            }
            if ("*".equalsIgnoreCase(op)) {
                c = String.valueOf(a * b);
                out.println(c);
            }
            if ("/".equalsIgnoreCase(op)) {
                c = String.valueOf(a / b);
                out.println(c);
            }

            //Su ly thong tin
            //Tra ket qua tro client
            req.setAttribute("op", String.valueOf(op));
            req.setAttribute("a", String.valueOf(a));
            req.setAttribute("b", String.valueOf(b));
            req.setAttribute("c", c);
            req.getRequestDispatcher("Calculation.jsp").forward(req, resp);
            out.println("</html>");
            out.println("</body>");
        } catch (Exception e) {
        }
    }
}
