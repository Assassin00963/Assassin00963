package de.freerider.model;

public class Customer {
	private String id;
	private String lastName;
	private String firstName;
	private String contact;
	private enum Status{
		New,
		InRegistration,
		Active,
		Suspended,
		Deleted,
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
