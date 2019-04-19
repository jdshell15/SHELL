window.onload = () =>{
	getAllTodos();
	document.getElementById("createTodoBtn").addEventListener("click",createTodo);
}


const getAllTodos = () => {
	// step 1: create an XMLHttpRequest object
	const xhr = new XMLHttpRequest();
	
	// step 2: assign a call back function to the xhr.onreadystatechange
	xhr.onreadystatechange = () =>{
	
		// step 5: we handle each of the different possible outcomes from making
		// this request
		if(xhr.status === 200 && xhr.readyState === 4){
			const json = xhr.responseText;
			console.log(json);
			populateTodoTable(JSON.parse(json));
		}
		
	};
	
	// step 3: we call xhr.open(), passing in 2 strings for the HTTP MEthod and
	// URL
	xhr.open("GET","http://localhost:8088/ServletExample/api/todos");
	
	// step 4: call the xhr.send() to actually fire off your HTTP request
	xhr.send();
}


const populateTodoTable = (listOfTodos) => {
	// the for...of loop is JavaScripts version of the enchanced for loop
	for(let todo of listOfTodos){
		
		// create a table cell for each property of our object
		const tdId = document.createElement("td");
		const tdTitle = document.createElement("td");
		const tdDescription = document.createElement("td");
		
		// set the value of each cell
		tdId.textContent = todo.id;
		tdTitle.textContent = todo.title;
		tdDescription.textContent = todo.description;
		
		// create a row to be appended onto our table
		
		const row = document.createElement("tr");
		
		// set the td to the corresponding order of our table header
		row.appendChild(tdId);
		row.appendChild(tdTitle);
		row.appendChild(tdDescription);
		
		// append our row onto our table of todos
		document.getElementById("todoTable").appendChild(row);
	}
}


// for ( Todo todo: myListOfTodos){
// dos something here
// }



const createTodo = () => {
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