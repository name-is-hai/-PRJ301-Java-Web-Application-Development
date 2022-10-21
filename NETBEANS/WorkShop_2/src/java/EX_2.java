
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
public class EX_2 extends HttpServlet {

    public static double USCLN(double a, double b) {
        if (b == 0) {
            return a;
        }
        return USCLN(b, a % b);
    }

    public static double BSCNN(double a, double b) {
        return (a * b) / USCLN(a, b);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {
            //Nhan thong tin tu phia client
            int check1 = 0;
            int check2 = 0;
            int check3 = 0;
            String submit = req.getParameter("find");
            String out1 = req.getParameter("dele");
            String tmp1 = req.getParameter("a");
            String tmp2 = req.getParameter("b");
            String tmp3 = req.getParameter("c");

            if ("Tìm".equalsIgnoreCase(submit)) {
                String printOut = "";
                String printOut1 = "";
                String printOut2 = "";
                String printOut3 = "";
                String output = "";
                if (tmp1.isEmpty()) {
                    printOut1 = "Input a is blank!";
                } else if (!tmp1.matches("[+-]?[0-9]+")) {
                    printOut1 = "Input a is only integer number!";
                } else {
                    check1++;
                    printOut1 = tmp1;
                }
                if (tmp2.isEmpty()) {
                    printOut2 = "Input b is blank!";
                } else if (!tmp2.matches("[+-]?[0-9]+")) {
                    printOut2 = "Input b is only integer number!";
                } else {
                    check2++;
                    printOut2 = tmp2;
                }
                if (tmp3.isEmpty()) {
                    printOut3 = "Input c is blank!";
                } else if (!tmp3.matches("[+-]?[0-9]+")) {
                    printOut3 = "Input c is only integer number!";
                } else {
                    check3++;
                    printOut3 = tmp3;
                }

                if (check1 != 0 && check2 != 0 && check3 != 0) {
                    double a = Double.parseDouble(tmp1);
                    double b = Double.parseDouble(tmp2);
                    double c = Double.parseDouble(tmp3);
                    String input1 = req.getParameter("compare");
                    String input2 = req.getParameter("dele");
//            out.println(input);
                    if ("greater".equalsIgnoreCase(input1)) {
                        if (a >= b && a >= c) {
                            output = String.valueOf(a);
                        } else if (b >= a && b >= c) {
                            output = String.valueOf(b);
                        } else {
                            output = String.valueOf(c);
                        }
                    } else if ("less".equalsIgnoreCase(input1)) {
                        double min = a;
                        if (min > b) {
                            min = b;
                        }
                        if (min > c) {
                            min = c;
                        }
                        output = String.valueOf(min);

                    } else {
                        out.println("Giai Phuong Trinh A^2 + B*X + C = 0");
                        if (a == 0) {
                            if (b == 0) {
                                printOut = "Phuong trinh vo nghiem!";
                            } else {
                                printOut = "Phuong trinh co nghiem: " + (-c / b);
                            }
                            return;
                        }
                        double delta = b * b - 4 * a * c;
                        double x1, x2;
                        if (delta > 0) {
                            x1 = (double) ((-b + Math.sqrt(delta)) / (2 * a));
                            x2 = (double) ((-b - Math.sqrt(delta)) / (2 * a));
                            printOut = "Phuong trinh co nghiem: "
                                    + "x1 = " + x1 + " va x2 = " + x2;
                        } else if (delta == 0) {
                            x1 = (-b / (2 * a));
                            printOut = "Phuong trinh co nghiem kep : " + "x1 = x2 = " + x1;
                        } else {
                            printOut = "Phuong trinh vo nghiem!";
                        }
                    }
                } else {
                    if (check1 != 0 && check2 != 0) {
                        double a = Double.parseDouble(tmp1);
                        double b = Double.parseDouble(tmp2);
                        printOut = "USCLN AvsB:" + USCLN(a, b);
                    }
                    if (check2 != 0 && check3 != 0) {
                        double b = Double.parseDouble(tmp2);
                        double c = Double.parseDouble(tmp3);
                        printOut = "<br>USCLN BvsC:" + USCLN(b, c);
                    }
                    if (check1 != 0 && check3 != 0) {
                        double a = Double.parseDouble(tmp1);
                        double c = Double.parseDouble(tmp3);
                        printOut = "<br>USCLN AvsC:" + USCLN(a, c);
                    }
                }
                req.setAttribute("type", "2");
                req.setAttribute("a", printOut1);
                req.setAttribute("b", printOut2);
                req.setAttribute("c", printOut3);
                req.setAttribute("output435", output);
                req.setAttribute("Error", printOut);
                req.getRequestDispatcher("Ex_Servlet.jsp").forward(req, resp);
            }
            if ("Xóa".equalsIgnoreCase(out1)) {
                String printOut = "";
                String printOut1 = "";
                String printOut2 = "";
                String printOut3 = "";
                String output = "";
                req.setAttribute("type", "2");
                req.setAttribute("a", printOut1);
                req.setAttribute("b", printOut2);
                req.setAttribute("c", printOut3);
                req.setAttribute("output435", output);
                req.setAttribute("Error", printOut);
                req.getRequestDispatcher("Ex_Servlet.jsp").forward(req, resp);
            }
        } catch (Exception e) {
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
