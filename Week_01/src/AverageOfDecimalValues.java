import java.util.Scanner;
import java.text.DecimalFormat;

public class AverageOfDecimalValues {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number (zero ends): ");
		double a = Double.parseDouble(input.nextLine().replace(',', '.'));
		double sum = a;
		int count = 0;
		if (a == 0) {
			System.out.println("Nothing to calculate");
		} else {
			while (a != 0) {
				System.out.print("Enter next number (zero ends): ");
				double b = Double.parseDouble(input.nextLine().replace(',', '.'));
				sum =  sum + b;
				count++;
				if (b == 0) {
					break;
				}
			}
			DecimalFormat twoDecimals = new DecimalFormat("0.00");
			double average = sum / count;
			System.out.println("The average is " + twoDecimals.format(average));
		}
	}

}
