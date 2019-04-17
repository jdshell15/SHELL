package jbdc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class UsersUtility {

		private DataSource dataSource;
		
		public UsersUtility(DataSource theDataSource) {
			dataSource = theDataSource;
		}
		
		public List<Users> getUser() throws Exception{
			
			List<Users> users = new ArrayList<Users>(); //ask about diamond operator
			
			Connection myConn = null;
			Statement myStmt = null;
			ResultSet myRs = null;
			
			try {
			//get a connection
			myConn = dataSource.getConnection();
			//create sql statement
			String sql = "Select * from users order by firstname";
			myStmt = myConn.createStatement();
			
			//execute query
			myRs = myStmt.executeQuery(sql);
			//process result set
			while (myRs.next()) {
				//retrieve data from a result set row
				int id = myRs.getInt("id");
				String firstName = myRs.getString("firstname");
				String lastName = myRs.getString("lastname");
				String password = myRs.getString("password");
				String email = myRs.getString("email");
				String utype = myRs.getString("utype");
				int upending = myRs.getInt("upending");
				int uresolve = myRs.getInt("uresolve");
				
				//create new student object
				Users tempUser = new Users(id,firstName,lastName,password,email,utype,upending,uresolve);
				
				//add it to the list
				users.add(tempUser);
				
			}
			
				return users;
			}
			finally {
				//close JDBC objects
				
				close(myConn, myStmt, myRs);
			}

			
		}

		private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
			try {
				if(myRs != null) {
					myRs.close();
				}
				if(myStmt != null) {
					myStmt.close();
				}
				if(myConn !=null) {
					myConn.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
}
