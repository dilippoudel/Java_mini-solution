import java.util.Scanner;

public class ValidateFirst {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		try {
			System.out.print("Enter grade (0-5): ");
			int a = Integer.parseInt(reader.nextLine());
			System.out.println("Ok");
		}
		catch (NumberFormatException nfe) {
			System.out.println("Please enter an integer.");
		}
		
		
		// TODO Auto-generated method stub

	}

}
