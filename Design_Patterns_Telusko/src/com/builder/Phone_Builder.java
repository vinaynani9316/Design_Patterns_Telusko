package com.builder;

public class Phone_Builder 
{
	private String OS;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;
	
	public Phone_Builder setOS(String oS) {
		OS = oS;
		return this;
	}
	public Phone_Builder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public Phone_Builder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public Phone_Builder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public Phone_Builder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone getPhone()
	{
		return new Phone(OS, ram, processor, screenSize, battery);
	}

}
