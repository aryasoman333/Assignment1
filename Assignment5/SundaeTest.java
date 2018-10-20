package com.aed.assignment.day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SundaeTest 
{
	Sundae sundae = new Sundae("Mango Ice Cream", 122, "Choco balls", 20);
	
	@Test
	void testGetCost() 
	{
		//arrange
		int expectedCost = 142;
						
		//act
		int actualCost = sundae.getCost();
				
		//assert
		assertEquals(expectedCost, actualCost);
	}

}
