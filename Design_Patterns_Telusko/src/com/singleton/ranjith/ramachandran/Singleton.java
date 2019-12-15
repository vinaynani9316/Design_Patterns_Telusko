package com.singleton.ranjith.ramachandran;

import java.io.ObjectStreamException;
import java.io.Serializable;

enum Singleton
{
	INSTANCE;
	
	public String getConfiguration()
	 {
		 return "asgh";
	 }
}
 

//public class Singleton implements Cloneable                   //                                            //implements Serializable
//{
//	private Singleton()
//	{
//		if(soleInstance!=null)
//			throw new RuntimeException("cannot create, please use getInstance()");
//		
//		//proceed with creation
//		System.out.println("Singlton creating");
//	}
//	
//	private static volatile Singleton soleInstance = null;
//	
//	public static Singleton getInstance()
//	{
//		return Holder.INSTANCE;
////		//Double check locking
////		if(soleInstance==null)                  //check1
////			synchronized(Singleton.class) {
////				if(soleInstance== null)        //check2
////			soleInstance= new Singleton();
////			}
////		return soleInstance;
//	}
//	static class Holder
//	{
//		static final Singleton INSTANCE = new Singleton();
//	}
//	
//	protected Object clone() throws CloneNotSupportedException
//	{
//		return super.clone();
//	}
//	
//	private Object readResolve() throws ObjectStreamException
//	{
//		System.out.println("....readResolve....");
//		return soleInstance;
//	}
//
//}

