
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
public class Demo_Servlet2 extends HttpServlet {

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
            int a = Integer.parseInt(req.getParameter("a"));
            int b = Integer.parseInt(req.getParameter("b"));
            String op = req.getParameter("op");
            //UCLN
            
            if (req.getParameter("UCLN") != null) {
                out.print("Hello");
                return;
            }
            
            if("All operators".equalsIgnoreCase(op)){
                //nếu lưu param ở thẻ init -param trong ưeb.xml
                //op = getInitParameter("op");
                
                //nếu lư param trong thẻ context-param (web.xml)
                op=getServletContext().getInitParameter("op");
            }
            
            if ("+".equalsIgnoreCase(op)) {
                int c = a + b;
                out.println(c);
            }
            if ("-".equalsIgnoreCase(op)) {
                int c = a - b;
                out.println(c);
            }
            if ("*".equalsIgnoreCase(op)) {
                int c = a * b;
                out.println(c);
            }
            if ("/".equalsIgnoreCase(op)) {
                int c = a / b;
                out.println(c);
            }

            //Su ly thong tin
            int c = a + b;
            //Tra ket qua tro client
            out.println("<br>Result: " + c);
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
        }
    }

}
