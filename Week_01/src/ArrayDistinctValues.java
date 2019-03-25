import java.util.Scanner;
import java.util.Arrays;
public class ArrayDistinctValues {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number of values: ");
		int num = reader.nextInt();
		int[] myArray = new int[num];
		for(int i = 0; i < myArray.length; i++) {
			System.out.print("Enter an integer: ");
			 myArray[i] = reader.nextInt();
			 
		}
		
		
		
		
		for(int i = 0; i < num-1; i++) {
			for(int j = 0; j < num-1; j++) {
				if(myArray[i] != myArray[j]) {
					System.out.print(" "+myArray[i]);
				}
				
			}
		// TODO Auto-generated method stub
	}
	} 
	
	

}
