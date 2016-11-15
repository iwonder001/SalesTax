import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Product> products = new ArrayList <Product>();
		products.add(new Product("Book", 12.49, 0));
		products.add(new Product("Music CD", 14.49, .10));
		products.add(new Product("Chocolate Bar",.85, 0));
		products.add(new Product("Imported Box of Chocolates1", 10.00, .05));
		products.add(new Product("Imported Bottle of Perfume1", 47.50, .15));
		products.add(new Product("Imported Bottle of Perfume2", 27.99, .15));
		products.add(new Product("Bottle of Perfume", 18.99,.10 ));
		products.add(new Product("Packet of Headache Pills", 9.75, 0 ));
		products.add(new Product("Box of Imported Chocolates2", 11.25, .05 ));
		
		ArrayList<Product> shoppingCart = new ArrayList <>();
		
		System.out.println(products.get(0));
	}
	
//1. ArrayList - product name and price 
//2. GetTax method - pass
	
	
}
