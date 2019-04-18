package com.revature.users;

public class Reimbursement {
	private int id;
	private int amount;
	private String request;
	private String description;
	private String status;
	private int manager;
	
	public Reimbursement() {
		
	}
	
	

	public Reimbursement(int id, int amount, String request, String description, String status, int manager) {
		super();
		this.id = id;
		this.amount = amount;
		this.request = request;
		this.description = description;
		this.status = status;
		this.manager = manager;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getManager() {
		return manager;
	}

	public void setManager(int manager) {
		this.manager = manager;
	}
	
}
