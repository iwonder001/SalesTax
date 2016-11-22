import java.math.BigDecimal;
import java.util.ArrayList;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Create arraylist with name,price, tax
		ArrayList<Product> products = new ArrayList <Product>();
		products.add(new Product(true, "Book", 12.49, false));
		products.add(new Product(false, "Music CD", 14.99, true));
		products.add(new Product(true, "Chocolate Bar",.85, false));
		products.add(new Product(true, "Imported Box of Chocolates1", 10.00,true));
		products.add(new Product(false, "Imported Bottle of Perfume1", 47.50, true));
		products.add(new Product(false, "Imported Bottle of Perfume2", 27.99, true));
		products.add(new Product(false, "Bottle of Perfume", 18.99, false ));
		products.add(new Product(true, "Packet of Headache Pills", 9.75, false ));
		products.add(new Product(true, "Box of Imported Chocolates2", 11.25, true ));
		
		//created shopping cart
		ArrayList<Product> shoppingCart1 = new ArrayList <Product>();
		//added products to shopping cart for input 1
		shoppingCart1.add(products.get(0));
		shoppingCart1.add(products.get(1));
		shoppingCart1.add(products.get(2));
		
		//each product calculate sales tax
		BigDecimal taxTotal = BigDecimal.valueOf(0);
		for(Product p: shoppingCart1){
			//sum all taxes for each product
			taxTotal = taxTotal.add(p.getTax());
		}
		System.out.println(taxTotal);
		
		//calculate total (sales tax plus price for each basket)
		
		
		
		System.out.println(shoppingCart1);
		
		
		
		
		//System.out.println(products.get(0));
		
//		if(product.get(i).getCategoryTax.contentEquals ("none"){
//			double tax = getItemPrice * 
//		}
	}
	
//1. ArrayList - product name and price 
//2. GetTax method - pass
	
	
}
