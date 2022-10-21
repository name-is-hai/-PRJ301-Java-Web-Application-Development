
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
public class EX_3 extends HttpServlet {

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
            String tmp1 = req.getParameter("n");
            String output = "";
            String printOut1 = "";
            String change = req.getParameter("op");
            if ("Tổng n số liên tiếp".equalsIgnoreCase(change)) {
                if (tmp1.isEmpty()) {
                    printOut1 = "Input n is blank!";
                } else {
                    if (!tmp1.matches("[0-9]+")) {
                        printOut1 = "Input n is only integer number!";
                    } else {
                        int n = Integer.parseInt(tmp1);
                        printOut1 = tmp1;
                        int result = 0;
                        for (int i = 0; i < n; i++) {
                            result += i;
                        }
                        output = String.valueOf(result + n);
                    }
                }
            }
            if ("Tính n!".equalsIgnoreCase(change)) {
                if (tmp1.isEmpty()) {
                    printOut1 = "Input n is blank!";
                } else {
                    if (!tmp1.matches("[0-9]+")) {
                        printOut1 = "Input n is only integer number!";
                    } else {
                        int n = Integer.parseInt(tmp1);
                        printOut1 = tmp1;
                        int result = 1;
                        for (int i = 1; i < n; i++) {
                            result = result * i;
                        }
                        output = String.valueOf(result * n);
                    }
                }
            }
            if ("In dãy lẻ".equalsIgnoreCase(change)) {
                if (tmp1.isEmpty()) {
                    printOut1 = "Input n is blank!";
                } else {
                    if (!tmp1.matches("[0-9]+")) {
                        printOut1 = "Input n is only integer number!";
                    } else {
                        int n = Integer.parseInt(tmp1);
                        printOut1 = tmp1;
                        for (int i = 1; i <= n; i++) {
                            if (i % 2 != 0) {
                                output += String.valueOf(i + " ");
                            }
                        }
                    }
                }
            }
            if ("In dãy số chẵn".equalsIgnoreCase(change)) {
                if (tmp1.isEmpty()) {
                    printOut1 = "Input n is blank!";
                } else {
                    if (!tmp1.matches("[0-9]+")) {
                        printOut1 = "Input n is only integer number!";
                    } else {
                        int n = Integer.parseInt(tmp1);
                        printOut1 = tmp1;
                        for (int i = 1; i <= n; i++) {
                            if (i % 2 == 0) {
                                output += String.valueOf(i + " ");
                            }
                        }
                    }
                }
            }
            if ("Kiểm tra số nguyên tố".equalsIgnoreCase(change)) {
                if (tmp1.isEmpty()) {
                    printOut1 = "Input n is blank!";
                } else {
                    if (!tmp1.matches("[0-9]+")) {
                        printOut1 = "Input n is only integer number!";
                    } else {
                        int n = Integer.parseInt(tmp1);
                        printOut1 = tmp1;
                        for (int i = 0; i < n; i++) {
                            if (isPrimeNumber(i)) {
                                output += String.valueOf(i + " ");
                            }
                        }
                    }
                }
            }
            req.setAttribute("type", "3");
            req.setAttribute("output111", output);
            req.setAttribute("input111", printOut1);
            req.setAttribute("change", change);
            req.getRequestDispatcher("Ex_Servlet.jsp").forward(req, resp);
        } catch (Exception e) {
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

}
