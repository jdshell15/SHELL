package com.revature.utility;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.dao.UsersDaoImpl;
import com.revature.service.UsersServiceImpl;
import com.revature.users.Users;

import java.sql.Connection;


public class ConnectionFactory {
    private final static String username = "jdshell";
    private final static String password = "hello";
    private final static String url = "jdbc:oracle:thin:@localhost:1521:xe";
//    public static void main(String[] args) {
//		Users john = new Users(15, "john","shell","mrshell", "mrshell","mrshell@gmail.com","users" );
//		UsersServiceImpl test = new UsersServiceImpl();
//		test.createUsers(john);
//	}
    

    private ConnectionFactory() {
    }

    public static Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            System.out.println("getConnection@Factory");
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.err.println("SQL State: " + e.getSQLState());
            System.err.println("Error Code: " + e.getErrorCode());
            throw new RuntimeException("Failed to get database connection");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Failed to locate Oracle Database Driver");
        }
    }
}
    
    
