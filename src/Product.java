import java.math.BigDecimal;

 
public class Product {
	// the instance variables
	    private boolean imprt;
		private String itemName;
		private BigDecimal itemPrice;
		private boolean exempt;
		private BigDecimal taxRate;

		// the constructor
		public Product(boolean m, String n, BigDecimal p, boolean e) {

			itemName = n;
			itemPrice = p;
			imprt = m;
			exempt = e;
			
//			this.name = name;
//			if (exempt == true){
//				this.taxRate = 0;
//			}else{ 
//				this.taxRate += .10;
//			}//close if/else
//			
//			if (imprt == true){
//				this.taxRate+=0.05;
//			}
		}//close Product constructor

		public Product(boolean isImport, String name, double price, boolean isExempt) {
			itemName = name;
			itemPrice = new BigDecimal(price);
//			itemPrice = itemPrice.setScale(2, BigDecimal.ROUND_CEILING);
			imprt = isImport;
			exempt = isExempt;
			
			//System.out.println(itemPrice);
		}

		@Override
		public String toString() {
			return "Product [imprt=" + imprt + ", itemName=" + itemName
					+ ", itemPrice=" + itemPrice + ", exempt=" + exempt
					+ ", taxRate=" + taxRate + "]";
		}
		
	
		}//close Product class bracket

