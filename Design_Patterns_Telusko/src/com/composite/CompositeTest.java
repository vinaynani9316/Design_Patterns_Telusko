package com.composite;

public class CompositeTest {

	public static void main(String[] args) 
	{
		Component hd= new Leaf(4000, "HDD");
		Component ram= new Leaf(5000, "RAM");
		Component moniter= new Leaf(7000, "Moniter");
		Component cpu= new Leaf(6000, "CPU");
		Component mouse= new Leaf(1000, "Mouse");
		
		Composite ph= new Composite("peripheral");
		Composite mb= new Composite("MotherBoard");
		Composite cabinet= new Composite("Cabinet");
		Composite computer= new Composite("Computer");
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		ph.addComponent(mouse);
		ph.addComponent(moniter);
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		ph.showPrice();
		computer.showPrice();
		mb.showPrice();
	
		
	
	}

}
