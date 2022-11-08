/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cotroller;

import Context.DAO;
import Model.AccountAdmin;
import Model.AccountStudent;
import Model.Admin;
import Model.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author haiqd
 */
public class LoginServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String acc = req.getParameter("acc");
        String pass = req.getParameter("pass");
        DAO d = new DAO();
        AccountStudent as = d.checkAccountStudent(acc, pass);
        AccountAdmin aa = d.checkAccountAdmin(acc, pass);
        if(as == null && aa == null){
            req.setAttribute("mess", "Please check your account and password!!");
            req.getRequestDispatcher("index_homepage.jsp").forward(req, resp);
        }
        if(as != null ){
            HttpSession session = req.getSession();
            Student s = d.getStudentByID(as);
            session.setAttribute("Student", s);
            resp.sendRedirect("menu");
        }
        if(aa != null){
            HttpSession session = req.getSession(); 
            Admin a = d.getAdminByID(aa);
            session.setAttribute("Admin", a);
            resp.sendRedirect("admin");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("index_homepage.jsp").forward(req, resp);
    }
    
}
