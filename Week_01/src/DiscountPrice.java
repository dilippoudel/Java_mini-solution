import java.text.DecimalFormat;
import java.util.Scanner;
public class DiscountPrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter orginal price: ");
		double a = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter discount price: ");
		double b = Double.parseDouble(input.nextLine().replace(',', '.'));
		double c = a - a * b / 100;
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.println(twoDecimals.format(c));
	}

}
