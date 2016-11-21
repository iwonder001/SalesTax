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
//applying tax to each item
		public double getTax() {
			
			if (exempt == true){
				taxRate = new BigDecimal(0);
			}else{ 
				//add operator only works with primitives, so used BigDecimal add method to add 10% tax
				taxRate.add(BigDecimal.valueOf(.10));
			}//close if/else
			
			if (imprt == true){
				taxRate += 0.05;
			}
			return 0;
		}
		
	
		}//close Product class bracket

