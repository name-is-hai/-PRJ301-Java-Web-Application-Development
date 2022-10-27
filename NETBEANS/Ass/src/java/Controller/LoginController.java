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
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author haiqd
 */
public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Nhận thông tin 
        String account = req.getParameter("username");
        String pass = req.getParameter("password");

        //Xử lý
        User u = new User(account, pass);
        if (u.checkLogin()) {
            HttpSession session = req.getSession();
            //lay du lieu o bawngf user
            session.setAttribute("Name", u.getUserByAcc(account).getName());
            req.getRequestDispatcher("index_studentboard.jsp").forward(req, resp);
        } else {
            String error = "";
            error = "<br>Please check your Username or Password!!<br>If you do not have account please choose Register!";
            req.setAttribute("error", error);
            req.getRequestDispatcher("index_homepage.jsp").forward(req, resp);
        }
        //Trả kết quả về 
    }
   
}
