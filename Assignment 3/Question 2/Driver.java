package com.aed.assignment.day3;
/**
 * @author Arya Soman
 */
public class Driver {
	public static void main(String[] args) {
		PsychiatristObject pshyc = new PsychiatristObject();
		MoodyObject sad = new SadObject();
		MoodyObject happy = new HappyObject();
		System.out.println("How are you feeling today?");
		pshyc.examine(happy);
		System.out.println();
		pshyc.observe(happy);
		System.out.println("Observation : "+happy);
		System.out.println();
		System.out.println("How are you feeling today?");
		pshyc.examine(sad);
		System.out.println();
		pshyc.observe(sad);
		System.out.println("Observation : "+sad);
	}
}