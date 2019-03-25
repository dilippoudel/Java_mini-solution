
	import java.util.Scanner;
	import java.util.Arrays;
	import java.text.DecimalFormat;

	public class ArrayStatistics {

		public static void main(String[] args) {
			Scanner reader = new Scanner(System.in);
			DecimalFormat twoDecimal = new DecimalFormat("0.0");
			// TODO Auto-generated method stub
			System.out.print("Enter the number of values: ");
			int num = reader.nextInt();
				String s = "";
			int array[] = new int[num];
			
			
			if(num >= 3) {
				
				for (int i = 0; i < array.length; i++) {
					System.out.print("Enter an integer: ");
					array[i] = reader.nextInt();
					s += array[i] + " ";
				}
			
				
				System.out.println("\nn = " + num);
				System.out.println("Min: "+ ArrayStatLibrary.min(array));
				System.out.println("Max: "+ ArrayStatLibrary.max(array));;
				ArrayStatLibrary.median(array);
				System.out.println("Mean: "+ twoDecimal.format(ArrayStatLibrary.mean(array)).replace('.', ','));
				System.out.println("Sample standard deviation: "+ twoDecimal.format(ArrayStatLibrary.standardDeviation(array)).replace('.', ','));
				System.out.println("Sample data: " +s);
			}
			 
			else 
			{
			 
				System.out.println("Sorry, at least 3 values required");
				
			}
			
			}
			
			
			
		}


	class ArrayStatLibrary {
		
		public static int min(int[] x) {
			Arrays.sort(x);
			int min=x[0];
			return min;
		}

		public static int max(int[] x) {
			Arrays.sort(x);
			int maxV=x[x.length-1];
			return maxV;
		}

		public static void median(int[] x) {
			Arrays.sort(x);
			int n = x.length;
			DecimalFormat twoDecimal = new DecimalFormat("0.0");
			if (n % 2 != 0) {
				int position = (n + 1) / 2;
				System.out.println("Median: " + twoDecimal.format(x[position - 1]).replace('.', ','));
			}

			if (n % 2 == 0) {
				double position = (double) (n + 1) / 2;
				int higher = (int) Math.ceil(position);
				int lower = (int) Math.floor(position);
				double avg = (x[lower - 1] + x[higher - 1]);
				 System.out.println("Median: " + twoDecimal.format(avg / 2).replace('.', ','));
			}
		}

		public static double mean(int[] x) {
			int count = x.length;
			int sum = 0;
			
			for (int i = 0; i < x.length; i++) {
				sum += x[i];
			}
			double meanValue = (double) sum / (double) count;
			return meanValue;
		}

		public static double standardDeviation(int[] x) {
			int n = x.length;
			double meanValue = ArrayStatLibrary.mean(x);
			
			
	
			
			double sum1 = 0;
			for (int i = 0; i < x.length; i++) {
				sum1 += ((x[i] - meanValue) * (x[i] - meanValue));
			}
			return Math.sqrt(sum1 / (n - 1));

		}

	}
