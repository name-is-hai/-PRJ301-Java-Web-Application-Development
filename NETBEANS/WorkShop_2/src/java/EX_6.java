
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
        resp.setContentType("charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {
            //Nhan thong tin tu phia client
            String c = "";
            String input1 = "";
            String input2 = "";
            String output = req.getParameter("giai");
            String thoat = req.getParameter("out");
            String tmp1 = req.getParameter("a");
            String tmp2 = req.getParameter("b");
            boolean check1 = false;
            boolean check2 = false;
            if ("Giải PT".equalsIgnoreCase(output)) {
                if (tmp1.isEmpty()) {
                    input1 = "Input a is blank!";
                } else {
                    if (!tmp1.matches("[+-]?[0-9]+")) {
                        input1 = "Input a is only integer number!";
                    } else {
                        input1 = tmp1;
                        check1 = true;
                    }
                }
                if (tmp2.isEmpty()) {
                    input2 = "Input b is blank!";
                } else {
                    if (!tmp2.matches("[+-]?[0-9]+")) {
                        input2 = "Input b is only integer number!";
                    } else {
                        input2 = tmp2;
                        check2 = true;
                    }
                }
                if (check1 && check2) {
                    double a = Double.parseDouble(tmp1);
                    double b = Double.parseDouble(tmp2);
                    c = "Phương trình có nghiệm: " + (-b/a);
                }
                req.setAttribute("type", "6");
                req.setAttribute("Input", input1);
                req.setAttribute("Input1", input2);
                req.setAttribute("Output", c);
                req.getRequestDispatcher("Ex_Servlet.jsp").forward(req, resp);
            }
            if ("Thoát".equalsIgnoreCase(thoat)) {
                return;
            }
        } catch (Exception e) {
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

}
