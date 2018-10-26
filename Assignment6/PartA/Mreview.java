package com.aed.assignment.day6.partA;
/**
 * @author Arya Soman
 *
 */
import java.util.ArrayList;

public class Mreview implements Comparable<Mreview> 
{
	private String title;

	public String getTitle() 
	{
		return title;
	}

	private ArrayList<Integer> ratings; 

	public Mreview()
	{
		title = "";
		ratings = new ArrayList<Integer>();
	}

	public Mreview(String ttl)
	{
		title = ttl;
		ratings = new ArrayList<Integer>();
	}

	public Mreview(java.lang.String ttl, int firstRating)
	{
		title = ttl;
		ratings = new ArrayList<Integer>(1);
		ratings.add(firstRating);
	}

	public void addRating(int r)
	{
		ratings.add(r);
	}

	public double aveRating()
	{
		double sum = 0;
		for(double i : ratings)
		{
			sum  = sum + i;
		}
		return sum/ratings.size();
	}

	@Override
	public int compareTo(Mreview obj)
	{
		return title.compareTo(obj.title);
	}

	@Override
	public boolean equals(Object obj)
	{
		Mreview mreview = (Mreview)obj;
		return this.title.equals(mreview.title);
	}

	public int numRatings()
	{
		return ratings.size();
	}

	public String toString()
	{
		return getTitle()+ ", average "+String.format("%.2f", aveRating()) + " out of "+numRatings() +" ratings";
	}

	public static void main(String[] args)
	{
		Mreview mreview = new Mreview("Kill Bill", 3);
		mreview.addRating(4);
		mreview.addRating(3);
		System.out.println(mreview);
		System.out.println("Average rating : "+String.format("%.2f", mreview.aveRating()));

	}

}
