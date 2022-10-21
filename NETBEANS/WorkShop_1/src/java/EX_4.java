
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
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {
            out.println("<html>");
            out.println("<body>");
            String input = req.getParameter("input");
            String submit = req.getParameter("thuchien");
            String out1 = req.getParameter("thoat");
            String[] words = input.split(",");
            ArrayList<Integer> arr = new ArrayList<>();
            if ("Thực hiện".equals(submit)) {

                if (input.isEmpty()) {
                    out.print("Input is blank!");
                }
                for (int i = 0; i < words.length; i++) {
                    char[] word = words[i].toCharArray();
                    for (int j = 0; j < word.length; j++) {
                        if (!Character.isDigit(word[j])) {
                            out.println("Please check your input!");
                            out.println("<br>It must be correct format: number,number,number,....");
                            break;
                        }
                    }
                    arr.add(Integer.parseInt(words[i]));
                }
                String res = req.getParameter("ouput");
                if ("ouput".equalsIgnoreCase(res)) {
                    for (Integer fl : arr) {
                        out.print(fl + " ");
                    }
                }
                if ("le".equalsIgnoreCase(res)) {
                    int result = 0;
                    for (Integer fl : arr) {
                        if (fl % 2 != 0) {
                            result += fl;
                        }
                    }
                    out.println(result);
                }
                if ("chan".equalsIgnoreCase(res)) {
                    int result = 1;
                    for (Integer fl : arr) {
                        if (fl % 2 == 0) {
                            result *= fl;
                        }
                    }
                    out.println(result);
                }
                if ("sort".equalsIgnoreCase(res)) {
                    Collections.sort(arr);
                    for (Integer fl : arr) {
                        out.print(fl + " ");
                    }
                }
            }
            if("Thoát".equalsIgnoreCase(out1)){
                return;
            }
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
        }
    }

}
