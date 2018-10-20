package com.aed.assignment.day5;

/**
 * @author Arya Soman
 *
 */
public class DessertShoppe 
{
	private final double TAX_RATE = 0.065;
	private final String STORE_NAME = "M & M Dessert Shoppe";  
	private final int ITEM_WIDTH = 30;
	private final int COST_WIDTH = 10;
	
	
	public double getTAX_RATE() {
		return TAX_RATE;
	}


	public String getSTORE_NAME() {
		return STORE_NAME;
	}


	public int getITEM_WIDTH() {
		return ITEM_WIDTH;
	}


	public int getCOST_WIDTH() {
		return COST_WIDTH;
	}


	public String cents2dollarsAndCents(int cost)
	{
		String costInDollars = Double.toString(cost/100.0);
		return costInDollars;
	}
	
}
