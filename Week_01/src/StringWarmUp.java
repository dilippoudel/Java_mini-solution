import java.util.Scanner;
public class StringWarmUp {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String a = reader.nextLine();
		int count = 0;
		for(int i = 0; i<a.length(); i++) {
			count += 1;
		}
		System.out.println(count + " characters");
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		// TODO Auto-generated method stub

	}

}
