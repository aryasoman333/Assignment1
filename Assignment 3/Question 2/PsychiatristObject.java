package com.aed.assignment.day3;
/**
 * @author Arya Soman
 */
public class PsychiatristObject
{
	public void examine(MoodyObject moodyObject)
	{
		moodyObject.queryMood();
	}
	public void observe(MoodyObject moodyObject)
	{
		moodyObject.expressFeelings();
	}
}
