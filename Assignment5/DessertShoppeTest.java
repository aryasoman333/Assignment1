package com.aed.assignment.day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DessertShoppeTest {
	
	DessertShoppe des = new DessertShoppe();	

	@Test
	void testCents2dollarsAndCents()
	{
		//arrange
		String expectedCost = "2.25";
						
		//act
		String actualCost = des.cents2dollarsAndCents(225);
				
		//assert
		assertEquals(expectedCost, actualCost);
	}

}
