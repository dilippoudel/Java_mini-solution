import java.util.Scanner;
public class RegExVowelsOnly {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String vowels = reader.nextLine().toLowerCase();
		if(vowels.matches("[AEIOUÅÖYÄ]{1,9}")) {
			System.out.println("Vowels only");
		}
		else {
			System.out.println("Not only vowels!");
		}
		// TODO Auto-generated method stub

	}

}
