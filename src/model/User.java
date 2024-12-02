package model;

import java.io.Serializable;

public class User implements Serializable {

	private int accountNumber;//primary key
	private String name;
	private String email;
	private long phone;
	private double balance;
	private String password;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(int accountNumber, String name, String email, long phone, double balance, String password) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.balance = balance;
		this.password = password;
	}

	public User() {
	}
	
	

}
