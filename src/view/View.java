package view;

import java.util.Scanner;

import controller.UserController;
import controller.UserControllerInteface;
import model.User;

public class View {

	public static void main(String[] args) {

		UserControllerInteface controller = new UserController();
		boolean validate = false;
       User logedInUser=null;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("welcome to bank");
			System.out.println("1.Register");
			System.out.println("2.Login");
			System.out.println("3.About");
			System.out.println("4.Exit");
			System.out.println("Select the choice");

			int choice = scanner.nextInt();

			switch (choice) {

			case 1:

				System.out.println("enter the account number");
				int accountNumber = scanner.nextInt();
				System.out.println("enter the name");
				scanner.nextLine();
				String name = scanner.nextLine();
				System.out.println("enter the email");
				String email = scanner.next();
				System.out.println("enter the phone");
				long phone=scanner.nextLong();
				System.out.println("enter the password");
				scanner.nextLine();
                String password=scanner.nextLine();
				boolean message=controller.registerUser(new User(accountNumber, name, email, phone, 0, password));
				System.out.println(message?"account created sucessfully Account number=="+accountNumber:"account already exist");
				break;

			case 2:
				System.out.println("Login");
				System.out.println("enter the account number");
				int accountNum = scanner.nextInt();
				System.out.println("enter the password");
				String loginpassword = scanner.next();

				logedInUser = controller.login(accountNum, loginpassword);
				if (logedInUser!=null) {
					while (logedInUser!=null) {
						System.out.println("enter the choice");
						System.out.println("1.Deposit");
						System.out.println("2.Withdraw");
						System.out.println("3.Balance");
						System.out.println("4.Logout");
						System.out.println("enter the choice");
						int select = scanner.nextInt();
						switch (select) {
						case 1:
							
							System.out.println("enter the amount");
							controller.deposit(logedInUser.getAccountNumber(), scanner.nextDouble());
							break;
						case 2:
							
							System.out.println("enter the amount");
						
							controller.withdraw(logedInUser.getAccountNumber(), scanner.nextDouble());
							break;
							
						case 3:
						double balance=	controller.balance(logedInUser.getAccountNumber());
						System.out.println("balance is "+balance );
						break;
						case 4:logedInUser=null;
						break;
							
						}// end of login switch
					} // end login main
				} // end of if
				else {
					System.out.println("please enter the valid  crendentials");

				}
				break;

			case 3:
				System.out.println("About");
				break;

			case 4:
				System.out.println("Thank you visit again");
				System.exit(0);

			default:
				System.out.println("Invalid choice");
				break;
			}

		}

	}
}
