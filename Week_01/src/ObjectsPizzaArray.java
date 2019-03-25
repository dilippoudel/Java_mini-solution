
public class ObjectsPizzaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza []p = new Pizza[3];
		for(int i = 0; i < p.length; i++) {
			p[0] = new Pizza("Diavolo",8.75);
			p[1] = new Pizza("Frutti al Mare",9.00);
			p[2] = new Pizza("Alla Pollo",7.50);

			System.out.println(p[i]);
		}
	}

}
