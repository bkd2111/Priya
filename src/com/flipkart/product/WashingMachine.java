/**
 * 
 */
package com.flipkart.product;

/**
 * @author bkd2111
 *
 */
public class WashingMachine implements Product {

	/* (non-Javadoc)
	 * @see com.flipkart.product.Product#getPrice()
	 */
	@Override
	public int getPrice() {
		return 20000;
	}

	/* (non-Javadoc)
	 * @see com.flipkart.product.Product#getName()
	 */
	@Override
	public String getName() {
		return "IFB";
	}

	/* (non-Javadoc)
	 * @see com.flipkart.product.Product#getDescription()
	 */
	@Override
	public String getDescription() {
		return "8kg Automaitc Washing Machine";
	}
	
	public int capacityofWashinginKg() {
		return 8;
	}
	
	public boolean isAutomat1c() {
		return true;
	}

}
