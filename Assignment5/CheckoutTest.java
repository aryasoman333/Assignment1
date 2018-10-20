package com.aed.assignment.day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckoutTest {

	Checkout checkout = new Checkout();

	@Test
	void testNumberOfItems() 
	{
		//arrange
	    checkout.enterItem(new Candy("Chocolate Fudge", 1.15, 256));
	    checkout.enterItem(new Sundae("Mango Ice Cream", 122, "Choco balls", 20));
	    int expectedNumberOfItems = 2;
						
		//act
		int actualNumberOfItems = checkout.numberOfItems();
				
		//assert
		assertEquals(expectedNumberOfItems, actualNumberOfItems);
	}

	@Test
	void testEnterItem() 
	{
		checkout.enterItem(new Candy("Chocolate Fudge", 1.15, 256));
	    checkout.enterItem(new Sundae("Mango Ice Cream", 122, "Choco balls", 20));
	    
	    boolean expectedResult = false;
						
		//act
		boolean actualResult = checkout.vector.isEmpty();
				
		//assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testClear() 
	{
		checkout.enterItem(new Candy("Chocolate Fudge", 1.15, 256));
	    checkout.enterItem(new Sundae("Mango Ice Cream", 122, "Choco balls", 20));
	    checkout.clear();
	    boolean expectedResult = true;
						
		//act
		boolean actualResult = checkout.vector.isEmpty();
				
		//assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testTotalCost() 
	{
		//arrange
		checkout.enterItem(new Candy("Chocolate Fudge", 1.15, 256));
	    checkout.enterItem(new Sundae("Mango Ice Cream", 122, "Choco balls", 20));
	    int expectedTotalCost = 436;
						
		//act
		int actualTotalCost = checkout.totalCost();
				
		//assert
		assertEquals(expectedTotalCost, actualTotalCost);
	}

	@Test
	void testTotalTax() 
	{
		//arrange
		checkout.enterItem(new Candy("Chocolate Fudge", 1.15, 256));
	    checkout.enterItem(new Sundae("Mango Ice Cream", 122, "Choco balls", 20));
	    int expectedTotalTax = 28;
						
		//act
		int actualTotalTax = checkout.totalTax();
				
		//assert
		assertEquals(expectedTotalTax, actualTotalTax);
	}

	@Test
	void testToString() 
	{
		//arrange
		checkout.enterItem(new Candy("Chocolate Fudge", 1.15, 256));
	    checkout.enterItem(new Sundae("Mango Ice Cream", 122, "Choco balls", 20));
	    boolean expectedFinalBill = false;
						
		//act
		boolean actualFinalBill = checkout.toString().isEmpty();
				
		//assert
		assertEquals(expectedFinalBill, actualFinalBill);
	}

}
