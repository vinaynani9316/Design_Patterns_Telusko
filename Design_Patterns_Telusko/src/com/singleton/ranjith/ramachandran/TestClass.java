package com.singleton.ranjith.ramachandran;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TestClass
{
	static void useSingleton()
	{
		Singleton singleton= Singleton.INSTANCE;
		print("singleton", singleton);
	}
	public static void main(String[] args) throws Exception
	{
		ExecutorService service= Executors.newFixedThreadPool(2);
		service.submit(TestClass::useSingleton);
		service.submit(TestClass::useSingleton);
		service.shutdown();
		
//		Singleton s1=Singleton.getInstance();
//		Singleton s2=Singleton.getInstance();
//		
//		print("s1", s1);
//		print("s2", s2);
		
		//Reflection
//		Class clazz= Class.forName("com.singleton.Singleton");
//		Constructor<Singleton> ctor= clazz.getDeclaredConstructor();
//		ctor.setAccessible(true);
//		Singleton s3= ctor.newInstance();            // it is creating a new instance violating singleton definition
		
		//Serialization example
//		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("src/Singleton.java"));
//	    oos.writeObject(s2);
//	    
//	    ObjectInputStream ois= new ObjectInputStream(new FileInputStream("src/Singleton.java"));
//	    Singleton s3= (Singleton)ois.readObject();
		
		// Using cloneable
//		Singleton s3=(Singleton)s2.clone();
		
	//	print("s3",s3);
	}
		
		static void print(String name, Singleton object)
		{
			System.out.println(String.format("Object : %s, Hashcode: %d", name, object.hashCode() ));
		}
		
}