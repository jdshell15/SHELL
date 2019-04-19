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



		<form method="post" action="/project1.0/UserHomeServlet">
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

	<div id="login">
		<form method="post" action="/project1.0/UserUpdateServlet">
			<input class="form-control" type="text" name="firstname"
				placeholder="Enter First Name" style="text-align: center"> <input
				class="form-control" type="text" name="lastname"
				placeholder="Enter Last Name" style="text-align: center"> <input
				class="form-control" type="password" name="password"
				placeholder="Enter Password" style="text-align: center"> <input
				class="form-control" type="text" name="login"
				placeholder="Enter Login Name" style="text-align: center">
			<button>Update</button>
		</form>
	</div>
<br><br><br>
<form>
<div class="container-fluid" style="align:center">
        <div class="row">
            <div class="col-3"></div>
            <div class="col-12">
                <form>
               		
                    <input type="number" style="text-align: center" name="UserId" placeholder="ID">
					<input type="number" style="text-align: center" name="amount" placeholder="Requested Amount">
                    <input type="text" style="text-align: center" name="description" placeholder="Description">
                    <input type="text" style="text-align: center" name="status" placeholder="Status">
                    <button style="background-color: #A1A1B9">Submit</button>
                </form>
            </div>
            <div class="col-3"></div>
        </div>
    </div>
</form>
	<!--  <script src="./index.js"></script>-->
</body>
</html>