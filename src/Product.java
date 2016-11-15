
public class Product {
	// the instance variables
		public String itemName;
		public double itemPrice;
		public double tax;

		// the constructor
		public Product(String n, double p, double t) {

			itemName = n;
			itemPrice = p;
			tax = t;
		}
		// the get methods for the item name variable
		public String getItemName() {
			return itemName;
		}
		
		// the get method for the description variable
		public double getItemPrice() {
			return itemPrice;
		}
		
		public double getTax(String itemName){
			return tax;
		}
		}

