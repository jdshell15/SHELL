<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<style>
#customers {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #A1A1B9;
  color: white;
}
</style>
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-3.3.1.min.js"
	integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>


<link rel="stylesheet" type="text/css" href="design.css">
<meta charset="ISO-8859-1">
<title>User Home Page</title>
</head>
<body>
<body>


	<div class="container-fluid" style="text-align: center">



		<form method="post" action="/project1.0/LogOutServlet">
			<button>Logout</button>
		</form>


		<table id="customers">
			<thead>
				<tr>

					<th>ID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Password</th>
					<th>User Type</th>
					<th>Login Info</th>


				</tr>
			</thead>
			<tbody id="userTable"></tbody>
		</table>


	</div>
<br><br><br><br><br>
	<div class="container-fluid">
        <div class="row">
            <div class="col-3"></div>
            <div class="col-6">
                <form  method="post" action="/project1.0/ManagerReimbursementServlet">
               		 <input type="text" style="text-align: center" name="id" placeholder="Reimbursment ID">
                    <input type="text" style="text-align: center" name="pending" placeholder="Approve/Deny">
					<input type="text" style="text-align: center" name="manager" placeholder="Manager ID">
                    
                    <button style="background-color: #A1A1B9">Submit</button>
                </form>
            </div>
            <div class="col-3"></div>
        </div>
    </div>


	<!--  <script src="./index.js"></script>-->
</body>
</html>