package com.aed.assignment.day6.partC;

/**
 * @author Arya Soman
 *
 */
public class Pet 
{
	private String petName;
	private String ownerName;
	private String color;
	protected int sex;
	public static final int MALE = 1;
	public static final int FEMALE = 2;
	public static final int SPAYED = 3;
	public static final int NEUTERED = 4;
	
	public Pet (String name, String ownerName, String color)
	{
		this.petName = name;
		this.ownerName = ownerName;
		this.color = color;
	}

	public String getPetName() {
		return petName;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getSex() 
	{
		if(this.sex == MALE)
			return "MALE";
		else if(this.sex == FEMALE)
			return "FEMALE";
		else if(this.sex == SPAYED)
			return "SPAYED";
		else 
			return "NEUTERED";
	}
	
	public void setSex(int sexid) 
	{
		this.sex = sexid;
	}
	
	public String toString()
	{
		// Should return the name, owner’s name, age, color, and gender (use getSex()); 
		StringBuffer sb = new StringBuffer();
		sb.append(getPetName()).append(" owned by ").append(getOwnerName()).append("\n").append("Color: ").append(getColor()).
		append("\n").append("Sex: ").append(getSex());
		return sb.toString();
	}

	public static void main(String[] args)
	{
		Pet pet = new Pet("Spot", "Mary", "Black and White");
		pet.setSex(1);
		System.out.println(pet);
	}
}
