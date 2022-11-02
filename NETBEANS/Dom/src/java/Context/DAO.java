/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Context;

import Model.AccountAdmin;
import Model.AccountStudent;
import Model.Admin;
import Model.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

/**
 *
 * @author haiqd
 */
public class DAO extends DBContext {

    Statement stm;//thu hien cau lenh sql
    ResultSet rs; //luu tru va su ly du lieu
    PreparedStatement pstm;

    public AccountStudent checkAccountStudent(String acc, String pass) {
        String sql = "select * from [StudentAccount] where [Acc] = ? and [Pass] = ?";
        try {
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, acc);
            pstm.setString(2, pass);
            rs = pstm.executeQuery();
            if (rs.next()) {
                return new AccountStudent(acc, pass, rs.getString(3));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public AccountAdmin checkAccountAdmin(String acc, String pass) {
        String sql = "select * from [AdminAccount] where [Acc] = ? and [Pass] = ?";
        try {
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, acc);
            pstm.setString(2, pass);
            rs = pstm.executeQuery();
            if (rs.next()) {
                return new AccountAdmin(acc, pass, rs.getString(3));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public Student getStudentByID(AccountStudent as) {
        String sql = "select * from [Student] where [StudentID] = ?";
        try {
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, as.getStudentid());
            rs = pstm.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString(2);
                String gender = "Male";
                if (rs.getBoolean(3) != false) {
                    gender = "Female";
                }
                String phone = rs.getString(4);
                String email = rs.getString(5);
                SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
                String dob = f.format(rs.getDate(6));
                String img = rs.getString(7);
                if(img.trim().isEmpty()){
                    img = "user.webp";
                }
                Student s = new Student(id, name, gender, phone, email, dob, img);
                return s;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public Admin getAdminByID(AccountAdmin aa) {
        String sql = "select * from [Admin] where [AdminID] = ?";
        try {
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, aa.getAdminid());
            rs = pstm.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString(2);
                String gender = "Male";
                if (rs.getBoolean(3) != false) {
                    gender = "Female";
                }
                String phone = rs.getString(4);
                String email = rs.getString(5);
                SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
                String dob = f.format(rs.getDate(6));
                String img = rs.getString(7);
                if(img.trim().isEmpty()){
                    img = "user.webp";
                }
                Admin a = new Admin(id, name, gender, phone, email, dob, img);
                return a;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
