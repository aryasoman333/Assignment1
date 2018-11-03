package com.aed.assignment.day7;

public class Paper extends Tool {

	public Paper(int strength) 
	{
		super(strength, 'p');
		
	}
	public boolean fight(Tool tool)
	{
		double paperStrength = this.getStrength();
		if(tool instanceof Rock)
			paperStrength = 2 * paperStrength;
		if(tool instanceof Scissors)
			paperStrength = 0.5 * paperStrength;
		if(paperStrength > tool.getStrength())
			return true;
		else
			return false;
	}

}
