package com.observer;

public class Subscriber implements Observer
{
	private String name;
	private Channel channel;
    
	@Override
	public void update()
	{
		System.out.println("Hey " + name+ ", video uploaded: " + channel.title);
	}
	
	@Override
	public void subscribeChannel(Channel ch)
	{
		channel=ch;
	}

	public Subscriber(String name) {
		super();
		this.name = name;
	}
}
