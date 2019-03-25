import java.util.Scanner;
public class PositiveOdd {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a non positive integer: ");
		String a = reader.nextLine();
		while(true) {
			if(a.equals("quit")) {
				System.out.println("Bye!");
				break;
			}else {
			try {
				int b = Integer.parseInt(a);
				if(b % 2 <= 0) {
					System.out.print(b+" is not a positive odd integer.\n please enter a positive odd number: ");
					a = reader.nextLine();
					
				}
				else {
					System.out.print("OK");
					break;
				}
			}
			catch(NumberFormatException nfe) {
				System.out.println(a+ " is not a positive odd integer.");
				System.out.print("please, enter an odd integer: ");
				a = reader.nextLine();
			}
		}}
		// TODO Auto-generated method stub

	}

}
