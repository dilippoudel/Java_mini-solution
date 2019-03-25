import java.util.Scanner;
import java.text.DecimalFormat;

public class TicketPrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter price for a single ticket: ");
		double singleTicket = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter price for a season ticket: ");
		double seasonTicket = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter the number of bus trips per month: ");
		double numsBusTrips = Double.parseDouble(input.nextLine().replace(',', '.'));
		double a = singleTicket * numsBusTrips;
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		if (a > seasonTicket) {
			double c = a - seasonTicket;
			System.out.print("Buying a season ticket is " + twoDecimals.format(c) + " euros cheaper.");
		} else if (a < seasonTicket) {
			double d = seasonTicket - a;
			System.out.print("Buying single tickets is " + twoDecimals.format(d) + " euros cheaper.");
		} else {
			System.out.print("There is no difference in the price.");

		}

	}

}
