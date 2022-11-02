/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import context.DBContext1;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author haiqd
 */
public class User {

    String account, password, name, gender, address, dob;

    public User() {
        connect();
    }

    public User(String account, String password, String name, String gender, String address, String dob) {
        this.account = account;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dob = dob;
        connect();
    }

    public User(String account, String pass) {
        this.account = account;
        this.password = pass;
        connect();
    }

    public User(String search) {
        this.account = search;
        connect();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public boolean checkLogin() {
//        try {
//            String strSelect = "select * from Users "
//                    + "where account = '" + account + "' and "
//                    + "password = '" + password + "'";
//            stm = cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//            rs = stm.executeQuery(strSelect);
//            while (rs.next()) {
//                return true;
//            }
//        } catch (Exception e) {
//            System.out.println("Login error" + e.getMessage());
//        }
//        return false;
        try {
            String strSelect = "select * from Users "
                    + "where account = ? and "
                    + "password = ?";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, account);
            pstm.setString(2, password);
            rs = pstm.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Login error" + e.getMessage());
        }
        return false;
    }

    //tao cac thanh phan su lys db
    Connection cnn;//ket noi DB
    Statement stm;//thu hien cau lenh sql
    ResultSet rs; //luu tru va su ly du lieu
    PreparedStatement pstm;//co the thu hien giong stm

    private void connect() {
        try {
            //Su dung DBcontext1
            cnn = (new DBContext1()).getConnection();
            System.out.println("Connected");
        } catch (Exception e) {
            System.out.println("Connect error" + e.getMessage());
        }
    }

    public boolean checkUser(String account, String dob) {
        try {
            String strSelect = "select * from Users "
                    + "where account = ? and "
                    + "dateofbirth = ?";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, account);
            pstm.setString(2, dob);
            rs = pstm.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Check User error" + e.getMessage());
        }
        return false;
    }

    public void updatePass(String account, String newPass) {
        try {
            String strUpdate = "update Users "
                    + "set password = ? "
                    + "where account = ?";
            pstm = cnn.prepareStatement(strUpdate);
            pstm.setString(1, newPass);
            pstm.setString(2, account);
            pstm.execute();
        } catch (Exception e) {
            System.out.println("Update error" + e.getMessage());
        }
    }

    public boolean checkRegester(String acc) {
        try {
            String strSelect = "select * from Users "
                    + "where account = ?";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, acc);
            rs = pstm.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Check User error" + e.getMessage());
        }
        return false;
    }

    public void Regester(String acc, String pass, String name, String gender, String addr, String dob) {
        try {
            String insert = "insert into Users(account, Password, name, gender, address, dateofbirth) "
                    + "values (?, ?, ?, ?, ?, ?)";
            pstm = cnn.prepareStatement(insert);
            pstm.setString(1, acc);
            pstm.setString(2, pass);
            pstm.setString(3, name);
            pstm.setString(4, gender);
            pstm.setString(5, addr);
            pstm.setString(6, dob);
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Regester User error" + e.getMessage());
        }
    }

    public ArrayList<User> getListUser() {
        ArrayList<User> list = new ArrayList<User>();
        try {
            String strSelect = "select * from Users";
            pstm = cnn.prepareStatement(strSelect);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String acc = rs.getString(1);
                String pass = rs.getString(2);
                String name = rs.getString(3);
                String gender = "Male";
                if (rs.getBoolean(4) == false) {
                    gender = "Female";
                }
                String addr = rs.getString(5);
                SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
                String dob = f.format(rs.getDate(6));
                User u = new User(acc, pass, name, gender, addr, dob);
                list.add(u);
            }
        } catch (Exception e) {
            System.out.println("get list user error: " + e.getMessage());
        }
        return list;

    }

    public boolean searchAcc(String account) {
        try {
            String strSelect = "select * from Users "
                    + "where account = ?";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, account);
            rs = pstm.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Search User error" + e.getMessage());
        }
        return false;
    }

    public ArrayList<User> getListUserByAccount(String account) {
        ArrayList<User> list = new ArrayList<User>();
        try {
            String strSelect = "select * from Users "
                    + "where account = ?";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, account);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String acc = rs.getString(1);
                String pass = rs.getString(2);
                String name = rs.getString(3);
                String gender = "Male";
                if (rs.getBoolean(4) == false) {
                    gender = "Female";
                }
                String addr = rs.getString(5);
                SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
                String dob = f.format(rs.getDate(6));
                User u = new User(acc, pass, name, gender, addr, dob);
                list.add(u);
            }
        } catch (Exception e) {
            System.out.println("Get list user error: " + e.getMessage());
        }
        return list;
    }

}
