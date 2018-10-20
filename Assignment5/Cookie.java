package com.aed.assignment.day5;

/**
 * @author Arya Soman
 *
 */
public class Cookie extends DessertItem
{
	private int number;
	private double pricePerDozen;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getPricePerDozen() {
		return pricePerDozen;
	}
	public void setPricePerDozen(double pricePerDozen) {
		this.pricePerDozen = pricePerDozen;
	}
	
	public Cookie(String name, int number, double pricePerDozen)
	{
		super(name);
		this.number = number;
		this.pricePerDozen = pricePerDozen;
	}
	@Override
	public int getCost()
	{
		int cost;
		cost = (int)Math.round((getPricePerDozen()/12) * getNumber());
		return cost;
		
	}
}
