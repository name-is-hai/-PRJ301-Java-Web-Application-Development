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
public class UserController extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Nhận thông tin 
        String account = req.getParameter("acc");
        String pass = req.getParameter("pass");
        
        //Xử lý
        User u = new User(account, pass);
        if(u.checkLogin()){
            //luu thong tin vafo session
            HttpSession session = req.getSession();
            session.setAttribute("account", account);
            
            //lay du lieu o bawngf user
            ArrayList<User> list = u.getListUser();
            req.setAttribute("list", list);
            req.getRequestDispatcher("ListUser.jsp").forward(req, resp);
        }else{
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
        //Trả kết quả về 
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String account = req.getParameter("acc");
        String dob = req.getParameter("dob");
        
        User u = new User();
        if(u.checkUser(account, dob)){
            //Thong tin ton tai
            //Tao 1 mat khau moi
            Random r = new Random();
            String newPass = r.nextInt(1000)+"";
            //Luu vao DB
            u.updatePass(account, newPass);
            //Tra ket qua ve cho login
            req.setAttribute("account", account);
            req.setAttribute("pass", newPass);
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }else{
            req.getRequestDispatcher("ForgotPassword.jsp").forward(req, resp);
            //Tra ve trong ForgotPassword
            
        }
        
    }
    
}
