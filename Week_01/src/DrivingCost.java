import java.util.Scanner;
import java.text.DecimalFormat;
public class DrivingCost {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter driven kilometers: ");
		double km = Double.parseDouble(input.nextLine().replace(',','.'));
		System.out.print("Enter amount of fuel consumed: ");
		double fuel = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter fuel price per liter: ");
		double price = Double.parseDouble(input.nextLine().replace(',', '.'));
		double cpk = fuel * price / km;
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.println("The cost per kilometer is " +twoDecimals.format(cpk)+" euros.");

	}

}
