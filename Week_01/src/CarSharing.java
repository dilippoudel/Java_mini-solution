import java.util.Scanner;
import java.text.DecimalFormat;

public class CarSharing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter driven kilometers: ");
		double distanceTravelled = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter fuel consumption per 100 km: ");
		double consumedFuel = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter fuel price per liter: ");
		double fuelRate = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter number of people: ");
		int numsPeople = input.nextInt();
		double costPerPeople =  (((consumedFuel/100)*distanceTravelled)*fuelRate)/numsPeople;
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Each of the " + numsPeople + " people should pay " + twoDecimals.format(costPerPeople)+ " euros.");

	}

}