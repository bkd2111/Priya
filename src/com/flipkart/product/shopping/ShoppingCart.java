/**
 * 
 */
package com.flipkart.product.shopping;

import java.util.ArrayList;
import java.util.List;

import com.flipkart.product.Mobile;
import com.flipkart.product.Product;
import com.flipkart.product.TV;
import com.flipkart.product.WashingMachine;

/**
 * @author bkd2111
 *
 */
public class ShoppingCart {

	public static List<Product> cart = new ArrayList();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Upcasting
		Product tv = new TV();
		Product washinMachine = new WashingMachine();
		Product mobile = new Mobile();

		addProducts(tv);
		addProducts(washinMachine);
		addProducts(mobile);

		printDetails();

		printProductSpecificDetails();
	}

	private static void printProductSpecificDetails() {
		for (Product prod : cart) {

			if (prod instanceof TV) {
				TV tv = (TV) prod;
				System.out.println("########################### Start of TV Details ###########################");
				// Child specific methods are accessible
				System.out.println("Is TV LCD : "+tv.isLCD());
				
				
				// Parents specific methods are accessible
				System.out.println("TV Price is : "+tv.getPrice());
				System.out.println("TV Name is : "+tv.getName());
				System.out.println("TV Desciption is : "+tv.getDescription());
				System.out.println("########################### End of TV Details ###########################");
			} else if (prod instanceof Mobile) {
				Mobile mobile = (Mobile) prod;
				System.out.println("########################### Start of Mobile Details ###########################");
				// Child specific methods are accessible
				System.out.println("Mobile Color is : "+mobile.getColor());
				System.out.println("Mobile Camera is : "+mobile.getCameraInMP());
				
				
				// Parents specific methods are accessible
				System.out.println("Mobile Price is : "+mobile.getPrice());
				System.out.println("Mobile Name is : "+mobile.getName());
				System.out.println("Mobile Description is : "+mobile.getDescription());
				System.out.println("########################### End of TV Details ###########################");
			} else if (prod instanceof WashingMachine) {
				WashingMachine product = (WashingMachine) prod;

				System.out.println("########################### Start of Washing Machine Details ###########################");
				// Child specific methods are accessible
				System.out.println("Washing Machine is Automatic: "+product.isAutomat1c());
				System.out.println("Washing Machine Capacity is : "+product.capacityofWashinginKg());

				// Parents specific methods are accessible
				System.out.println("Washing Machine Price is : "+product.getPrice());
				System.out.println("Washing Machine Name is : "+product.getName());
				System.out.println("Washing Machine Description is : "+product.getDescription());
				System.out.println("########################### End of Washing Machine Details ###########################");
			}
		}
	}

	private static void printDetails() {
		// ForEach loop
		for (Product product : cart) {
			System.out.println("Product Name is : " + product.getName() + ", Product Description : "
					+ product.getDescription() + "," + " and Product Price is : " + product.getPrice());
		}
	}

	// method takes product as the parameter, as it should be able to take or hold
	// all Product and its child.
	private static void addProducts(Product product) {
		cart.add(product);
	}

}
