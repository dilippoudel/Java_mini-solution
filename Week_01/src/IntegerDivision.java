import java.util.Scanner;
public class IntegerDivision {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter dividend: ");
		int a = input.nextInt();
		System.out.print("Enter divisor: ");
		int b = input.nextInt();
		int c = a / b;
		int remainder = a % b;
	
		System.out.print(a + " / " + b + " = " + c + ", the remainder is "+ remainder );
	
	}

}
