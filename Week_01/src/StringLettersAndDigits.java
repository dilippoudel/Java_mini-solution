import java.util.Scanner;

public class StringLettersAndDigits {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String a = reader.nextLine().replaceAll(" ", "");

		int string = 0;
		int digit = 0;
		for (int i = 0; i < a.length(); i++) {
			if (Character.isLetter(a.charAt(i))) {
				string++;

			} else if(Character.isDigit(a.charAt(i))) {
				digit++;
			}
			else {
				System.out.println("");
			}

		}

		System.out.println(string + " letter(s)");
		System.out.println(digit + " digit(s)");

	}
}
