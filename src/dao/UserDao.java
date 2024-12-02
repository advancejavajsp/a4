package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.User;

public class UserDao {
	Connection connection;

	public UserDao() {
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/a4?user=postgres&password=root");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean saveUser(User user) throws SQLException {

		PreparedStatement preparedStatement = connection.prepareStatement("insert into users values(?,?,?,?,?,?);");
		preparedStatement.setInt(1, user.getAccountNumber());
		preparedStatement.setString(2, user.getName());
		preparedStatement.setString(3, user.getEmail());
		preparedStatement.setLong(4, user.getPhone());
		preparedStatement.setDouble(5, user.getBalance());
		preparedStatement.setString(6, user.getPassword());

		int result = preparedStatement.executeUpdate();

		if (result > 0)
			return true;

		return false;

	}
	
	public boolean loginUser(int accountNumber,String password) throws SQLException {

		PreparedStatement preparedStatement = connection.prepareStatement("sele;");
		preparedStatement.setInt(1, accountNumber);
		
		preparedStatement.setString(6, password);

		int result = preparedStatement.executeUpdate();

		if (result > 0)
			return true;

		return false;

	}

}
