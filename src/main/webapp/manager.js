window.onload = () =>{
	getAllUsers();
	//createTodo();
	//document.getElementById("createTodoBtn").addEventListener("click",createTodo);
}


const getAllUsers = () => {
	// step 1: create an XMLHttpRequest object
	const xhr = new XMLHttpRequest();
	
	// step 2: assign a call back function to the xhr.onreadystatechange
	xhr.onreadystatechange = () =>{
	
		// step 5: we handle each of the different possible outcomes from making
		// this request
		if(xhr.status === 200 && xhr.readyState === 4){
			const json = xhr.responseText;
			console.log(json);
			
			//popTest(JSON.parse(json));
			populateUsersTable(JSON.parse(json));
		}
		
	};
	
	// step 3: we call xhr.open(), passing in 2 strings for the HTTP MEthod and
	// URL
	console.log("just before xhr.open");
	xhr.open("GET","http://localhost:8088/project1.0/users");
	console.log("just after xhr.open");
	// step 4: call the xhr.send() to actually fire off your HTTP request
	xhr.send();
}

const popTest = (listOfUsers) => {
	
	document.getElementById("ALLOFIT").innerHTML = listOfUsers[0].firstname;

}

const populateUsersTable = (listOfUsers) => {
	// the for...of loop is JavaScripts version of the enchanced for loop
	for(let user of listOfUsers){
		
		// create a table cell for each property of our object
		const tdId = document.createElement("td");
		const tdFirstName = document.createElement("td");
		const tdLastName = document.createElement("td");
		const tdEmail = document.createElement("td");
		const tdPassword = document.createElement("td");
		const tdUserType = document.createElement("td");
		const tdLoginInfo = document.createElement("td");

		
		
		// set the value of each cell
		tdId.textContent = user.id;
		tdFirstName.textContent = user.firstname;
		tdLastName.textContent = user.lastname;
		tdEmail.textContent = user.email;
		tdPassword.textContent = user.password;
		tdUserType.textContent = user.usertype;
		tdLoginInfo.textContent = user.logininfo;

		
		// create a row to be appended onto our table
		
		const row = document.createElement("tr");
		
		// set the td to the corresponding order of our table header
		row.appendChild(tdId);
		row.appendChild(tdFirstName);
		row.appendChild(tdLastName);
		row.appendChild(tdEmail);
		row.appendChild(tdPassword);
		row.appendChild(tdUserType);
		row.appendChild(tdLoginInfo);
		
		// append our row onto our table of todos
		document.getElementById("userInfoTable").appendChild(row);
	}
}


// for ( Todo todo: myListOfTodos){
// dos something here
// }



const createUsers = () => {
	// step 1: create the xhr object
	const xhr = new XMLHttpRequest();
	
	// step 1a: create a helper variable for your form data
	const formData = parseForm();
	
	
	
	// step 2: assign the callback function xhr.onreadystatechange
	xhr.onreadystatechange = () =>{
		if(xhr.status === 200 && xhr.readyState === 4){
			const json = xhr.responseText;
			
			console.log(json);
		}
	}
	
	// step 3: open up the request
	xhr.open("POST", "http://localhost:8088/ServletExample/api/todos");
	
	// step 4: we send off the request
	xhr.send(JSON.stringify(formData));
}

const parseForm = () => {
	const titleText = document.getElementById("title").value;
	const descriptionText = document.getElementById("description").value;
	
	return {
		title: titleText,
		description: descriptionText
	}
}