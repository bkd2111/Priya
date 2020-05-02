/**
 * 
 */
package com.flipkart.product;

/**
 * @author bkd2111
 *
 */
public class TV implements Product {

	/* (non-Javadoc)
	 * @see com.flipkart.product.Product#getPrice()
	 */
	@Override
	public int getPrice() {
		return 12000;
	}

	/* (non-Javadoc)
	 * @see com.flipkart.product.Product#getName()
	 */
	@Override
	public String getName() {
		return "Sony";
	}

	/* (non-Javadoc)
	 * @see com.flipkart.product.Product#getDescription()
	 */
	@Override
	public String getDescription() {
		return "Branded Sony Bravio";
	}

	public boolean isLCD() {
		return true;
	}
	
	
}
