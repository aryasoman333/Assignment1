/**
 * 
 */
package com.aed.assignment.day3;

/**
 * @author Arya Soman			
 *
 */
public class Student 
{
	private String name;
	private int id;
	
	/**
	 * Constructor where name and id are initialised during object creation
	 * @param name
	 * @param id
	 */
	public Student(String name, int id) 
	{
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
