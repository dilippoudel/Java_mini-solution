import java.util.Scanner;

public class MethodsMax {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter first double: ");
		double a = Double.parseDouble(reader.nextLine().replace(',', '.'));
		System.out.print("Enter second double: ");
		double b = Double.parseDouble(reader.nextLine().replace(',', '.'));
		System.out.print("The max value is " + max(a, b));
		// TODO Auto-generated method stub

	}

	public static double max(double a, double b) {
		return Math.max(a, b);
	}

}
