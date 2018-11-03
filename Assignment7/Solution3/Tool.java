package com.aed.assignment.day7;

public class Tool 
{
	private int strength;
	private char type;
	
	public Tool(int strength, char type)
	{
		this.strength = strength;
		this.type = type;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	
}
