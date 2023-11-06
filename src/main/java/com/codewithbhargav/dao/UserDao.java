package com.codewithbhargav.dao;



import com.codewithbhargav.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private final Connection connection;
    public  UserDao(){
        connection= com.codewithbhargav.db.Database.getconnection();

    }
    private String selectSQL="select id,username,password from auth where username=? and password=?";
    private String registerSQL="insert into auth(username,password)values(?,?);";
    public User loginUser(String username, String password){
        User user=null;

        try {
            PreparedStatement ps=connection.prepareStatement(selectSQL);
            ps.setString(1,username);
            ps.setString(2,password);
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
                user=new User();
                user.setId(Integer.parseInt(rs.getString("id")));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;

    }

    public void register(String username, String password) {
        try {
            PreparedStatement rt=connection.prepareStatement(registerSQL);
            rt.setString(1,username);
            rt.setString(2,password);
            rt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
