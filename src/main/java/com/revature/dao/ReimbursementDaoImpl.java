package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.users.Reimbursement;
import com.revature.utility.ConnectionFactory;



public class ReimbursementDaoImpl implements ReimbursementDao{

	@Override
	public List<Reimbursement> getAllReimbursement() {
		List<Reimbursement> reimbursement = new ArrayList<>();
		try (Connection conn = ConnectionFactory.getConnection()){
			// create our statement to communicate with the database
			Statement stmt = conn.createStatement();
			
			//execute the statement, all matched records can be found in the resultset
			ResultSet rs = stmt.executeQuery("SELECT * FROM reimbursement");
			
			//populate our list of reimbursement from the resultset
			while(rs.next()) {
				reimbursement.add(new Reimbursement(rs.getInt("id"), rs.getInt("amount"), rs.getString("request"), rs.getString("description"), rs.getString("status"), rs.getInt("manager")));
			}
			
			//return our todos so that the application can further manipulate
			return reimbursement;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Reimbursement getReimbursementById(int id) {
		// Reimbursement Auto-generated method stub
		return null;
	}

	@Override
	public Reimbursement createReimbursement(Reimbursement reimbursement) {
	
		//get a connection to our data source
		try (Connection conn = ConnectionFactory.getConnection()){
			//initialize our insert statement
			PreparedStatement stmt = 
					conn.prepareStatement("INSERT INTO reimbursement (id, amount, request, description, status, manager) Values(?,?,?,?,?,?)");
			//set the values of our insert statement to help prevent SQL injection
			stmt.setInt(1,  reimbursement.getId());
			stmt.setInt(2, reimbursement.getAmount());
			stmt.setString(3, reimbursement.getRequest());
			stmt.setString(4, reimbursement.getDescription());
			stmt.setString(5, reimbursement.getStatus());
			stmt.setInt(6, reimbursement.getManager());

			
			
			
			
			//execute the query, determining the number of rows that were affected
			int rowsAffected = stmt.executeUpdate();
			if(rowsAffected == 1)
				return reimbursement;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new Reimbursement();
	}

	@Override
	public Reimbursement updateReimbursement(Reimbursement toBeUpdated) {
		// Reimbursement Auto-generated method stub
		return null;
	}

	@Override
	public long deleteReimbursement(Reimbursement... toBeDeleted) {
		// Reimbursement Auto-generated method stub
		return 0;
	}
}
