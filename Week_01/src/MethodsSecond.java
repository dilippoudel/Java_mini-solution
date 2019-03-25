import java.util.Scanner;

public class MethodsSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printRectangle();
	}

	private static void printRectangle() {
		Scanner reader = new Scanner(System.in);
		String s = "X";
		System.out.print("Enter width: ");
		int a = reader.nextInt();
		System.out.print("Enter height: ");
		int b = reader.nextInt();
		int x = 1;
		int y = 1;
		int i = 0;
		String txt = "";
		while (i < a) {
			i++;
			txt += "X";
		}
		System.out.println("\n"+txt);
		while (x <= a) {
			x++;

			while (y < b) {
				y++;
				System.out.println(txt);
			}
		}
	}
}
