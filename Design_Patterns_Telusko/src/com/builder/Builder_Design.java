package com.builder;

public class Builder_Design {

	public static void main(String[] args) 
	{
		Phone p= new Phone_Builder().setOS("Andriod").setScreenSize(5.5).getPhone();
		System.out.println(p);
		
	}

}
