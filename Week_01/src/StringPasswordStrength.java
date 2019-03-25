import java.util.Scanner;
public class StringPasswordStrength {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter password: ");
		String password = reader.nextLine();
		System.out.println(checkStrength(password));
		// TODO Auto-generated method stub

	}
	
	private static String checkStrength(String password) {
		if(password.matches("[a-z][0-9][A-Z0-9a-z]{8,}|[A-Z][0-9][A-Za-z0-9]{8,}")) {
			return "Ok";
		}
		else {
			return "Not strong enough!";
		}
	}
}
