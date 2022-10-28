/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import dal.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author haiqd
 */
public class Student {

    String stdID, stdName, gender, dID;

    public Student() {
        connect();
    }

    public Student(String stdID, String stdName, String gender, String dID) {
        this.stdID = stdID;
        this.stdName = stdName;
        this.gender = gender;
        this.dID = dID;
        connect();
    }

    //tao cac tp xu ly DB
    Connection cnn;//ket noi db
    Statement stm;//Thuc hien cau lenh sql
    ResultSet rs;//Luu tru va xu ly du lieu
    PreparedStatement pstm;//Co the thuc hien giong stm

    private void connect() {
        try {
            //Su dung DBContext1
            cnn = (new DBContext()).getConnection();
            System.out.println("Connect success");
        } catch (Exception e) {
            System.out.println("Connect error:" + e.getMessage());
        }
    }

    public String getStdID() {
        return stdID;
    }

    public void setStdID(String stdID) {
        this.stdID = stdID;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getdID() {
        return dID;
    }

    public void setdID(String dID) {
        this.dID = dID;
    }


    public ArrayList<Student> getListStudent() {
        ArrayList<Student> list = new ArrayList<Student>();
        try {
            String strSelect = "select s.id, s.name, s.gender, d.name\n"
                    + "from Student s, Department d\n"
                    + "where s.did = d.id";
            pstm = cnn.prepareStatement(strSelect);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String stdID = rs.getString(1);
                String stdName = rs.getString(2);
                String gender = "true";
                if(rs.getInt(3)==0){
                    gender = "false";
                }
                String dID = rs.getString(4);
                Student s = new Student(stdID, stdName, gender, dID);
                list.add(s);
            }
        } catch (Exception e) {
            System.out.println("Get list student error: " + e.getMessage());
        }

        return list;
    }

    public void addStudent(String stdID, String stdName, String gender, String dID) {
        try {
            String strInsert = "insert into Student "
                    + " values (?, ?, ?, ?)";

            pstm = cnn.prepareStatement(strInsert);
            pstm.setString(1, stdID);
            pstm.setString(2, stdName);
            pstm.setString(3, gender);
            pstm.setString(4, dID);
            
            pstm.executeUpdate();

        } catch (Exception e) {
            System.out.println("Insert student error: " + e.getMessage());
        }
    }


}
