/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import context.DBContext1;
import context.DBContext2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author haiqd
 */
public class Product {
    String code, name, price, unitsInStock, image;

    public Product() {
        connect();
    }

    public Product(String code, String name, String price, String unitsInStock, String image) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.unitsInStock = unitsInStock;
        this.image = image;
        connect();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(String unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    Connection cnn;//ket noi DB
    Statement stm;//thu hien cau lenh sql
    ResultSet rs; //luu tru va su ly du lieu
    PreparedStatement pstm;//co the thu hien giong stm

    private void connect() {
        try {
            //Su dung DBcontext1
            cnn = (new DBContext2()).getConnection();
            System.out.println("Connected");
        } catch (Exception e) {
            System.out.println("Connect error" + e.getMessage());
        }
    }
    
    public ArrayList<Product> getListProducṭ(){
        ArrayList<Product> listProduct = new ArrayList<>();
        try{
            String strSelect = "select * from Products";
            pstm = cnn.prepareStatement(strSelect);
            rs = pstm.executeQuery();
            while(rs.next()){
                String id = rs.getString(1);
                String name = rs.getString(2);
                String price = rs.getString(3);
                String stock = rs.getString(4);
                String image = rs.getString(5);
                Product p = new Product(id, name, price, stock, image);
                listProduct.add(p);
            }
        }catch(Exception e){
            System.out.println("get list Product error: " + e.getMessage());
        }
        return listProduct;
    }
    
}
