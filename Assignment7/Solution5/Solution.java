package com.aed.assignment.day7.Solution5;

// 2/2
// total: 10/10
public class Solution 
{
	public double findMedianSortedArrays(int[] nums1, int[] nums2) 
	{
	       double median = 0;
	       
	       int leftStart = 0;
	       int leftEnd = nums1.length-1;
	       int rightStart = 0;
	       int rightEnd = nums2.length-1;
	       int[] temp = new int[nums1.length + nums2.length];
	       int index = 0;
	       while(leftStart <= leftEnd && rightStart <= rightEnd)
	       {
	    	   if(nums1[leftStart] < nums2[rightStart])
	    	   {
	    		   temp[index] = nums1[leftStart];
	    		   leftStart++;
	    	   }
	    	   else
	    	   {
    			   temp[index] = nums2[rightStart];
    			   rightStart++;
	    	   }
	    	index++;	   
	       }
	       System.arraycopy(nums1, leftStart, temp, index, leftEnd-leftStart+1);
	       System.arraycopy(nums2, rightStart, temp, index, rightEnd-rightStart+1);
	       
	       if(temp.length % 2 != 0)
	    	   median = temp[temp.length/2];
	       else
	       {
	    	   double mid = temp[temp.length/2];
	    	   double midplusone = temp[(temp.length/2)-1];
	    	   median = (mid+midplusone)/2;
	       }
	    	   
	       return median;
	}
	
}
