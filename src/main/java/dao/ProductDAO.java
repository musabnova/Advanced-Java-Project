package dao;

import java.sql.*;
import java.util.*;
import model.Product;

public class ProductDAO {

    // 🔹 ADD PRODUCT (MANUAL ID)
    public void addProduct(Product p) {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO Products VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, p.getProductId());
            ps.setString(2, p.getProductName());
            ps.setString(3, p.getCategory());
            ps.setDouble(4, p.getPrice());
            ps.setInt(5, p.getQuantity());

            ps.executeUpdate();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔹 DISPLAY ALL PRODUCTS
    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();

        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM Products");

            while (rs.next()) {
                Product p = new Product();

                p.setProductId(rs.getInt("ProductID"));
                p.setProductName(rs.getString("ProductName"));
                p.setCategory(rs.getString("Category"));
                p.setPrice(rs.getDouble("Price"));
                p.setQuantity(rs.getInt("Quantity"));

                list.add(p);
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // 🔹 DELETE PRODUCT
    public void deleteProduct(int id) {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "DELETE FROM Products WHERE ProductID=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔹 UPDATE PRODUCT
    public void updateProduct(Product p) {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "UPDATE Products SET ProductName=?, Category=?, Price=?, Quantity=? WHERE ProductID=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, p.getProductName());
            ps.setString(2, p.getCategory());
            ps.setDouble(3, p.getPrice());
            ps.setInt(4, p.getQuantity());
            ps.setInt(5, p.getProductId());

            ps.executeUpdate();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔹 REPORT: PRICE GREATER THAN
    public List<Product> getProductsByPrice(double price) {
        List<Product> list = new ArrayList<>();

        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM Products WHERE Price > ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, price);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product p = new Product();

                p.setProductId(rs.getInt("ProductID"));
                p.setProductName(rs.getString("ProductName"));
                p.setCategory(rs.getString("Category"));
                p.setPrice(rs.getDouble("Price"));
                p.setQuantity(rs.getInt("Quantity"));

                list.add(p);
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // 🔹 REPORT: CATEGORY FILTER
    public List<Product> getProductsByCategory(String category) {
        List<Product> list = new ArrayList<>();

        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM Products WHERE Category=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, category);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product p = new Product();

                p.setProductId(rs.getInt("ProductID"));
                p.setProductName(rs.getString("ProductName"));
                p.setCategory(rs.getString("Category"));
                p.setPrice(rs.getDouble("Price"));
                p.setQuantity(rs.getInt("Quantity"));

                list.add(p);
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // 🔹 REPORT: TOP N PRODUCTS
    public List<Product> getTopProducts(int n) {
        List<Product> list = new ArrayList<>();

        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM Products ORDER BY Quantity DESC LIMIT ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, n);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product p = new Product();

                p.setProductId(rs.getInt("ProductID"));
                p.setProductName(rs.getString("ProductName"));
                p.setCategory(rs.getString("Category"));
                p.setPrice(rs.getDouble("Price"));
                p.setQuantity(rs.getInt("Quantity"));

                list.add(p);
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}