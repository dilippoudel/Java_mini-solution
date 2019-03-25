
public class CountryName implements Comparable <CountryName>{// interface  concepts

	private String countryName;
	private String clubName;
	private int goal;
	private int winingNumber;
	
	public CountryName(String countryName, String clubName, int winingNumber, int goal) {
		this.countryName = countryName;
		this.clubName = clubName;
		this.goal = goal;
		this.winingNumber = winingNumber;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public int getGoal() {
		return goal;
	}

	public void setGoal(int goal) {
		this.goal = goal;
	}

	public int getWiningNumber() {
		return winingNumber;
	}

	public void setWiningNumber(int winingNumber) {
		this.winingNumber = winingNumber;
	}

	@Override
	public String toString() {
		return  "Country Name: "+this.getCountryName() + "   ; "+ " Club Name : "+
	this.getClubName()+" ; "+ "Total Winning : " +this.getWiningNumber()
		+" Totol Goal : "+ this.getGoal();
	}
	
	
	
	
	public int compareTo(CountryName x)
	{
		if(x.getGoal()>=this.goal)
		{
			return 1;
		}
		else {
			return -1;
		}
}
	
}
	
	
