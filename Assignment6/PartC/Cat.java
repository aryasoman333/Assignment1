package com.aed.assignment.day6.partC;

import java.util.Date;

public class Cat extends Pet implements Boardable 
{	
	private String hairLength;
	private Date boardStart;
	private Date boardEnd;
	public String getHairLength() 
	{
		return hairLength;
	}

	public Cat (String name, String ownerName, String color, String hairLength)
	{
		super(name, ownerName, color);
		this.hairLength = hairLength;
	}
	public String toString() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append(getClass().getSimpleName().toUpperCase()).append(":\n").append(getPetName()).append(" owned by ").append(getOwnerName()).append("\n").append("Color: ").append(getColor()).append("\n").
		append("Sex: ").append(getSex()).append("\n").append("Hair: ").append(getHairLength());
		return sb.toString();
	}
	@SuppressWarnings("deprecation")
	@Override
	public void setBoardStart(int month, int day, int year) {
		// TODO Auto-generated method stub
		boardStart = new Date(year, month, day);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void setBoardEnd(int month, int day, int year) {
		// TODO Auto-generated method stub
		boardEnd = new Date(year, month, day);
	}

	@Override
	public boolean boarding(int month, int day, int year) 
	{
		@SuppressWarnings("deprecation")
		Date date = new Date(year, month, day);
		if(boardStart != null && boardEnd != null)
		{
		if(date.equals(boardStart) || date.equals(boardEnd) ||(date.after(boardStart) && date.before(boardEnd)))
			return true;
		}
			return false;
	}
	public static void main(String[] args)
	{
		Cat cat = new Cat("Tom", "Bob", "black", "short");
		cat.setSex(3);
		System.out.println(cat);
		cat.setBoardStart(3, 23, 2011);
		cat.setBoardEnd(3, 23, 2012);
		System.out.println("\nBoarding Result = "+cat.boarding(3, 23, 2018));
	}

}
