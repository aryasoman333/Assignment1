package com.aed.assignment.day4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Assignment4Test {

	Assignment4 assignment4 = new Assignment4();
		
	@Test
	void testFirstUniqCharWithUniqChar() 
	{
		//arrange
		int expectedUniqChar = 2;
						
		//act
		int actualUniqChar = assignment4.firstUniqChar("loveleetcode");
				
		//assert
		assertEquals(expectedUniqChar, actualUniqChar);
	}
	
	@Test
	void testFirstUniqCharWithoutUniqChar() 
	{
		//arrange
		int expectedUniqChar = -1;
						
		//act
		int actualUniqChar = assignment4.firstUniqChar("helloohe");
				
		//assert
		assertEquals(expectedUniqChar, actualUniqChar);
	}

	@Test
	void testAddDigits() 
	{
		//arrange
		int expectedSum = 6;
						
		//act
		int actualSum = assignment4.addDigits(555);
				
		//assert
		assertEquals(expectedSum, actualSum);		
	}

	@Test
	void testMoveZeroes() 
	{
		//arrange
		int[] nums = {0,1,3,0,5,0,0,0,5,0,7,0};
		int[] expectedArray = {1,3,5,5,7,0,0,0,0,0,0,0};
						
		//act
		int[] actualArray = assignment4.moveZeroes(nums);
				
		//assert
		assertArrayEquals(expectedArray, actualArray);
	}

	@Test
	void testLongestPalindrome1() 
	{
		//arrange
		String expectedString = "bab";
						
		//act
		String actualString = assignment4.longestPalindrome("babad");
				
		//assert
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testLongestPalindrome2() 
	{
		//arrange
		String expectedString = "malayalam";
						
		//act
		String actualString = assignment4.longestPalindrome("malayalam");
				
		//assert
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testLongestPalindrome3() 
	{
		//arrange
		String expectedString = "No palindromic substring found!";
						
		//act
		String actualString = assignment4.longestPalindrome("asignment");
				
		//assert
		assertEquals(expectedString, actualString);
	}

	@Test
	void testRotate() 
	{
		//arrange
		int[][] matrix = { {1,2,3},
			      {4,5,6},
			      {7,8,9} };
		int[][] expectedMatrix =  { {7,4,1},
	  								 {8,5,2},
	  								  {9,6,3} };
						
		//act
		int[][] actualMatrix = assignment4.rotate(matrix);
				
		//assert
		assertArrayEquals(expectedMatrix, actualMatrix);
	}
	
	@Test
	void testRotateNotSquareMatrix() 
	{
		//arrange
		int[][] matrix = { {1,2,3},
			      {4,5,6} };
		int[][] expectedMatrix =  { {1,2,3},
			      {4,5,6} };
						
		//act
		int[][] actualMatrix = assignment4.rotate(matrix);
				
		//assert
		assertArrayEquals(expectedMatrix, actualMatrix);
	}
	
}
