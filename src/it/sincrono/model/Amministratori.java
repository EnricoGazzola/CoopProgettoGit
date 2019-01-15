package it.sincrono.model;


public class Amministratori{

	private String username;
	private String password;
	private int id;
	
	public int getId() {
		return id;
	}


	public Amministratori() {
		super();
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
}
