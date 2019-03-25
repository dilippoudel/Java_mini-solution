import java.util.*;
public class ObjectsPizzaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pizza> myArray = new ArrayList<Pizza>();
		Pizza p1 = new Pizza("Diavolo", 8.75);
		Pizza p2 = new Pizza("Frutti al Mare", 9.00);
		Pizza p3 = new Pizza("Alla Pollo", 7.50);
		myArray.add(p1);
		myArray.add(p2);
		myArray.add(p3);
		for(Pizza p:myArray) {
			System.out.println(p.toString());
		}
	}

}
