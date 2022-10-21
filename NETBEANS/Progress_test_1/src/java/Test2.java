
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
public class Test2 extends HttpServlet {

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {
            //Nhan thong tin tu phia client
            String tmp1 = req.getParameter("input");
            String reset = req.getParameter("reset");
            String submit = req.getParameter("submit");
            if ("--V--".equalsIgnoreCase(submit)) {
                String input = "";
                String printOut = "";
                if (tmp1.isEmpty()) {
                    input = "Input n is blank!";
                } else {
                    if (!tmp1.matches("[0-9]+")) {
                        input = "Input n is only positive integer number!";
                    } else {
                        if (Integer.parseInt(tmp1) <= 2) {
                            input = "Input n > 2";
                        } else {
                            int n = Integer.parseInt(tmp1);
                            input = tmp1;
                            int dem = 0;
                            int i = n;
                            while (dem < n) {
                                if (isPrimeNumber(i)) {
                                    printOut += String.valueOf(i + " ");
                                    dem++;
                                }
                                i++;
                            }
                            if (dem == 0) {
                                printOut = "No results.";
                            }
                        }
                    }
                }
                req.setAttribute("output", printOut);
                req.setAttribute("input", input);
                req.getRequestDispatcher("Test2.jsp").forward(req, resp);
            }

            if ("reset".equalsIgnoreCase(reset)) {
                String input = "";
                String printOut = "";
                req.setAttribute("output", printOut);
                req.setAttribute("input", input);
                req.getRequestDispatcher("Test2.jsp").forward(req, resp);
            }
        } catch (Exception e) {
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

}
