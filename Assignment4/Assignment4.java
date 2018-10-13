package com.aed.assignment.day4;

import java.util.Arrays;

public class Assignment4 {
	
	/**
	 * The deadline of assignment4 is 10/12/2018 23:59 PST.
	 * Please feel free to contact Zane and Amanda for any questions.
	 */
	
	/*
	 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
	 * s = "leetcode" return 0. 
	 * s = "loveleetcode" return 2.
	 */
    public int firstUniqChar(String s) 
    	{
    		int minIndex = -1;
    		int[] countArray = new int[256];
    		for(int i=0 ; i< s.length() ; i++)
    		{
    			countArray[s.charAt(i)]++;
    		}
    		for(int i = 0; i< s.length(); i++)
    		{
    			if(countArray[s.charAt(i)] == 1)
    			{
    				minIndex = i;
    				break;
    			}
    		}
    		return minIndex;
    	}
    
    /*
     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * Input: 38 Output: 2
     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
    public int addDigits(int n) 
    {
		 int sum = 0;
		 int rem = 0;
		 while(n != 0)
		 {
			 rem = n%10;
			 sum = sum + rem;
			 n = n/10;
			 if(n ==0 && sum >9)
			 {
				 n=sum;
				 sum = 0;
			 }
		 }
		 return sum;
    }
    
    /*
     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
     */
    public int[] moveZeroes(int[] nums) 
    	{
			int j=0;
			for(int i=0; i<nums.length;i++)
			{
				if(nums[i] != 0)
				{
					nums[j] = nums[i];
					j++;
				}
			}
			
			while(j < nums.length)
			{
				nums[j] = 0;
				j++;
			}
			return nums;
    	}
	
    /*
     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
     */
	public String longestPalindrome(String s) 
	{
		s = s.trim().replaceAll("[^a-z^0-9^A-Z]","").toLowerCase();
		char[] array = s.toCharArray();
		int arrayLength = array.length;
		Boolean result = false;
		
		for(int subStringLength = arrayLength; subStringLength >= 2 ; subStringLength--)
		{
			for(int startIndex = 0; startIndex + subStringLength <= arrayLength ; startIndex ++)
			{
				result = isPalindrome(array, startIndex, startIndex + subStringLength -1);
				if(result)
				{
					int endIndex = startIndex + subStringLength;
					char[] resultArray = Arrays.copyOfRange(array, startIndex, endIndex);
					String str = new String(resultArray);
					return str;
				}
			}
		}
		return "No palindromic substring found!";
    }
	
	public boolean isPalindrome(char[] array, int startIndex, int endIndex)
	{
		while(startIndex < endIndex)
		{
			if(array[startIndex] != array[endIndex])
				return false;
			startIndex++;
			endIndex--;
		}
		return true;
	}
	
    /*
     * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
     * Given input matrix = [ [1,2,3],
  			      [4,5,6],
  			      [7,8,9] ],
     * rotate the input matrix in-place such that it becomes: [  [7,4,1],
  								 [8,5,2],
  								  [9,6,3] ],
     */
    public int[][] rotate(int[][] matrix) 
    {
    	//if the input matrix is not n x n, just return the same array
    	if(matrix.length == 0 || matrix[0].length != matrix.length)
    		return matrix;
    	int firstTop = 0;
    	int size = matrix.length;
    	for(int layer = 0; layer < size/2; layer++)
    	{
    		int firstElement = layer;
    		int lastElement = size - layer -1;
    		
    		for(int i= firstElement; i< lastElement ; i++)
    		{
    			int offset = i-firstElement;
    			
    			//saving first top element
    			firstTop = matrix[firstElement][i];
    			matrix[firstElement][i] = matrix[lastElement - offset][firstElement];
    			matrix[lastElement - offset][firstElement] = matrix[lastElement][lastElement - offset];
    			matrix[lastElement][lastElement - offset] = matrix[i][lastElement];
    			matrix[i][lastElement] = firstTop;
    		}
    	}
    	return matrix;
    }
}

