import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many primes: ");
		int x = input.nextInt();
		int counter = 0;
		int i = 2;
		String z = "";
		while (counter < x) {
			// i++; if you use int i=1 then first increment then
			if (x > 1) {
				if (isPrime(i)) {
					z += i + " ";
					counter++;
				}
			} else {
				System.out.println(i + " ");
				break;
			}
			i++;
			// if you use int i=2 then last increment in while loop ok
		}

		System.out.println(z);
	}
	public static boolean isPrime(int num)
	{
		int count = 0;
		for (int i = 1; i <= num; i++)
		{
			if (num % i == 0) // this is checking the prime number
			{
				count += 1; // if it is then pluse 1
			}
			if (count > 2)
			{
				return false;
			}
		}
		return true;
	}
}