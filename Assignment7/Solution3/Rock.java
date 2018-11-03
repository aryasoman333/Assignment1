package com.aed.assignment.day7;

public class Rock extends Tool 
{

	public Rock(int strength) 
	{
		super(strength, 'r');
		
	}
	
	public boolean fight(Tool tool)
	{
		double rockStrength = this.getStrength();
		if(tool instanceof Scissors)
			rockStrength = 2 * rockStrength;
		if(tool instanceof Paper)
			rockStrength = 0.5 * rockStrength;
		if(rockStrength > tool.getStrength())
			return true;
		else
			return false;
	}
	
}
