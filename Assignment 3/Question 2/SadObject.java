package com.aed.assignment.day3;
/**
 * @author Arya Soman
 */
public class SadObject extends MoodyObject 
{
	@Override
	protected String getMood()
	{
		return "I feel sad today!";
	}
	@Override
	public void expressFeelings()
	{
		System.out.println("'wah' 'boo hoo' 'weep' 'sob' 'weep'");
	}
	public String toString()
	{
		return "Subject cries a lot";
	}
}
