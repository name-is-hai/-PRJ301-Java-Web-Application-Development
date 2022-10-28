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
public class Department {
    String id, name;

    public Department() {
        connect();
    }

    public Department(String id, String name) {
        this.id = id;
        this.name = name;
        connect();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    Connection cnn;//ket noi DB
    Statement stm;//thu hien cau lenh sql
    ResultSet rs; //luu tru va su ly du lieu
    PreparedStatement pstm;//co the thu hien giong stm

    private void connect() {
        try {
            //Su dung DBcontext1
            cnn = (new DBContext()).getConnection();
            System.out.println("Connected");
        } catch (Exception e) {
            System.out.println("Connect error" + e.getMessage());
        }
    }
    
    public ArrayList<Department> getListDepartment() {
        ArrayList<Department> list = new ArrayList<Department>();
        try {
            String strSelect = "select * from Department";
            pstm = cnn.prepareStatement(strSelect);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String ID = rs.getString(1);
                String Name = rs.getString(2);
                list.add(new Department(ID, Name));
            }
        } catch (Exception e) {
            System.out.println("Get list department error: " + e.getMessage());
        }

        return list;
    }
}
