import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String a = input.nextLine();
		System.out.print("Enter second string: ");
		String b = input.nextLine();
		if (a.equals(b)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}

	}

}
