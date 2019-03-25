import java.util.Scanner;

public class PositiveOddIntegers {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a positive odd integer: ");
		String a = reader.nextLine();
		while (true) {
			if (a.equals("quit")) {
				System.out.println("  Bye!");
				break;
			} else {
				try {
					int b = Integer.parseInt(a);
					if (b % 2 <= 0) {
						System.out.println("  "+ b + " is not a positive odd integer");
						System.out.print("\nEnter a positive odd integer: ");
						a = reader.nextLine();
					} else {
						System.out.print("  OK\n");
						System.out.print("\nEnter a positive odd integer: ");
						a = reader.nextLine();
					}
				} catch (NumberFormatException nfe) {
					System.out.println("  '"+a+"'"+ " is not a positive odd integer");
					System.out.print("\nEnter a positive odd integer: ");
					a = reader.nextLine();
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
