/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Department;
import Model.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author haiqd
 */
public class List extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String gender = req.getParameter("gender");
        String select = req.getParameter("select");

        Student s = new Student();
        Department d = new Department();

        s.addStudent(id, name, gender, select);
        ArrayList<Department> listD = d.getListDepartment();
        ArrayList<Student> list = s.getListStudent();
        req.setAttribute("listD", listD);
        req.setAttribute("list", list);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student s = new Student();
        Department d = new Department();
        
        ArrayList<Department> listD = d.getListDepartment();
        ArrayList<Student> list = s.getListStudent();
        req.setAttribute("listD", listD);
        req.setAttribute("list", list);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

}
