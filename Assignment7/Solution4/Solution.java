package com.aed.assignment.day7.Solution4;

import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

class Interval implements Comparable<Interval>
{
	private int firstElement;
	private int lastElement;
	
	public Interval(int firstElement, int lastElement)
	{
		this.firstElement = firstElement;
		this.lastElement = lastElement;
	}
	
	public int getFirstElement() {
		return firstElement;
	}

	public void setFirstElement(int firstElement) {
		this.firstElement = firstElement;
	}

	public int getLastElement() {
		return lastElement;
	}

	public void setLastElement(int lastElement) {
		this.lastElement = lastElement;
	}
	@Override
	public int compareTo(Interval o)
	{
		return getFirstElement() - o.getFirstElement();
	}
	
			
}
public class Solution 
{
	public List<Interval> merge(List<Interval> intervals) 
	{
		Collections.sort(intervals);
		LinkedList<Interval> result = new LinkedList<Interval>();
				
		for(Interval inter : intervals)
		{
			if(result.isEmpty() || result.getLast().getLastElement() < inter.getFirstElement())
			{
				result.add(inter);
			}
			else
			{
				result.getLast().setLastElement(Math.max(result.getLast().getLastElement(), inter.getLastElement()));
			}
		}
		
	    return result;   
	}
	
}
