package com.aed.assignment.day7;

/**
 * @author Arya Soman
 *
 */
public class MyIndexOutOfBoundException extends Exception
{
	int lowerBound;
	int upperBound;
	int index;
	/**
	 * @param args
	 * @throws IOException 
	 */
	public MyIndexOutOfBoundException(int index, int lowerBound, int upperBound)
	{
		this.index = index;
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;

	}
	public static void main(String[] args)  throws MyIndexOutOfBoundException
	{
		int lowerBound = 5;
		int upperBound = 10;
		try
		{	
			int value;
			value = getRandom(20);
			
			if(value < lowerBound || value > upperBound)
				throw new MyIndexOutOfBoundException(value, lowerBound, upperBound);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

	public static int getRandom(int number) 
	{
		return (int) (Math.random() * number);
	}

	public String toString()
	{
		return "Error Message: Index: " +index+ ", but Lower bound: "+ lowerBound+ ", Upper bound: " +upperBound;
	}
}
