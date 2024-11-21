package com.example.repo;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;

@Repository
public class UserRepo {
    public static Connection establishConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/sb_users";
        Class.forName("com.mysql.cj.jdbc.Driver"); // Updated driver class
        String user = "root";
        String password = "Karanjad@202";
        return DriverManager.getConnection(url, user, password);
    }
}
