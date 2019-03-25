import java.util.*;
public class PowersOfTwoProgram {

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
				System.out.print(a + "!" + "=" + fact);

			} else if (a == 0) {
				System.out.println(a + "!= " + 1);
			} else {
				System.out.print("Enter a non-negative integer:");

			} 
			
		}
		else {
			System.out.println("Enter a non-negative integer: ");
		}
		
			

	}
}
