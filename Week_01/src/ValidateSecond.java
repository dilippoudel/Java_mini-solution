import java.util.Scanner;

public class ValidateSecond {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		try {
			System.out.print("Enter grade (0-5): ");
			
			String a = reader.nextLine();
			if (a.matches("[0-5]{1}") == true) {
				System.out.println("Ok");
				}
			else {
				System.out.println("Please enter an integer between 0 and 5.");
				}
			
			
		}
		catch (NumberFormatException nfe) {
			System.out.println("Please enter an integer between 0 and 5.");
		}
		
		
		// TODO Auto-generated method stub

	}

}
