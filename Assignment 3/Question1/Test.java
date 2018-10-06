package com.aed.assignment.day3;
/**
 * @author Arya Soman			
 *
 */
public class Test {

	public static void main(String[] args) 
	{
		Course course = new Course("Maths");
		Course course2 = new Course("Science");
		
		Student student1 = new Student("Tom", 1);
		Student student2 = new Student("John", 2);
		Student student3 = new Student("Mathew", 3);
		Student student4 = new Student("Sam", 4);
		Student student5 = new Student("Ann", 5);
		Student student6 = new Student("Susan", 6);
		Student student7 = new Student("Lee", 7);
		Student student8 = new Student("Rose", 8);
		Student student9 = new Student("Aby", 9);
		Student student10 = new Student("Lilly", 10);
		//Student student11 = new Student("Angel", 11); //to check max number of students that can be registered
		
		
		course.registerStudent(student1);
		course.registerStudent(student2);
		course.registerStudent(student3);
		course.registerStudent(student4);
		course.registerStudent(student5);
		course.registerStudent(student6);
		course.registerStudent(student7);
		course.registerStudent(student8);
		course.registerStudent(student9);
		course.registerStudent(student10);
		//course.registerStudent(student11);  //to check max number of students that can be registered
		
		course2.registerStudent(student1);
		
		System.out.println("Is the registration full ? " +course.isFull());
		System.out.println("Is the registration full ? " +course2.isFull());
		
		Student[] s = course.getStudents();
		System.out.println("Number of students registered for " +course.getName() +" : " + course.getNumberOfStudent());
		System.out.println("Number of students registered for " +course2.getName() +" : " + course2.getNumberOfStudent());
		System.out.println("NAME, ID");
		for(int i = 0; i< course.getNumberOfStudent() ; i++)
		{
			System.out.println(s[i].getName() + ", "+ s[i].getId());
		}
		
	}

}
