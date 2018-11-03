package com.aed.assignment.day7.Solution5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() 
	{
		//arrange
		int[] arr = {1,2,3,4,5,5,6,9,11};
		int[] arr1 = {3,4};
		Solution sol = new Solution();
		double expectedMedian = sol.findMedianSortedArrays(arr, arr1);
								
		//act
		double actualMedian = 4.0;
				
		//assert
		assertEquals(expectedMedian, actualMedian);
	}

}
