package com.basic;


class Subject{
	// instance variable --> A variable declared within the class but outside the body of the method is called instance variable.
	int ScienceMarks;     
	int MathsMarks;
	int GKMarks;
	}


public class InstanceVariable {
	
	public static void main(String[] args) {
		
		Subject sub = new Subject();
		
		sub.ScienceMarks=96;
		System.out.println(sub.ScienceMarks);
		
		
		
	}

}