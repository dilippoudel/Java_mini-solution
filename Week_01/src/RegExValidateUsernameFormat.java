import java.util.Scanner;
public class RegExValidateUsernameFormat {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter username: ");
		String user = reader.nextLine();
		if(user.matches("a[0-9]{7}@myy\\.{1}haaga-helia\\.{1}fi")) {
			System.out.println("OK");
		}
		else {
			System.out.println("Invalid username format");
		}
		// TODO Auto-generated method stub
	}
}
