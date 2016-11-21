import java.math.BigDecimal;

BigDecimal taxRate = 0; 
public class Product {
	// the instance variables
	    public boolean imprt;
		public String itemName;
		public BigDecimal itemPrice;
		public boolean exempt;

		// the constructor
		public Product(boolean m, String n, BigDecimal p, boolean e) {

			itemName = n;
			itemPrice = p;
			imprt = m;
			exempt = e;
			
			this.name = name;
			if (exempt == true){
				this.taxRate = 0;
			}else{ 
				this.taxRate = .10;
			}//close if/else
			
			if (imprt == true){
				this.taxRate+=0.05;
			}
		}//close Product constructor
		
		
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
		}//close Product class bracket

