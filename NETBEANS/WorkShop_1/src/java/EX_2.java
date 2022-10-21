
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
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {
            out.println("<html>");
            out.println("<body>");
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
                if (tmp1.isEmpty()) {
                    out.println("<br>Input a is blank!");
                } else if (!tmp1.matches("[+-]?[0-9]+")) {
                    out.print("<br>Input a is only integer number!");
                } else {
                    check1++;
                }
                if (tmp2.isEmpty()) {
                    out.println("<br>Input b is blank!");
                } else if (!tmp2.matches("[+-]?[0-9]+")) {
                    out.print("<br>Input b is only integer number!");
                } else {
                    check2++;

                }
                if (tmp3.isEmpty()) {
                    out.println("<br>Input c is blank!");
                } else if (!tmp3.matches("[+-]?[0-9]+")) {
                    out.print("<br>Input c is only integer number!");
                } else {
                    check3++;
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
                            out.println(a);
                        } else if (b >= a && b >= c) {
                            out.println(b);
                        } else {
                            out.println(c);
                        }
                    } else if ("less".equalsIgnoreCase(input1)) {
                        double min = a;
                        if (min > b) {
                            min = b;
                        }
                        if (min > c) {
                            min = c;
                        }
                        out.println(min);

                    } else {
                        out.println("Giai Phuong Trinh A^2 + B*X + C = 0");
                        if (a == 0) {
                            if (b == 0) {
                                out.println("<br>Phuong trinh vo nghiem!");
                            } else {
                                out.println("<br>Phuong trinh co nghiem: " + (-c / b));
                            }
                            return;
                        }
                        double delta = b * b - 4 * a * c;
                        double x1, x2;
                        if (delta > 0) {
                            x1 = (double) ((-b + Math.sqrt(delta)) / (2 * a));
                            x2 = (double) ((-b - Math.sqrt(delta)) / (2 * a));
                            out.println("<br>Phuong trinh co nghiem: "
                                    + "x1 = " + x1 + " va x2 = " + x2);
                        } else if (delta == 0) {
                            x1 = (-b / (2 * a));
                            out.println("<br>Phuong trinh co nghiem kep : "+ "x1 = x2 = " + x1);
                        } else {
                            out.println("<br>Phuong trinh vo nghiem!");
                        }
                    }
                } else {
                    if (check1 != 0 && check2 != 0) {
                        double a = Double.parseDouble(tmp1);
                        double b = Double.parseDouble(tmp2);
                        out.println("<br>USCLN AvsB:");
                        out.println(USCLN(a, b));
                        out.println("<br>BSCNN AvsB:");
                        out.println(BSCNN(a, b));
                    }
                    if (check2 != 0 && check3 != 0) {
                        double b = Double.parseDouble(tmp2);
                        double c = Double.parseDouble(tmp3);
                        out.println("<br>USCLN BvsC:");
                        out.println(USCLN(b, c));
                        out.println("<br>BSCNN BvsC:");
                        out.println(BSCNN(b, c));
                    }
                    if (check1 != 0 && check3 != 0) {
                        double a = Double.parseDouble(tmp1);
                        double c = Double.parseDouble(tmp3);
                        out.println("<br>USCLN AvsC:");
                        out.println(USCLN(a, c));
                        out.println("<br>BSCNN AvsC:");
                        out.println(BSCNN(a, c));
                    }
                }

            }
            if ("Xóa".equalsIgnoreCase(out1)) {
                return;
            }
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
        }
    }
}
