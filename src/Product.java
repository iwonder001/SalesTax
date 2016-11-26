import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;

 
public class Product {
	// the instance variables
	    private boolean imprt;
		private String itemName;
		private BigDecimal itemPrice;
		private boolean exempt;
		private BigDecimal taxRate;

		
		public Product(boolean isExempt, String name, double price, boolean isImport) {
			//in order for me to round with BigDecimal it has to take in a MathContext number in order to have necessary precision to round
			
			itemName = name;
			//itemPrice = new DecimalFormat("#0.##").format(bd);
			itemPrice = new BigDecimal(price).setScale(2,BigDecimal.ROUND_HALF_DOWN);
			imprt = isImport;
			exempt = isExempt;
			
			//TEST: System.out.println(itemPrice);
		}
		

		public boolean isImport() {
			return imprt;
		}


		public void setImprt(boolean imprt) {
			this.imprt = imprt;
		}


		public String getItemName() {
			return itemName;
		}


		public void setItemName(String itemName) {
			this.itemName = itemName;
		}


		public BigDecimal getItemPrice() {
			return itemPrice;
		}


		public void setItemPrice(BigDecimal itemPrice) {
			this.itemPrice = itemPrice;
		}


		public boolean isExempt() {
			return exempt;
		}


		public void setExempt(boolean exempt) {
			this.exempt = exempt;
		}


		public BigDecimal getTaxRate() {
			return taxRate;
		}


		public void setTaxRate(BigDecimal taxRate) {
			this.taxRate = taxRate;
		}


		@Override
		public String toString() {
			return "Product [imprt=" + imprt + ", itemName=" + itemName
					+ ", itemPrice=" + itemPrice + ", exempt=" + exempt
					+ ", taxRate=" + taxRate + "]";
		}
//applying tax to each item
		public BigDecimal getTax() {
			//holding total sales tax for this product
			taxRate = new BigDecimal(0);
			BigDecimal taxItemPrice = new BigDecimal(0);
			
			if (exempt == false){
				//add operator only works with primitives, so used BigDecimal add method to add 10% tax
				taxItemPrice = itemPrice.multiply(BigDecimal.valueOf(.10));
				//taxRate.add(taxRate = new BigDecimal(0););
			}//close if/else
			
			if (imprt == true){
				//taxItemPrice = itemPrice.multiply(BigDecimal.valueOf(.05));
				taxItemPrice = taxItemPrice.add(itemPrice.multiply(BigDecimal.valueOf(.05)));
				//taxRate.add(BigDecimal.valueOf(.05));d
			}
			//multiply price times tax to get sales tax for each item
			//System.out.println(taxItemPrice);
			//convert BigDecimal to double
			taxItemPrice = taxItemPrice.setScale(2, BigDecimal.ROUND_CEILING);
			return taxItemPrice;
		}
			
	
		}//close Product class bracket

