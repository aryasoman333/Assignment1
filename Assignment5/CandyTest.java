package com.aed.assignment.day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CandyTest 
{
	Candy candy = new Candy("Chocolate Fudge", 1.15, 256);

	@Test
	void testGetCost() 
	{
		//arrange
		int expectedCost = 294;
						
		//act
		int actualCost = candy.getCost();
				
		//assert
		assertEquals(expectedCost, actualCost);
	}

}
