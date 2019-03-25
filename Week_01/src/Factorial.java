import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a non-negative integer: ");
		int fact = 1;
		if(reader.hasNextInt()) {
			int a = reader.nextInt();
			
			if (a > 0) {
				for (int i = 1; i <= a; i++) {
					fact = fact * i;
				}
				System.out.print("\n"+a + "!" + " = " + fact);

			} else if (a == 0) {
				fact =1;
				System.out.print("\n"+a + "!= " + fact);
			} else {
				System.out.print("Please enter a non-negative integer.");

			} 
			
		}
		else {
			System.out.print("Please enter a non-negative integer.");
		}
		
			

	}
}
