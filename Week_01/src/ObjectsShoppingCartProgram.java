import java.util.ArrayList;
import java.text.DecimalFormat;

public class ObjectsShoppingCartProgram {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Product product_1 = new Product(10, "Bicycle", 500.00);
        Product product_2 = new Product(11, "Energy bar", 1.50);
        Product product_3 = new Product(12, "Water bottle", 6.00);
        
        System.out.println(cart);

        cart.add(product_1, 1);
        cart.add(product_2, 5);
        cart.add(product_3, 2);    
        System.out.println(cart);
        
        cart.remove(product_2);
        System.out.println(cart);
    }
}

class Product{
	private String name;
	private int productNumber;
	private double price;
	public Product(int productNumber, String name, double price) {
		this.name = name;
		this.productNumber = productNumber;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	
	public int getProductNumber() {
		return productNumber;
	}
	
	public double getPrice() {
		return price;
	}
	
}




class Item{
	private Product product;
	private int quantity;
	
	public Item(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getSubtotal() {
		return product.getPrice() * quantity;
	}
	
}

class ShoppingCart{
	private ArrayList<Item> itemList;
	public ShoppingCart() {
		this.itemList = new ArrayList<Item>();
	}
	
	public void add(Product product, int quantity) {
		Item i = new Item(product, quantity);
	  this.itemList.add(i);
	}
	
	
	public void remove(Product product) {
		for(Item p : itemList) {
			if(product.equals(p.getProduct())) {
				itemList.remove(p);
			}
		}
	}
	
	
	public  double getTotalPrice() {
		double total = 0.00;
		for(Item p: itemList) {
			total += p.getSubtotal();
		}
		return total;
	}
	 public String toString() {
		 String msg = "";
		 if(itemList.isEmpty()) {
			 msg = "There are no items in the shopping cart.";
		 }
		 else {
			 DecimalFormat twoDecimal = new DecimalFormat("0.00");
			 double total = 0.00;
			 double grandPrice = 0.00;
			 double priceUnit = 0.00;
			 String message = "";
			 for(Item i: itemList) {
				 total = i.getSubtotal();
				 priceUnit = i.getProduct().getPrice();
				 message += i.getProduct().getProductNumber()+": "+i.getProduct().getName() + ", quantity: "+
				 i.getQuantity() + ", unit price: " + twoDecimal.format(priceUnit).replace(".", ",")+ ", subtotal: " + twoDecimal.format(total).replace(".", ",") + "\n"; ;
				 grandPrice +=total;
			 }
			 System.out.println("\n===Shopping Cart===\n");
		return message + "TOTAL PRICE: " + twoDecimal.format(grandPrice).replace(".", ",") + " euros";

		 }
		 return msg;
	 }
	
	
	
}