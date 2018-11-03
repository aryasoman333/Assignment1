package com.aed.assignment.day7.solution2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Solution 
{
	public static void parse(File file)  {
		   RandomAccessFile input = null;
		   String line = null;
		   try {
		       input = new RandomAccessFile(file, "r");
		       while ((line = input.readLine()) != null) {
		           System.out.println(line);
		       }
		       return;
		   } 
		   catch(FileNotFoundException ex)
		   {
			   ex.printStackTrace();
		   }
		   catch(IOException ex)
		   {
			   ex.printStackTrace();
		   }
		   finally {
		       if (input != null) 
		       {
		    	   try
		    	   {
		           input.close();
		    	   }
		    	   catch(IOException ex)
		    	   {
		    		   ex.printStackTrace();
		    	   }
		       }
		   }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
