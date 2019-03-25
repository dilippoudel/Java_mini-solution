import java.util.Scanner;
public class RegExValidateSize {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter size: ");
		String size = reader.nextLine();
		// TODO Auto-generated method stub
		if(size.matches("[L-X]{1,2}")) {
		System.out.println("ok");
		}
		else {
		System.out.println("Invalid size");
		}
	}

}
