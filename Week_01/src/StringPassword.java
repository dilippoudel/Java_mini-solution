import java.util.Scanner;

public class StringPassword {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Enter username: ");
		String username = reader.nextLine().toLowerCase();
		System.out.print("Enter password: ");
		String password = reader.nextLine().toLowerCase();
		System.out.println(validatePassword(username, password));
	}

	private static String validatePassword(String username, String password) {
		if (password.length() < 8 || password.equals(username) || password.contains(username)) {
			return ("Not OK");
		} else {
			return ("OK");
		}
	}

}
