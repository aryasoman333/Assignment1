package com.aed.assignment.day2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Assignment2Test {
	
	Assignment2 assignment2 = new Assignment2();
	Employee employee;
	

	@Test
	void testSocialSecurityTaxLessThan8900() 
	{
		//arrange
		employee = new Employee("Jenny", 20, Gender.FEMALE, 2000);
		double expectedTax = 0.062 * employee.salary;
				
		//act
		double actualTax = assignment2.socialSecurityTax(employee);
				
		//assert
		assertEquals(expectedTax, actualTax);		
	}
	@Test
	void testSocialSecurityTaxMoreThan8900() 
	{
		//arrange
		employee = new Employee("Jenny", 20, Gender.FEMALE, 9000);
		double expectedTax = 0.062 * 106800;
				
		//act
		double actualTax = assignment2.socialSecurityTax(employee);
				
		//assert
		assertEquals(expectedTax, actualTax);		
	}

	@Test
	void testInsuranceCoverageBelow35() 
	{
		//arrange
		employee = new Employee("jerry", 32, Gender.MALE, 5000);
		double expectedCoverage = 0.03 * employee.salary;
				
		//act
		double actualCoverage = assignment2.insuranceCoverage(employee);
				
		//assert
		assertEquals(expectedCoverage, actualCoverage);			
	}
	@Test
	void testInsuranceCoverageAbove60() 
	{
		//arrange
		employee = new Employee("jerry", 62, Gender.MALE, 5000);
		double expectedCoverage = 0.06 * employee.salary;
				
		//act
		double actualCoverage = assignment2.insuranceCoverage(employee);
				
		//assert
		assertEquals(expectedCoverage, actualCoverage);			
	}

}
