package com.prototype;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		BookShop bs= new BookShop();
		bs.setShopName("Novelty");
		bs.loadData();
		
		BookShop bs1= bs.clone(); // clone has two types of object shallow cloning by default i.e, it will duplicate the object
		bs1.setShopName("Reynolds");         // Deep cloning object it will create new object from reference of object1 respectively. 
		bs1.loadData();
		bs.getBooks().remove(2);  // removing index of bid3 from bs object1 & independent
		bs1.getBooks().remove(3); // removing index of bid4 from bs2 object2 & this object is deep cloned so independent of object1(bs)
		
		System.out.println(bs);
		System.out.println(bs1);
		

	}

}
