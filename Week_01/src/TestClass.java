import java.util.ArrayList;
import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> country=new ArrayList<String>();
Scanner reader=new  Scanner(System.in);
String c="";
boolean flag=false;

while(flag!=true) {
	System.out.print("Enter name of Country: ");
	c = reader.nextLine();
	if(c.isEmpty() || c.equals("quit"))
	{
		flag=true;
		break;
	}
	
country.add(c);
	
	
}



for(int i =0;i<country.size();i++)
{
	System.out.println(country.get(i));
}

if(country.isEmpty())
{
	System.out.println("Sorry");


	}
	

}
}
