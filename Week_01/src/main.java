import java.text.DecimalFormat;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		double a = Double.parseDouble(input.nextLine().replace(',', '.'));
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.println(twoDecimals.format(a));
	}
}