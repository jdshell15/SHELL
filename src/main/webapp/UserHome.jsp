<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>

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



		<form method="post" action="/project1.0/UserHomeServlet">
			<button>Login</button>
		</form>


		<table>
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



	<form method="post" action="/project1.0/UserUpdateServlet">
		<input class="form-control" type="text" name="firstname" placeholder="Enter First Name" style="text-align: center">
		<input class="form-control" type="text" name="lastname" placeholder="Enter Last Name" style="text-align: center"> 
		<input class="form-control" type="password" name="password" placeholder="Enter Password" style="text-align: center"> 
		<input class="form-control" type="text" name="login" placeholder="Enter Login Name" style="text-align: center"> 
		<button>Login</button>
	</form>
<!--  <script src="./index.js"></script>-->
</body>
</html>