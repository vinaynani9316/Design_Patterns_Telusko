package com.adapter;

public class School {

	public static void main(String[] args) 
	{
		AssignmentWork as= new AssignmentWork();

		Pen pa=new PenAdapter();
		as.setP(pa);
		as.writeAssignment("I am bit tired to write assignment");
		

	}

}
