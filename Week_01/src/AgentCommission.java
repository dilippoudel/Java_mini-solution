import java.util.Scanner;
import java.text.DecimalFormat;

public class AgentCommission {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter selling price: ");
		double sp = Double.parseDouble(input.nextLine().replace(',', '.'));
		if (sp <= 69767.4419) {
			System.out.print("The commission is 2400,00 euros.");
		} else {
			double commission = sp * 3.44 / 100;
			DecimalFormat twoDecimals = new DecimalFormat("0.00");
			System.out.println(twoDecimals.format(commission));
		}

	}

}
