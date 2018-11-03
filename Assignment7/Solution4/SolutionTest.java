package com.aed.assignment.day7.Solution4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;


class SolutionTest {

	@Test
	void test() 
	{
		//arrange
		Solution sol = new Solution();
		Interval intv = new Interval(1,6);
		Interval intv1 = new Interval(2,5);
		Interval intv2 = new Interval(4,7);
		Interval intv3= new Interval(8,8);

		List<Interval> inputIntervals = new LinkedList<>();
		inputIntervals.add(intv);
		inputIntervals.add(intv1);
		inputIntervals.add(intv2);
		inputIntervals.add(intv3);


		Interval in1 = new Interval(1,7);
		Interval in2= new Interval(8,8);

		List<Interval> outputIntervals = new LinkedList<>();
		outputIntervals.add(in1);
		outputIntervals.add(in2);

		List<Interval>  actualList = outputIntervals;

		//act
		List<Interval>  expectedList = sol.merge(inputIntervals);

		//assert
		for(int i=0; i < expectedList.size() ; i ++) 
		{
			assertEquals(expectedList.get(i).getFirstElement(), actualList.get(i).getFirstElement());
			assertEquals(expectedList.get(i).getLastElement(), actualList.get(i).getLastElement());
		}

	}

}
