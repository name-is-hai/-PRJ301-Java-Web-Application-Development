
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
public class Demo_Serverlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {
            out.println("<html>");
            out.println("<body>");
            out.println("Hello servlet");
            out.println("<form method = 'get' action = 'demo2'> ");
            out.println("Enter a:<input type ='text' name ='a'>");
            out.println("<br>Enter b:<input type ='text' name ='b'>");
            out.println("<br><input type ='submit' name ='OK' value = 'OK'>");
            out.println("</form>");

            //Nhan thong tin tu phia client
            int a = Integer.parseInt(req.getParameter("a"));
            int b = Integer.parseInt(req.getParameter("b"));
            //Su ly thong tin
            int c = a - b;
            //Tra ket qua tro client
            out.println("<br>Result: " + c);
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {
            out.println("<html>");
            out.println("<body>");
            out.println("Hello servlet");
            out.println("<form method = 'post'>");
            out.println("Enter a:<input type ='text' name ='a'>");
            out.println("<br>Enter b:<input type ='text' name ='b'>");
            out.println("<br><input type ='submit' name ='OK' value = 'OK'>");
            out.println("</form>");

            //Nhan thong tin tu phia client
            int a = Integer.parseInt(req.getParameter("a"));
            int b = Integer.parseInt(req.getParameter("b"));
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
