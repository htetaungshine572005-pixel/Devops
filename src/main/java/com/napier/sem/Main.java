package com.napier.sem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/test_db?useSSL=false&allowPublicKeyRetrieval=true", "testuser", "testtest");
            System.out.println("Connected to the Database Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    static void main() {
        Main main = new Main();
        Connection conn = main.getConnection();



        try {
            conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
