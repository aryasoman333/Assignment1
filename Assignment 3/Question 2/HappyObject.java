package com.aed.assignment.day3;
/**
 * @author Arya Soman
 */
public class HappyObject extends MoodyObject
{
	@Override
	protected String getMood()
	{
		return "I feel happy today!";
	}
	@Override
	public void expressFeelings()
	{
		System.out.println("hehehe...hahahah...HAHAHAHAHA!!!");
	}
	public String toString()
	{
		return "Subject laughs a lot";
	}
}
