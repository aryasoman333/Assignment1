package com.neu;


/**
 * Assignment for your lecture 2. Please finish all the questions under 'Assignment'
 * Please try to think the extra credit question. 
 * The deadline of this assignment is 09/21/2018 23:59 PST.
 * Please feel free to contact Amanda and Zane for any questions.
 */

class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month


    Employee(String name, int age, Gender gender, double salary) {
    		//write your code here
    	this.name = name;
    	this.age = age;
    	this.gender = gender;
    	this.salary = salary;
    }

    public String getName() {
    		//write your code here
     	return this.name;
    }

    public void setName(String name) {
    		//write your code here
    		this.name=name;
    }
    public void raiseSalary(double byPercent)
    {
      	this.salary=(this.salary*byPercent)/100;
    }
}

enum Gender {
    MALE,
    FEMALE;
}


public class Assignment2 {
    // Assignment

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public double socialSecurityTax(Employee employee) {
        //write your code here
    	double socialSecurityTax = 0;
    	if(employee.salary <= 8900)
    	{
    		socialSecurityTax=(0.062*employee.salary);
    	}
    	else
    	{
    		socialSecurityTax=(0.062*106800);
    	}
    	System.out.println("Social Security tax is : " +socialSecurityTax);
    	return socialSecurityTax;
    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public double insuranceCoverage(Employee employee) {
        //write your code here
    	double employeeContribution=0.0f;
    	if(employee.age < 35)
    	{
    		employeeContribution=(0.03*employee.salary);
    	}
    	else if(employee.age >= 35 && employee.age <= 50)
    	{
    		employeeContribution=(0.04*employee.salary);
    	}
    	else if(employee.age > 50 && employee.age < 60)
    	{
    		employeeContribution=(0.05*employee.salary);
    	}
    	else if(employee.age >= 60)
    	{
    		employeeContribution=(0.06*employee.salary);
    	}
    	System.out.println("Contribution for insurance coverage is : "+employeeContribution);
    	return employeeContribution;
    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public void sortSalary(Employee e1, Employee e2, Employee e3) {
        //write your code here
    	
       	Employee[] employee = new Employee[3];
    	employee[0] = e1;
    	employee[1] = e2;
    	employee[2] = e3;
    	
    	for(int i = 0;i < employee.length-1 ;  i++)
    	{
    		for(int j=0; j < employee.length-1-i ; j++)
    		{
    			if(employee[j].salary > employee[j+1].salary)
    			{
    				Employee temp = employee[j];
    				employee[j] = employee [j+1];
    				employee[j+1] = temp;
    			}
    		}
    	}
    	
    	for(int k =0;k < employee.length ; k++)
    	{
    		System.out.print(employee[k].name + " ");
    	}
    }

    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */
    public void tripleSalary(Employee employee) {
        //write your code here
    	
    	employee.raiseSalary(300);
    }


    //Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     write your understanding here.
     Java passes by value.Even though objects have references, java does not pass the references as method arguments. Rather, it is passed by value.
     In this case, the copy of reference variables a & b are passed as arguments to the swap() method. While inside swap method, copy of reference variables a & b
     are created in stack memory as x & y with same address(as a & b) and pointing to same values(Jenny & John) in heap memory. The swap of x & y is successful inside
     swap() method, but once the control comes back to main method after the execution of swap() method, the reference variable x & y which were copies of a & b are garbage 
     collected in stack memory, and the reference variables a & b are still pointing to the same locations in heap(no swap happens for original reference variables)
    */
    public static void main(String[] args) {
    	Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
        
        //code for testing methods
        
        Assignment2 assignment2 = new Assignment2();
        Employee e1 = new Employee("tom", 23, Gender.FEMALE, 1000);
        Employee e2 = new Employee("jerry", 32, Gender.MALE, 5000);
        Employee e3 = new Employee("john", 28, Gender.MALE, 2000);
        assignment2.socialSecurityTax(e3);
        assignment2.insuranceCoverage(e2);
        assignment2.sortSalary(e1, e2, e3);
        System.out.println();
        assignment2.tripleSalary(e2);
        System.out.println("Tripled salary : "+e2.salary);
        
    }

    public static void swap(Employee x, Employee y) {
    	 Employee temp = x;
         x = y;
         y = temp;
    }
}
