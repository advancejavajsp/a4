package controller;

import model.User;

public interface UserControllerInteface {

	boolean registerUser(User user);

	User login(int accountNum, String password);

	boolean deposit(int account, double amount);

	boolean withdraw(int account, double amount);

	double balance(int accountNumber);
}
