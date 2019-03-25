import java.util.Scanner;

public class StringBackwards {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter a string: ");
		String input = reader.nextLine();
		System.out.println(reverse(input));

	}

	private static String reverse(String input) {
		String x = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			x += input.charAt(i);
		}
		return x;
	}
}
