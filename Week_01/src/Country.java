import java.util.*;
public class Country {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<CountryName> myArray = new ArrayList<CountryName>();
		boolean flag=false;
		String clubName;
		String country;
		int wining;
		int goal;
		
		
		
		while(flag!=true) {
			System.out.print("Enter name of Country: ");
			country = reader.nextLine();
			if(country.isEmpty() || country.equals("quit"))
			{
				flag=true;
				break;
			}
			System.out.print("Enter name of club: ");
			clubName = reader.next();
			System.out.print("Enter winning: ");
			wining = reader.nextInt();
			System.out.print("Enter goal: ");
			goal = reader.nextInt();
			CountryName x=new CountryName(country, clubName, wining, goal);
			myArray.add(x);
			reader.nextLine();
			
		}
		
		
		
		
		
		
		
		Collections.sort(myArray);
		int max=0;
		
		for(CountryName c:myArray )
		{
		if(max<c.getGoal())
		{
			max=c.getGoal();
		}
	
			
		}
		
		
	System.out.println("*************************");
		
		
		for(CountryName c:myArray ){
			System.out.println(c.toString());
		}
		
	
		System.out.println("***************************");
		
		
		boolean found=false;
		for(CountryName c:myArray )
		{
		if(max==c.getGoal()){
			found =true;
			System.out.println(c.toString());
			break;	
		}
		}
		
		
	
		
		// TODO Auto-generated method stub
		
		if(myArray.isEmpty()){
				System.out.println("Sorry there is nothing to print !! Try once more again !!");
		}
		
		
		System.out.println("______________________________________________");
		System.out.println("***Search   The Result  By country  Name :***");
		System.out.println("______________________________________________");
		
		boolean search=false;
	
		System.out.print("Enter your Contry Name :");
		String search_country=reader.nextLine();
		for(CountryName c:myArray ){
		if(search_country.equalsIgnoreCase(c.getCountryName())){
			search =true;
			System.out.println("Country Name: "+c.getCountryName()+";"+"Club Name: "
			+c.getClubName() +" ;"+"Total Number of Goal: "+c.getGoal()+";"+"Total Number of Winning : " 
			+c.getWiningNumber());
			break;
		}	
		}
	
		if(!search){
			System.out.println("______________________________________________");
			System.out.println("***Result is not found !!!:***");
			System.out.println("______________________________________________");	
		}
	}

}
