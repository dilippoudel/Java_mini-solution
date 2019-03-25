import java.util.*;
public class ObjectsWordList {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList myArray = new ArrayList();
		boolean flag = false;
		while(!flag) {
			System.out.print("Enter a word (quit ends): ");
			String input = reader.nextLine();
			if(input.equals("quit")) {
				flag = true;
				break;
			}
			myArray.add(input);
		}
		Collections.sort(myArray);
		for(int i = 0; i < myArray.size(); i++) {
			System.out.println(myArray.get(i));
		}
		// TODO Auto-generated method stub

	}

}
