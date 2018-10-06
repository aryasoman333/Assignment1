package com.aed.assignment.day3;
/**
 * @author Arya Soman
 */
public abstract class MoodyObject 
{
	protected abstract String getMood();
	protected abstract void expressFeelings();
	public void queryMood()
	{
		System.out.println(getMood());
	}
}
