package test;

import org.testng.annotations.Test;

public class HomePage {

	@Test(dependsOnMethods="test6")
	public void test3() {
		
		System.out.println("Inside Test case 3");
	}
	
	@Test
	public void test6() {
		
		System.out.println("Inside Test case 6");
	}
	
	@Test(dependsOnMethods= "test8")
	public void test7() {
		
		System.out.println("Inside Test case 7");
	}
	@Test
	public void test8() {
		
		System.out.println("Inside Test case 8");
	}
}
