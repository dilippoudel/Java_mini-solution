import java.util.Scanner;

public class StringCreateUsername {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Enter first name: ");
		String fname = reader.nextLine();
		System.out.print("Enter surname: ");
		String lname = reader.nextLine();
		System.out.println(createUsername(fname, lname));
	}

	private static String createUsername(String fname, String lname) {
		
		if(fname.length()<2 || lname.length()<3) {
			return "Not enough letters to create a username!";
		}
		
		String s1 = "";
		String s2 = "";
		for (int i = 0; i < 3; i++) {
			s1 += lname.charAt(i);
		}
		for (int i = 0; i < 2; i++) {
			s2 += fname.charAt(i);
		}
		return s1.concat(s2).toLowerCase();
	}

}
