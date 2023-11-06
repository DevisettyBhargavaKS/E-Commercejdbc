package com.codewithbhargav.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Connection connection=null;

    private final static String connectionurl="jdbc:mysql://localhost:3306/java";
    private final static String username="root";
    private final static String password="root";
    public static Connection  getconnection(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection(
                    connectionurl,username,password);
            System.out.println("connection"+!connection.isClosed());


        } catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public static void createData() {
        Connection con=getconnection();
        try {
            con.createStatement().executeUpdate(""+"insert into auth(username,password)values"+"('bhargav','123');"+"");
            con.createStatement().executeUpdate(""+"insert into auth(username,password)values"+"('siva','456');"+"");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


}


