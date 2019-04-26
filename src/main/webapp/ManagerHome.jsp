

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

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
<script type="text/javascript"></script>

	<script type="text/javascript">
	window.history.forward();
    function noBack()
    {
        window.history.forward();
    }
	</script>

<link rel="stylesheet" type="text/css" href="design.css">
<meta charset="ISO-8859-1">
<title>User Home Page</title>
</head>


<body onLoad="noBack();" onpageshow="if (event.persisted) noBack();"
	onUnload="">

<%=session.getAttribute("currentUser")%>!

	<div class="container-fluid" style="text-align: center">



		<form method="post" action="/p1-webapp/LogOutServlet">
			<button>Logout</button>
		</form>
		
		
<!-- 		<form method="post" action="/project1.0/LogOutServlet">
			<button>Populate Page</button>
		</form> -->

<p id ="ALLOFIT"> </p>

		<table id="customers">
			<thead>
				<tr>

					<th>ID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>User Type</th>
					<th>Password</th>
					<th>Login Info</th>
					<th>Email</th>

				</tr>
			</thead>
			<tbody id="userInfoTable"></tbody>
		</table>
		<br>
		<table id="customers">
			<thead>
				<tr>
					<th>Request ID</th>
					<th>Amount</th>
					<th>Description</th>
					<th>Status</th>
					<th>Manager ID</th>
				</tr>
				
			
				
			</thead>
			<tbody id="ReimbursementTable"></tbody>
		</table>
		
	<button type="button"  id="forceReimbursements">Get Reimbursements</button>
	</div>
	<br>
	<br>
	<br>
	<br>
	<br>
	<div class="container-fluid">
		<div class="row">
			<div class="col-3"></div>
			<div class="col-6">
				<form method="post" action="/p1-webapp/ManagerReimbursementServlet">
					<input type="text" style="text-align: center" name="id"
						placeholder="Reimbursment ID"> <input type="text"
						style="text-align: center" name="pending"
						placeholder="Approve/Deny"> <input type="text"
						style="text-align: center" name="manager" placeholder="Manager ID">

					<button style="background-color: #A1A1B9">Submit</button>
				</form>
			</div>
			<div class="col-3"></div>
		</div>
	</div>


	  <script src="./manager.js"></script> 
</body>
</html>