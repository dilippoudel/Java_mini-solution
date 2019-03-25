import java.util.Scanner;
import java.text.DecimalFormat;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter initial deposit: ");
		double principal = Double.parseDouble(reader.nextLine().replace(',', '.'));
		System.out.print("Enter interest rate: ");
		double interestRate = Double.parseDouble(reader.nextLine().replace(',', '.'));
		System.out.print("Enter capital income tax rate: ");
		double taxRate = Double.parseDouble(reader.nextLine().replace(',', '.'));
		System.out.print("Enter number of years: ");
		double years = Double.parseDouble(reader.nextLine().replace(',', '.'));
		int t = 1;
		while (t <= years) {
			double interestAmount = principal * 1 * interestRate / 100;
			DecimalFormat twoDecimals = new DecimalFormat("0.00");
			principal = principal + (interestAmount - interestAmount * taxRate / 100);
			System.out.println(t + ": " + twoDecimals.format(principal));
			t++;
		}
		// TODO Auto-generated method stub

	}

}
