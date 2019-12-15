package com.factory;
public class Factory_Design 
{
	public static void main(String[] args) 
	{
		Operating_system_factory osf =new Operating_system_factory();
		Os obj= osf.getInstance("fg");
		obj.spec();
		
	}

}
