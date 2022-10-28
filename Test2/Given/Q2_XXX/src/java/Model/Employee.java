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

/**
 *
 * @author haiqd
 */
public class Employee {
    String id, name, gender, did;

    public Employee() {
        connect();
    }

    public Employee(String id, String name, String gender, String did) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.did = did;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
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
}
