import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String: ");
		String a = input.nextLine();
		int count = 0;
		while (!a.equals("")) {
			count++;
			System.out.print("Enter String: ");
			a = input.nextLine();
		}
		System.out.println("total string: " + count);

	}
}
