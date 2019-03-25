import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String items = reader.nextLine();
		String quit = "quit";
		int count = 0;
		while (!items.equals(quit)) {
			count = count + items.length();
			System.out.print("Enter a string: ");
			items = reader.nextLine();
		}
		System.out.print("The total length is " + count);
		// TODO Auto-generated method stub

	}

}
