import java.math.BigDecimal;
import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {

		// Create arraylist with boolean exempt, name, price, boolean import
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(true, "Book", 12.49, false));
		products.add(new Product(false, "Music CD", 14.99, false));
		products.add(new Product(true, "Chocolate Bar", .85, false));
		products.add(new Product(true, "Imported Box of Chocolates", 10.00,
				true));
		products.add(new Product(false, "Imported Bottle of Perfume", 47.50,
				true));
		products.add(new Product(false, "Imported Bottle of Perfume", 27.99,
				true));
		products.add(new Product(false, "Bottle of Perfume", 18.99, false));
		products.add(new Product(true, "Packet of Headache Pills", 9.75, false));
		products.add(new Product(true, "Box of Imported Chocolates", 11.25,
				true));

		// created shopping cart for Input 1
		ArrayList<Product> shoppingCart1 = new ArrayList<Product>();
		// added products to shopping cart for input 1
		shoppingCart1.add(products.get(0));
		shoppingCart1.add(products.get(1));
		shoppingCart1.add(products.get(2));

		// each product calculate sales tax
		BigDecimal taxTotal = BigDecimal.valueOf(0);
		for (int i = 0; i < shoppingCart1.size(); i++) {
			// sum all taxes for each product
			taxTotal = taxTotal.add(products.get(i).getTax());
			// TEST System.out.println(products.get(i).getItemName());

		}
		BigDecimal sum = new BigDecimal(0);
		System.out.println("Output 1:");
		for (int i = 0; i < shoppingCart1.size(); i++) {

			// Getting tax for every item.
			System.out.println("1 "
					+ shoppingCart1.get(i).getItemName()
					+ ": "
					+ shoppingCart1.get(i).getItemPrice()
							.add(shoppingCart1.get(i).getTax()));
			// going through loop and adding all items together, BigDecimal
			sum = sum.add(shoppingCart1.get(i).getItemPrice()
					.add(shoppingCart1.get(i).getTax()));

		}
		
		System.out.println("Sales Taxes: " + taxTotal);
		System.out.println("Grand Total: " + sum);

		// created shopping cart for Input 2
		ArrayList<Product> shoppingCart2 = new ArrayList<Product>();
		// added products to shopping cart for Input 2
		shoppingCart2.add(products.get(3));
		shoppingCart2.add(products.get(4));

		// each product calculate sales tax
		BigDecimal taxTotal1 = BigDecimal.valueOf(0);
		for (int x = 0; x < shoppingCart2.size(); x++) {
			// sum all taxes for each product
			taxTotal1 = taxTotal1.add(shoppingCart2.get(x).getTax());
			// TEST System.out.println(products.get(i).getItemName());

		}
		BigDecimal sum1 = new BigDecimal(0);
		System.out.println("Output 2:");

		for (int x = 0; x < shoppingCart2.size(); x++) {

			// Getting tax for every item.
			System.out.println("1 "
					+ shoppingCart2.get(x).getItemName()
					+ ": "
					+ shoppingCart2.get(x).getItemPrice()
							.add(shoppingCart2.get(x).getTax()));
			// going through loop and adding all items together, BigDecimal
			sum1 = sum1.add(shoppingCart2.get(x).getItemPrice()
					.add(shoppingCart2.get(x).getTax()));
		}
		System.out.println("Sales Taxes: " + taxTotal1);
		System.out.println("Grand Total: " + sum1);

		// created shopping cart for Input 3
		ArrayList<Product> shoppingCart3 = new ArrayList<Product>();
		// added products to shopping cart for Input 3
		shoppingCart3.add(products.get(5));
		shoppingCart3.add(products.get(6));
		shoppingCart3.add(products.get(7));
		shoppingCart3.add(products.get(8));

		
		// each product calculate sales tax
		BigDecimal taxTotal2 = BigDecimal.valueOf(0);
		for (int i = 0; i < shoppingCart3.size(); i++) {
			// sum all taxes for each product
			taxTotal2 = taxTotal2.add(shoppingCart3.get(i).getTax());
			// TEST System.out.println(products.get(i).getItemName());
		}
		BigDecimal sum2 = new BigDecimal(0);
		System.out.println("Output 3:");

		for (int i = 0; i < shoppingCart3.size(); i++) {

			// Getting tax for every item.
			System.out.println("1 "
					+ shoppingCart3.get(i).getItemName()
					+ ": "
					+ shoppingCart3.get(i).getItemPrice()
							.add(shoppingCart3.get(i).getTax()));
			// going through loop and adding all items together, BigDecimal
			sum2 = sum2.add(shoppingCart3.get(i).getItemPrice()
					.add(shoppingCart3.get(i).getTax()));
		}
		System.out.println("Sales Taxes: " + taxTotal2);
		System.out.println("Grand Total: " + sum2);

	}
}
