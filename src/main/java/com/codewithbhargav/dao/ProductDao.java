package com.codewithbhargav.dao;


import com.codewithbhargav.db.Database;
import com.codewithbhargav.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private static Connection con;
    public ProductDao() {
        con = Database.getconnection();
    }
    private static String selectAllProductSQL = "SELECT * FROM products";
    private static String INSERT_CART="insert into Cart(productId,userId)values(?,?);";

    public static List<Product> selectAllProducts() {
        List<Product> Products = new ArrayList<Product>();
        try {
            PreparedStatement ps = con.prepareStatement(selectAllProductSQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setId(Integer.parseInt(rs.getString("id")));
                product.setTitle(rs.getString("title"));
                product.setPrice(rs.getInt("price"));
                product.setImage(rs.getString("image"));
                Products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Products;
    }
    public void addProduct(int productId,int userId) {
        try {
            PreparedStatement ps = con.prepareStatement(INSERT_CART);
            ps.setInt(1,productId);
            ps.setInt(2,userId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}