package com.aed.assignment.day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CookieTest 
{
	Cookie cookie = new Cookie("Choco Cookies", 3, 199);
	@Test
	void testGetCost() 
	{
		//arrange
		int expectedCost = 50;
						
		//act
		int actualCost = cookie.getCost();
				
		//assert
		assertEquals(expectedCost, actualCost);
	}

}
