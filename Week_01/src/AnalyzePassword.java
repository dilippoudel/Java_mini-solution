import java.util.Scanner;

public class AnalyzePassword {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  your user name: ");
		String name = input.nextLine();
		System.out.println("Enter your Password :");
		String passWord = input.nextLine();
		if (isPassword(name, passWord)) {
			System.out.println("good");
		} else {
			System.out.println("invalid");
		}
	}

	public static boolean isPassword(String userName, String passWord) {
		int caps = 0;
		String regx = "((?=.*[a-z])(?=.*[A-Z]).{6,20})";
		if (!passWord.matches(regx)) {
			return false;
		}
		for (int i = 0; i + 2 < userName.length(); i++) {
			if (passWord.indexOf(userName.substring(i, i + 2)) != -1) {
				return false;
			}
		}
		return true;
	}
}
