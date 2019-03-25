import java.util.ArrayList;

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
	private String productNumber;
	private double price;
	public Product(String name, String productNumber, double price) {
		super();
		this.name = name;
		this.productNumber = productNumber;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

class Item{
	Product product;
	private int quantity;
	public Item(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getSubtotal() {
		return (quantity+this.quantity);
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
			p.getProduct();
		}
	}
	
	
	public  double getTotalPrice() {
		for(Item p: itemList) {
			double x = p.getSubtotal()*this.itemList;
		}
		return 0;
	}
	
	
	
}