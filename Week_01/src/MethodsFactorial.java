import java.util.*;

public class MethodsFactorial {

	public static void main(String[] args) {
		int a = 9;
		if (a > 0) {
			for (int x = 1; x <= a; x++) {
				System.out.println(x + "! = " + factorial(x));
			}
		}

	}

	public static int factorial(int b) {
		int fact = 1;
		for (int i = 1; i <= b; i++) {
			fact = fact * i;
		}
		return fact;
	}
}