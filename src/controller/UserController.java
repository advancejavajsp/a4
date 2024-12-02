package controller;

import java.sql.SQLException;

import dao.UserDao;
import model.User;

public class UserController implements UserControllerInteface {

	UserDao dao = new UserDao();

	@Override
	public boolean registerUser(User user) {

		try {
			return dao.saveUser(user);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public User login(int accountNum, String password) {

		return null;

	}

	@Override
	public boolean deposit(int account, double amount) {
		// logic
//	  User user=	map.get(account);
//	  user.setBalance(user.getBalance()+amount);

		return true;
	}

	@Override
	public boolean withdraw(int account, double amount) {
		System.out.println("withdraw");
		return false;
	}

	@Override
	public double balance(int accountNumber) {
//		User user=	map.get(accountNumber);
		return 0;
	}

}
