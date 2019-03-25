import java.util.Scanner;
import java.text.DecimalFormat;

public class MethodsThird {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter gross salary: ");
		double salary = Double.parseDouble(reader.nextLine().replace(',', '.'));
		System.out.print("Enter income tax rate: ");
		double tax = Double.parseDouble(reader.nextLine().replace(',', '.'));
		double netSalary = calculateNetSalary(salary, tax);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
		System.out.println("The net salary is " + twoDecimal.format(netSalary));
		// TODO Auto-generated method stub

	}

	private static double calculateNetSalary(double salary, double tax) {
		return (salary - salary * tax / 100);
	}

}
