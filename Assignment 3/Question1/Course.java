package com.aed.assignment.day3;

/**
 * @author Arya Soman
 *
 */
public class Course 
{
	private String name;
	private int numberOfStudent; // max 10
	Student[] students;
		
	/**
	 * Constructor where name is initialised during object creation
	 * @param name
	 */
	Course(String name)
	{
		this.name = name;
		students = new Student[10];
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfStudent() {
		return numberOfStudent;
	}

	public void setNumberOfStudent(int numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}

	/**
	 * @return the array of registered students
	 */
	public Student[] getStudents() 
	{
		return students;
	}
	
	/**
	 * method to find if course registration is full
	 * @return boolean value, true if the number of students has reached 10(maximum value)
	 */
	public Boolean isFull()
	{
		if (getNumberOfStudent() >= 10)
			return true;
		else
			return false;
	}
	
	/**
	 * method for student registration - maximum of 10 students can be registered for each course
	 * @param student - student object with student details for registration
	 */
	public void registerStudent(Student student)
	{
		
		if (!isFull())
		{
			int strength = getNumberOfStudent();
			students[strength]=student;
			setNumberOfStudent(strength + 1);
		}
		else
			throw new IllegalArgumentException("Maximum number of students allowed to register is 10");
		
	}
}
