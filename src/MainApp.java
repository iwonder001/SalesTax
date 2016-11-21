import java.util.ArrayList;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Create arraylist with name,price, tax
		ArrayList<Product> products = new ArrayList <Product>();
		products.add(new Product(true, "Book", 12.49, false));
		products.add(new Product(false, "Music CD", 14.4999, true));
		products.add(new Product(true, "Chocolate Bar",.85, false));
		products.add(new Product(true, "Imported Box of Chocolates1", 10.00,true));
		products.add(new Product(false, "Imported Bottle of Perfume1", 47.50, true));
		products.add(new Product(false, "Imported Bottle of Perfume2", 27.99, true));
		products.add(new Product(false, "Bottle of Perfume", 18.99, false ));
		products.add(new Product(true, "Packet of Headache Pills", 9.75, false ));
		products.add(new Product(true, "Box of Imported Chocolates2", 11.25, true ));
		
		ArrayList<Product> shoppingCart1 = new ArrayList <Product>();
		
		shoppingCart1.add(products.get(0));
		shoppingCart1.add(products.get(1));
		shoppingCart1.add(products.get(2));
		
		System.out.println(shoppingCart1);
		
		
		
		
		//System.out.println(products.get(0));
		
//		if(product.get(i).getCategoryTax.contentEquals ("none"){
//			double tax = getItemPrice * 
//		}
	}
	
//1. ArrayList - product name and price 
//2. GetTax method - pass
	
	
}
