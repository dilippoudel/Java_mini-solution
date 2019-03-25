import java.util.Scanner;

public class UserPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner (System.in);
		System.out.println("Please Enter your Desire Words to Print !! ");
		String user_input= input.nextLine();
		String txt="";
		for(int i=0;i<user_input.length();i++)
		{
			txt+=user_input.charAt(i);
			System.out.println(txt);
		}
		

	}

}
