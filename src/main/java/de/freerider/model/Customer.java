package de.freerider.model;

public class Customer {
	private String id;
	private String lastName;
	private String firstName;
	private String contact;
	public enum Status{
		New,
		InRegistration,
		Active,
		Suspended,
		Deleted,
	}
	private Status stat;
	
	public Customer (String firstName,String lastName,String contact) {
		setId(null);
		setLastName(lastName);
		setFirstName(firstName);
		setContact(contact);
		setStatus(Status.New);
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
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	public Status getStatus() {
		return stat;
	}
	public void setStatus(Status stat) {
		this.stat = stat;
	}

}
