import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class PrintText {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList myArray = new ArrayList();
		boolean flag = false;
		while(!flag) {
			System.out.print("Enter the items: ");
			String input = reader.nextLine();
			if(input.isEmpty() || input.equals("")) {
				flag = true;
				break;
			}
			myArray.add(input);
		}
		System.out.println("***********************");
		for(int i = 0; i < myArray.size(); i++) {
			System.out.println(myArray.get(i));
		}
		System.out.println("===words===");
		Collections.reverse(myArray);
		String out="";
		for(int i = 0; i < myArray.size(); i++) {
			
			out+=myArray.get(i)+",";
		}
		
		
		
		int s1=out.length();

		String x=out.substring(0, s1-1);
		System.out.print(x);
	

		
		System.out.println();
		
		
		System.out.println("*********************");
		System.out.print("Search keyword ");
		String search = reader.nextLine();
		if(myArray.contains(search)) {
			System.out.println(search);
		}
		else {
			System.out.print("Result not found");
		}
		
		
		
		String text = "";
		System.out.println("*********************");
		System.out.print("Enter text: ");
		String input = reader.nextLine();
		for(int i = 0; i < input.length(); i++) {
			text += input.charAt(i);
			System.out.println(text);
		}
		// TODO Auto-generated method stub
	}

}
