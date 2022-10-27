/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Product;
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
public class EditController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String submitbutton = req.getParameter("submitbutton");
        String code = req.getParameter("code");
        String name = req.getParameter("name");
        String price = req.getParameter("price");

        if ("Update".equalsIgnoreCase(submitbutton)) {
            Product p = new Product();
            p.updateByCode(code, name, price);
            ArrayList<Product> listProduct = p.getListProducṭ();
            req.setAttribute("listProduct", listProduct);
            req.getRequestDispatcher("ListProduct.jsp").forward(req, resp);
        }
        if ("Delete".equalsIgnoreCase(submitbutton)) {
            Product p = new Product();
            p.deleteByCode(code);
            ArrayList<Product> listProduct = p.getListProducṭ();
            req.setAttribute("listProduct", listProduct);
            req.getRequestDispatcher("ListProduct.jsp").forward(req, resp);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String code = req.getParameter("id");
        String mode = req.getParameter("mod");

        Product p = new Product();
        Product p2 = p.getProductById(code);
        req.setAttribute("code", p2.getCode());
        req.setAttribute("name", p2.getName());
        req.setAttribute("price", p2.getPrice());
        req.getRequestDispatcher("EditProduct.jsp").forward(req, resp);

    }

}
