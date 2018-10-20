package com.aed.assignment.day5;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author Arya Soman
 *
 */
public class Checkout 
{
	Vector<DessertItem> vector;
	public Checkout()
	{
		vector = new Vector<>();
	}
	public int numberOfItems()
	{
		return vector.size();
	}
	public void enterItem(DessertItem item)
	{
		vector.addElement(item);
	}
	public void clear()
	{
		vector.clear();
	}
	
	public int totalCost()
	{
		int totalCost = 0;
		Iterator<DessertItem> it = vector.iterator();
		while(it.hasNext())
		{
			totalCost = totalCost + it.next().getCost();
		}
		return totalCost;
	}
	public int totalTax()
	{
		int totalTax = 0;
		DessertShoppe dessertShoppe = new DessertShoppe();
		totalTax = (int)Math.round(totalCost() * dessertShoppe.getTAX_RATE());
		return totalTax;
	}
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		DessertShoppe dessertShoppe = new DessertShoppe();
		Iterator<DessertItem> it = vector.iterator();
		sb.append("\n\t"+dessertShoppe.getSTORE_NAME());
		sb.append("\n\t--------------------\n");
		while(it.hasNext())
		{
			DessertItem item = it.next();
			if( item instanceof Candy)
			{
				Candy candy = (Candy)item;
				sb.append("\n"+String.format("%.2f",candy.getWeight())+" lbs. @ ")
				.append(((candy.getPricePerPound()/100.0)+ " /lb.").replaceAll("^0\\.", "\\."));
			}
			if( item instanceof Cookie)
			{
				Cookie cookie = (Cookie)item;
				sb.append("\n"+cookie.getNumber()+" @ ").append(cookie.getPricePerDozen()/100.0+ " /dz.");
			}
			if( item instanceof Sundae)
			{
				Sundae sundae = (Sundae)item;
				sb.append("\n"+sundae.getTopping()).append(" Sundae with ");
			}
			
			
			StringBuilder itemName = new StringBuilder();
			String cost = String.valueOf(dessertShoppe.cents2dollarsAndCents(item.getCost()));
			int start = 0;
			for(int i=0; i<(item.getName().length()/dessertShoppe.getITEM_WIDTH());i++)
			{
			itemName.append(item.getName().substring(start,start+dessertShoppe.getITEM_WIDTH())).append("\n");
			start=start+dessertShoppe.getITEM_WIDTH();
			}
			itemName.append(item.getName().substring(start));
			start=(item.getName().length())%(dessertShoppe.getITEM_WIDTH());
			while(start < (dessertShoppe.getITEM_WIDTH()+dessertShoppe.getCOST_WIDTH() - cost.length()))
			{
			itemName.append(" ");
			start++;
			}
			sb.append("\n").append(itemName).append(cost);
			
		}
		sb.append("\n\n");
		
		String taxPercentage = Double.toString(totalTax()/100.0).replaceAll("^0\\.", "\\.");
		String totalCost = Double.toString((totalCost()+totalTax())/100.0);

		StringBuilder tax=new StringBuilder("Tax");
		while(tax.length() < (dessertShoppe.getITEM_WIDTH()+dessertShoppe.getCOST_WIDTH() - taxPercentage.length()))
		tax.append(" ");
		tax.append(taxPercentage);
		StringBuilder total=new StringBuilder("Total Cost");
		while(total.length() < (dessertShoppe.getITEM_WIDTH()+dessertShoppe.getCOST_WIDTH() - totalCost.length()))
		total.append(" ");
		total.append(totalCost);
		sb.append(tax).append("\n").append(total);
		return sb.toString();
	}
}
