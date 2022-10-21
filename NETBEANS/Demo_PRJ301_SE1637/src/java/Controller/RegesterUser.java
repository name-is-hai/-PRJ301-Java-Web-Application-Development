/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author haiqd
 */
public class RegesterUser extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String acc = req.getParameter("acc");
        String pass = req.getParameter("pass");
        String name = req.getParameter("name");
        String gender = req.getParameter("gender");
        String dob = req.getParameter("dob");
        String addr = req.getParameter("address");
        
        User u = new User(acc, pass, name, gender, addr, dob);
        if(u.checkRegester(acc)){
            acc = "Account have been exist";
            req.setAttribute("account", acc);
            req.getRequestDispatcher("Regester.jsp").forward(req, resp);
        }else{
            u.Regester(acc, pass, name, gender, addr, dob);
            req.setAttribute("account", acc);
            req.setAttribute("pass", pass);
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
    
}
