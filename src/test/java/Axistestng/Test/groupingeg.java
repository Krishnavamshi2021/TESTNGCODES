package Axistestng.Test;

import org.testng.annotations.Test;

public class groupingeg {

	@Test(groups = { "sanity" })
	public void Login() {
		System.out.println("User is logged in");
	}

	@Test(groups = { "sanity", "Regression" })
	public void Products() {
		System.out.println("Searched for products");

	}

	@Test(groups = { "sanity", "Regression" })
	public void AddToCart() {
		System.out.println("Product is added to cart");
	}
}
