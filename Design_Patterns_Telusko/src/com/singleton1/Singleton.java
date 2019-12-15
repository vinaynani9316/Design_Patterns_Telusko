package com.singleton1;

public class Singleton {

	public static void main(String[] args) 
	{
		Abc obj1 =Abc.getInstance();
		Abc obj2=Abc.getInstance();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());  //same hash code for all the instance of objects means one object created
	}

}
class Abc
{
	static Abc obj;
	
	private Abc()
	{
		System.out.println("Singleton created");   
	}
	public static Abc getInstance()
	{
		if(obj==null)                   // if we wont check condition it will create two instances here 
		obj= new Abc();
		return obj;
	}
}