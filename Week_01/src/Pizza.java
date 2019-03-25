import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Pizza {
	
	private String name;
	private double price;
	
	public Pizza(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public String format()
	{
		DecimalFormatSymbols decimalSymbols = DecimalFormatSymbols.getInstance();
		//Singleton pattern concepts
        decimalSymbols.setDecimalSeparator(',');
        return new DecimalFormat("0.00", decimalSymbols).format(price);  
		// double price 
			}
	public String toString()
	{
		return (getName() + " (" +format()+" euros)"); 
	}
	        
}

