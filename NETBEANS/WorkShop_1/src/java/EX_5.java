
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
public class EX_5 extends HttpServlet {

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
            String input2 = req.getParameter("input2");
            String input3 = req.getParameter("input3");
            String input4 = req.getParameter("input4");
            String input5 = req.getParameter("input5");
            String submit = req.getParameter("tong");
            String submit1 = req.getParameter("ktri");
            String submit2 = req.getParameter("vtri");
            String submit3 = req.getParameter("ketqua");
            String output = "";

            if (input.isEmpty()) {
                out.println("<br>Input (Nhap doan van ban) is blank!");
            }
            if ("submit".equalsIgnoreCase(submit)) {
                out.println(input.length());
            }
            if ("submit".equalsIgnoreCase(submit1)) {
                if (input2.isEmpty()) {
                    out.println("<br>Input (Nhap vi tri) is blank!");
                } else {
                    if (!input2.matches("[0-9]+")) {
                        out.print("<br>Input (Nhap vi tri) is only integer number!");
                    } else {
                        int k = Integer.parseInt(input2);
                        char[] words = input.toCharArray();
                        if (k > words.length ||k < 0) {
                            out.print("Not Found!");
                        }
                        out.println(words[k - 1]);
                    }
                }
            }
            if ("submit".equalsIgnoreCase(submit2)) {
                if (input3.isEmpty()) {
                    out.println("<br>Input (Nhap chuoi) is blank!");
                } else {
                    char[] word = input3.toCharArray();
                    char[] words = input.toCharArray();
                    int count = 0;
                    for (int i = 0; i < words.length; i++) {
                        for (int j = 0; j < word.length; j++) {
                            if (word[j] == words[i]) {
                                out.print((i + 1) + " ");
                                count++;
                            }
                        }
                    }
                    if (count == 0) {
                        out.print("Not found!");
                    }
                }
            }
            if ("submit".equalsIgnoreCase(submit3)) {
                if (input4.isEmpty()) {
                    out.println("<br>Input (Nhap vi tri can tach tu) is blank!");
                } else {
                    if (!input4.matches("[0-9]+")) {
                        out.print("<br>Input (Nhap vi tri can tach tu) is only integer number!");
                    }
                }
                if (input5.isEmpty()) {
                    out.println("<br>Input (Den) is blank!");
                } else {
                    if (!input5.matches("[0-9]+")) {
                        out.print("<br>Input (Den) is only integer number!");
                    }
                }
                int k = Integer.parseInt(input4);
                int t = Integer.parseInt(input5);
                char[] words = input.toCharArray();
                if (k > t) {
                    out.println("(Nhap vi tri can tach tu) < (Den)");
                } else {
                    if (k > words.length || t > words.length || k < 0 || t < 0) {
                        out.print("Not Found!");
                    } else {
                        for (int i = k; i <= t; i++) {
                            out.print(words[i + 1] + " ");
                        }
                    }
                }

            }
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
        }
    }

}
