
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author haiqd
 */
public class EX_4 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {
            String input = req.getParameter("input");
            String submit = req.getParameter("thuchien");
            String out1 = req.getParameter("thoat");
            String[] words = input.split(",");
            ArrayList<Integer> arr = new ArrayList<>();
            String res = req.getParameter("ouput");
            if ("Thực hiện".equals(submit)) {
                String input1 = "";
                String output = "";
                if (input.isEmpty()) {
                    input1 = "Input is blank!";
                } else {
                    for (int i = 0; i < words.length; i++) {
                        char[] word = words[i].toCharArray();
                        for (int j = 0; j < word.length; j++) {
                            if (!Character.isDigit(word[j])) {
                                input1 = "Please check your input! \n It must be correct format: number,number,number,....";
                                req.setAttribute("type", "4");
                                req.setAttribute("input1", input1);
                                req.setAttribute("output", output);
                                req.getRequestDispatcher("Ex_Servlet.jsp").forward(req, resp);
                                break;
                            }
                        }
                        arr.add(Integer.parseInt(words[i]));
                    }

                    input1 = input;
                    if (!"ouput".equalsIgnoreCase(res) && !"le".equalsIgnoreCase(res) && !"chan".equalsIgnoreCase(res) && !"sort".equalsIgnoreCase(res)) {
                        output = "please choose option!";
                    }
                    if ("ouput".equalsIgnoreCase(res)) {
                        for (Integer fl : arr) {
                            output += String.valueOf(fl + " ");
                        }
                    }
                    if ("le".equalsIgnoreCase(res)) {
                        int result = 0;
                        for (Integer fl : arr) {
                            if (fl % 2 != 0) {
                                result += fl;
                            }
                        }
                        output = String.valueOf(result);
                    }
                    if ("chan".equalsIgnoreCase(res)) {
                        int result = 1;
                        for (Integer fl : arr) {
                            if (fl % 2 == 0) {
                                result *= fl;
                            }
                        }
                        output = String.valueOf(result);
                    }
                    if ("sort".equalsIgnoreCase(res)) {
                        Collections.sort(arr);
                        for (Integer fl : arr) {
                            output += String.valueOf(fl + " ");
                        }
                    }
                }
                req.setAttribute("type", "4");
                req.setAttribute("input23", input1);
                req.setAttribute("output23", output);
                req.getRequestDispatcher("Ex_Servlet.jsp").forward(req, resp);
            }

            if ("Thoát".equalsIgnoreCase(out1)) {
                String input1 = "";
                String output = "";
                req.setAttribute("type", "4");
                req.setAttribute("input23", input1);
                req.setAttribute("output23", output);
                req.getRequestDispatcher("Ex_Servlet.jsp").forward(req, resp);
            }

        } catch (Exception e) {
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

}
