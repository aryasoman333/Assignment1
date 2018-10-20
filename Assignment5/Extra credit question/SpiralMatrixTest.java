package com.aed.assignment.day5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class SpiralMatrixTest 
{
	SpiralMatrix spiral = new SpiralMatrix();

	@Test
	void testSpiralOrder() 
	{
		//arrange
		int[][] matrix = {{1,2,3},
				{4,5,6},
				{7,8,9}};
		int[] expectedList = {1,2,3,6,9,8,7,4,5,};
						
		//act
		List<Integer> list = spiral.spiralOrder(matrix);
		int[] actualList = new int[list.size()];
		for(int i = 0; i< list.size() ; i++)
		{
			actualList[i] = list.get(i);
		}
		
		//assert
		assertArrayEquals(expectedList, actualList);
	}

}
