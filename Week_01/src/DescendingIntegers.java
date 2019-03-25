import java.util.Scanner;
public class DescendingIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int a = input.nextInt();
		for(int i = a; i > 0; i--) {
			System.out.print(i+" ");
		}
	}

}
