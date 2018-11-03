package com.aed.assignment.day7;

public class Scissors extends Tool {

	public Scissors(int strength) 
	{
		super(strength, 's');
		
	}
	public boolean fight(Tool tool)
	{
		double scissorsStrength = this.getStrength();
		if(tool instanceof Paper)
			scissorsStrength = 2 * scissorsStrength;
		if(tool instanceof Rock)
			scissorsStrength = 0.5 * scissorsStrength;
		if(scissorsStrength > tool.getStrength())
			return true;
		else
			return false;
	}
}
