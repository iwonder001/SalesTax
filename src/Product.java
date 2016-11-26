import java.math.BigDecimal;

public class Product {
	// the instance variables
	private boolean imprt;
	private String itemName;
	private BigDecimal itemPrice;
	private boolean exempt;
	private BigDecimal taxRate;

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
			// add operator only works with primitives, so used BigDecimal add
			// method to add 10% tax
			taxItemPrice = itemPrice.multiply(BigDecimal.valueOf(.10));
			// taxRate.add(taxRate = new BigDecimal(0););
		}// close if/else

		if (imprt == true) {
			// taxItemPrice = itemPrice.multiply(BigDecimal.valueOf(.05));
			taxItemPrice = taxItemPrice.add(itemPrice.multiply(BigDecimal
					.valueOf(.05)));
			// taxRate.add(BigDecimal.valueOf(.05));d
		}
		// multiply price times tax to get sales tax for each item

		// System.out.println(taxItemPrice);
		// convert BigDecimal to double

		taxItemPrice = new BigDecimal(
				Math.ceil(taxItemPrice.doubleValue() * 20) / 20);
		taxItemPrice = taxItemPrice.setScale(2, BigDecimal.ROUND_HALF_UP);

		return taxItemPrice;

	}

}// close Product class bracket

