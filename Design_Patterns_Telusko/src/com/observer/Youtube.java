package com.observer;

public class Youtube {

	public static void main(String[] args) 
	{
		Channel telusko =new Channel();
		
		Subscriber s1= new Subscriber("Raj");
		Subscriber s2= new Subscriber("Ram");
		Subscriber s3= new Subscriber("mohan");
		Subscriber s4= new Subscriber("Roy");
		Subscriber s5= new Subscriber("kili");
		
		telusko.subscribe(s1);
		telusko.subscribe(s2);
		telusko.subscribe(s3);
		telusko.subscribe(s4);
		telusko.subscribe(s5);
		
		telusko.unSubscribe(s4);
		
		s1.subscribeChannel(telusko);
		s2.subscribeChannel(telusko);
		s3.subscribeChannel(telusko);
		s4.subscribeChannel(telusko);
		s5.subscribeChannel(telusko);
		
		telusko.upload("Re-learnig is a kind of gate way to super power");

	}

}
