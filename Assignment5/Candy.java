package com.aed.assignment.day5;

/**
 * @author Arya Soman
 *
 */
public class Candy extends DessertItem
{
	private double weight;
	private double pricePerPound;
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPricePerPound() {
		return pricePerPound;
	}
	public void setPricePerPound(double pricePerPound) {
		this.pricePerPound = pricePerPound;
	}
	public Candy(String name, double weight, double pricePerPound)
	{
		super(name);
		this.weight = weight;
		this.pricePerPound = pricePerPound;
	}
	@Override
	public int getCost()
	{
		int cost;
		cost = (int) (Math.round(getWeight() * getPricePerPound()));
		return cost;
	}
}
