/**
 * 
 */
package com.aed.assignment.day5;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns), method to return all elements of the matrix in spiral order. 
 * @author Arya Soman
 *
 */
public class SpiralMatrix 
{
	public List<Integer> spiralOrder(int[][] matrix) 
	{
        List<Integer> list = new ArrayList<>();
        int m = matrix.length; //row count
        int n= matrix[0].length; //column count
        int startRow = 0;
        int startColumn = 0;
        
        while(startRow < m && startColumn < n)
        {
        	for(int i=startColumn ; i < n; i++)
        	{
        		list.add(matrix[startRow][i]);
        	}
        	startRow++;
        	for(int i = startRow ; i < m ; i++)
        	{
        		list.add(matrix[i][n-1]);
        	}
        	n--;
        	if(startRow < m)
        	{
	        	for(int i = n-1;i >=startColumn ; i--)
	        	{
	        		list.add(matrix[m-1][i]);
	        	}
	        	m--;
        	}
        	if(startColumn < n)
        	{
        	for(int i= m-1 ; i >= startRow ; i--)
        	{
        		list.add(matrix[i][startColumn]);
        	}
        	startColumn++;
        	}
        }
        return list;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		SpiralMatrix spiral = new SpiralMatrix();
		int[][] matrix = {{1,2,3},
				{4,5,6},
				{7,8,9}};
		List<Integer> list = spiral.spiralOrder(matrix);
		for(int i = 0; i< list.size() ; i++)
		{
			System.out.print(list.get(i)+",");
		}
	}

}
