package com.aed.assignment.day3;
/**
 * @author Arya Soman			
 *
 */
public class ReverseString {
	
	public void reverse(String string)
	{
		System.out.println(string);
		String s = string.trim().replaceAll("\\s+", " ");
		String[] words = s.split(" ");
		String temp;
		String reversedString="";
 		for(int i=0; i < words.length ; i++)
		{
			temp = words[i];
			reversedString = temp + " " +reversedString;
		}
 		System.out.println(reversedString.trim());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rev = new ReverseString();
		rev.reverse("  the sky is    blue  ");
	}

}
