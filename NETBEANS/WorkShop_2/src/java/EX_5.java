
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
        resp.setContentType("charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {
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
            String output1 = "";
            String output2 = "";
            String output3 = "";
            String inputVal = "";
            String inputVal1 = "";
            String inputVal2 = "";
            String inputVal3 = "";
            String inputVal4 = "";
            if ("submit".equalsIgnoreCase(submit)) {
                if (input.isEmpty()) {
                    inputVal = "Input (Nhap doan van ban) is blank!";
                } else {
                    inputVal = input;
                    output = String.valueOf(input.length());
                }
                req.setAttribute("type", "5");
                req.setAttribute("input", inputVal);
                req.setAttribute("output", output);
                req.getRequestDispatcher("Ex_Servlet.jsp").forward(req, resp);
                req.getRequestDispatcher("Ex5.jsp").include(req, resp);
            }
            if ("submit".equalsIgnoreCase(submit1)) {
                if (input.isEmpty()) {
                    inputVal = "Input (Nhap doan van ban) is blank!";
                } else if (input2.isEmpty()) {
                    inputVal1 = "Input (Nhap vi tri) is blank!";
                    inputVal = input;
                } else {
                    if (!input2.matches("[0-9]+")) {
                        inputVal1 = "Input (Nhap vi tri) is only integer number!";
                        inputVal = input;
                    } else {
                        inputVal = input;
                        inputVal1 = input2;
                        int k = Integer.parseInt(input2);
                        char[] words = input.toCharArray();
                        if (k > words.length || k < 0) {
                            output1 = "Not Found!";
                        } else {
                            output1 = String.valueOf(words[k - 1]);
                        }
                    }
                }
                req.setAttribute("type", "5");
                req.setAttribute("input", inputVal);
                req.setAttribute("input1", inputVal1);
                req.setAttribute("output1", output1);
                req.getRequestDispatcher("Ex_Servlet.jsp").forward(req, resp);
                req.getRequestDispatcher("Ex5.jsp").include(req, resp);
            }
            if ("submit".equalsIgnoreCase(submit2)) {
                if (input.isEmpty()) {
                    inputVal = "Input (Nhap doan van ban) is blank!";
                } else if (input3.isEmpty()) {
                    inputVal2 = "Input (Nhap chuoi) is blank!";
                    inputVal = input;
                } else {
                    inputVal = input;
                    inputVal2 = input3;
                    char[] word = input3.toCharArray();
                    char[] words = input.toCharArray();
                    int count = 0;
                    for (int i = 0; i < words.length; i++) {
                        for (int j = 0; j < word.length; j++) {
                            if (word[j] == words[i]) {
                                output2 += String.valueOf((i + 1) + " ");
                                count++;
                            }
                        }
                    }
                    if (count == 0) {
                        output2 = "Not Found!";
                    }
                }
                req.setAttribute("type", "5");
                req.setAttribute("input", inputVal);
                req.setAttribute("input2", inputVal2);
                req.setAttribute("output2", output2);
                req.getRequestDispatcher("Ex_Servlet.jsp").forward(req, resp);
                req.getRequestDispatcher("Ex5.jsp").include(req, resp);
            }
            if ("submit".equalsIgnoreCase(submit3)) {
                if (input.isEmpty()) {
                    inputVal = "Input (Nhap doan van ban) is blank!";
                } else {
                    if (input4.isEmpty()) {
                        inputVal3 = "Input (Nhap vi tri can tach tu) is blank!";
                        inputVal = input;
                    } else {
                        if (!input4.matches("[0-9]+")) {
                            inputVal3 = "Input (Nhap vi tri can tach tu) is only integer number!";
                            inputVal = input;
                        } else {
                            inputVal3 = input4;
                            inputVal = input;
                        }
                    }
                    if (input5.isEmpty()) {
                        inputVal4 = "Input (Den) is blank!";
                        inputVal = input;
                    } else {
                        if (!input5.matches("[0-9]+")) {
                            inputVal4 = "Input (Den) is only integer number!";
                            inputVal = input;
                        } else {
                            inputVal4 = input5;
                            inputVal = input;
                            int k = Integer.parseInt(input4);
                            int t = Integer.parseInt(input5);
                            char[] words = input.toCharArray();
                            if (k > t) {
                                output3 = "(Nhap vi tri can tach tu) < (Den)";
                                inputVal = input;
                            } else {
                                if (k > words.length || t > words.length || k < 0 || t < 0) {
                                    output3 = "Not Found!";
                                    inputVal = input;
                                } else {
                                    inputVal = input;
                                    for (int i = k; i <= t; i++) {
                                        output3 += String.valueOf(words[i-1] + " ");
                                    }
                                }
                            }
                        }
                    }
                }
                req.setAttribute("type", "5");
                req.setAttribute("input", inputVal);
                req.setAttribute("input3", inputVal4);
                req.setAttribute("input4", inputVal3);
                req.setAttribute("output3", output3);
                req.getRequestDispatcher("Ex_Servlet.jsp").forward(req, resp);
            }

        } catch (Exception e) {
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

}
