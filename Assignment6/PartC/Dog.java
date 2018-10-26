package com.aed.assignment.day6.partC;
/**
 * @author Arya Soman
 *
 */
import java.util.Date;

public class Dog extends Pet implements Boardable 
{
	private String size;
	private Date boardStart;
	private Date boardEnd;
	Dog (String name, String ownerName, String color, String size)
	{
		super(name, ownerName, color);
		this.size = size;
	}
	public String getSize() {
		return size;
	}
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(getClass().getSimpleName().toUpperCase()).append(":\n").append(getPetName()).append(" owned by ").append(getOwnerName()).append("\n").append("Color: ").append(getColor())
		.append("\n").append("Sex: ").append(getSex()).append("\n").append("Size: ").append(getSize());
		return sb.toString();
	}
	@Override
	@SuppressWarnings("deprecation")
	public void setBoardStart(int month, int day, int year) {
		// TODO Auto-generated method stub
		boardStart = new Date(year, month, day);
	}

	@Override
	@SuppressWarnings("deprecation")
	public void setBoardEnd(int month, int day, int year) {
		// TODO Auto-generated method stub
		boardEnd = new Date(year, month, day);
	}

	@Override
	@SuppressWarnings("deprecation")
	public boolean boarding(int month, int day, int year) {
		// TODO Auto-generated method stub
		Date date = new Date(year, month, day);
		if(date.equals(boardStart) || date.equals(boardEnd) ||(date.after(boardStart) && date.before(boardEnd)))
			return true;
		else
			return false;
	}
	public static void main(String[] args)
	{
		Dog dog = new Dog("Spot", "Susan", "white", "medium");
		dog.setSex(3);
		System.out.println(dog);
		dog.setBoardStart(3, 23, 2011);
		dog.setBoardEnd(3, 23, 2020);
		System.out.println("\nBoarding Result = "+dog.boarding(3, 23, 2018));
				
	}

}
