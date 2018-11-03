package com.aed.assignment.day7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PaperTest {

	@Test
	void testForRock() 
	{
		//arrange
		Scissors s = new Scissors(10);
        Paper p = new Paper(10);
        Rock r = new Rock(10);
		boolean expectedResult = true;
						
		//act
		boolean actualResult = p.fight(r);
				
		//assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testForScissors() 
	{
		//arrange
		Scissors s = new Scissors(10);
        Paper p = new Paper(10);
        Rock r = new Rock(10);
		boolean expectedResult = false;
						
		//act
		boolean actualResult = p.fight(s);
				
		//assert
		assertEquals(expectedResult, actualResult);
	}

}
