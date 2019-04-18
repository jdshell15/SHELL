package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.chainsaw.Main;

import com.revature.users.Users;
import com.revature.utility.ConnectionFactory;

public class UsersDaoImpl implements UsersDao {

	@Override
	public List<Users> getAllUsers() {
		List<Users> users = new ArrayList<>();
		try (Connection conn = ConnectionFactory.getConnection()){
			// create our statement to communicate with the database
			Statement stmt = conn.createStatement();
			
			//execute the statement, all matched records can be found in the resultset
			ResultSet rs = stmt.executeQuery("SELECT * FROM users");
			
			//populate our list of Users from the resultset
			while(rs.next()) {
				users.add(new Users(rs.getInt("id"), rs.getString("firstname"), rs.getString("lastname"), rs.getString("email"), rs.getString("password"), rs.getString("usertype"), rs.getString("logininfo")));
			}
			
			//return our Users so that the application can further manipulate
			return users;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public Users getUsersById(int id) {
		// USERS Auto-generated method stub
		return null;
	}

	@Override
	public Users createUsers(Users users) {
	
		//get a connection to our data source
		try (Connection conn = ConnectionFactory.getConnection()){
			//initialize our insert statement
			PreparedStatement stmt = 
					conn.prepareStatement("INSERT INTO users (id, firstname, lastname, logininfo, password, email, usertype) Values(?,?,?,?,?,?,?)");
			//set the values of our insert statement to help prevent SQL injection
			stmt.setInt(1,  users.getId());
			stmt.setString(2, users.getFirstname());
			stmt.setString(3, users.getLastname());
			stmt.setString(4, users.getLogin());
			stmt.setString(5, users.getPassword());
			stmt.setString(6, users.getEmail());
			stmt.setString(7, users.getUsertype());
			
			
			
			
			//execute the query, determining the number of rows that were affected
			int rowsAffected = stmt.executeUpdate();
			if(rowsAffected == 1)
				return users;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new Users();
	}

	@Override
	public Users updateUsers(Users toBeUpdated) {
		// USERS Auto-generated method stub
		return null;
	}

	@Override
	public long deleteUsers(Users... toBeDeleted) {
		// USERS Auto-generated method stub
		return 0;
	}
}
