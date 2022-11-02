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
public class Product extends DBContext2 {

    String code, name, price, unitsInStock, image;
//    Connection cnn;//ket noi DB
    Statement stm;//thu hien cau lenh sql
    ResultSet rs; //luu tru va su ly du lieu
    PreparedStatement pstm;//co the thu hien giong stm

    public Product() {
    }

    public Product(String code, String name, String price, String unitsInStock, String image) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.unitsInStock = unitsInStock;
        this.image = image;
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

    public ArrayList<Product> getListProducṭ() {
        ArrayList<Product> listProduct = new ArrayList<>();
        try {
            String strSelect = "select * from Products";
            pstm = connection.prepareStatement(strSelect);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString(2);
                String price = rs.getString(3);
                String stock = rs.getString(4);
                String image = rs.getString(5);
                Product p = new Product(id, name, price, stock, image);
                listProduct.add(p);
            }
        } catch (Exception e) {
            System.out.println("get list Product error: " + e.getMessage());
        }
        return listProduct;
    }

    public Product getProductById(String code) {
        try {
            String strSelect = "select * from Products where ProductID = ?";
            pstm = connection.prepareStatement(strSelect);
            pstm.setString(1, code);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String name = rs.getString(2);
                String price = rs.getString(3);
                String stock = rs.getString(4);
                String image = rs.getString(5);
                Product p = new Product(code, name, price, stock, image);
                return p;
            }
        } catch (Exception e) {
            System.out.println("get list Product error: " + e.getMessage());
        }
        return null;
    }

    public void updateByCode(String code, String name, String price) {
        try {
            String strUpdate = "UPDATE Products SET ProductName = ?, UnitPrice = ? WHERE ProductID = ?";
            pstm = connection.prepareStatement(strUpdate);
            pstm.setString(1, name);
            pstm.setString(2, price);
            pstm.setString(3, code);
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Update product error: " + e.getMessage());
        }
    }

    public void deleteByCode(String code) {
        try {
            String strDelete = "DELETE FROM Products WHERE ProductID = ?";
            pstm = connection.prepareStatement(strDelete);
            pstm.setString(1, code);
            pstm.execute();
        } catch (Exception e) {
            System.out.println("Delete product error: " + e.getMessage());
        }
    }

    public void addNewProduct(String id, String name, String price, String stock, String img, String category, String discontinued) {
        try {
            String strAdd = "SET IDENTITY_INSERT [dbo].[Products] ON  INSERT [dbo].[Products] ([ProductID], [ProductName], [UnitPrice], [UnitsInStock],[Image], [CategoryID], [Discontinued]) VALUES (?, ?, ?, ?, ?, ?, ?)";
            pstm = connection.prepareStatement(strAdd);
            pstm.setString(1, id);
            pstm.setString(2, name);
            pstm.setString(3, price);
            pstm.setString(4, stock);
            pstm.setString(5, img);
            pstm.setString(6, category);
            pstm.setString(7, discontinued);
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Add error" + e.getMessage());
        }
    }

}
