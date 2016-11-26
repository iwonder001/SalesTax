import java.math.BigDecimal;

public class Product {
	// the instance variables
	private boolean imprt;
	private String itemName;
	private BigDecimal itemPrice;
	private boolean exempt;
	private BigDecimal taxRate;

	//constructor
	public Product(boolean isExempt, String name, double price, boolean isImport) {
		
		itemName = name;
		// rounding number down and setting to two decimal points
		itemPrice = new BigDecimal(price).setScale(2,
				BigDecimal.ROUND_HALF_DOWN);
		imprt = isImport;
		exempt = isExempt;

		// TEST: System.out.println(itemPrice);
	}


	public String getItemName() {
		return itemName;
	}

	public BigDecimal getItemPrice() {
		return itemPrice;
	}


	@Override
	public String toString() {
		return "Product [imprt=" + imprt + ", itemName=" + itemName
				+ ", itemPrice=" + itemPrice + ", exempt=" + exempt
				+ ", taxRate=" + taxRate + "]";
	}

	// applying tax to each item
	public BigDecimal getTax() {
		// holding total sales tax for this product
		taxRate = new BigDecimal(0);
		BigDecimal taxItemPrice = new BigDecimal(0);

		if (exempt == false) {
			// add operator only works with primitives, so used BigDecimal add method to add 10% tax
			// multiply price times tax to get sales tax for each item
			taxItemPrice = itemPrice.multiply(BigDecimal.valueOf(.10));
			
		}// close if statement

		if (imprt == true) {
			// add operator only works with primitives, so used BigDecimal add method to add 5% tax
			// taking exempted taxed item and multiplying 5% additional if it is exempt then putting it back into taxItemPrice container
			taxItemPrice = taxItemPrice.add(itemPrice.multiply(BigDecimal
					.valueOf(.05)));
			
		}//close if statement
		
		// TEST   System.out.println(taxItemPrice);
		
		// rounding up .05 
		taxItemPrice = new BigDecimal(
				Math.ceil(taxItemPrice.doubleValue() * 20) / 20);
		taxItemPrice = taxItemPrice.setScale(2, BigDecimal.ROUND_HALF_UP);

		return taxItemPrice;

	}//closing getTax method

}// close Product class bracket

