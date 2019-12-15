package com.adapter;

import com.adapter1.PilotPen;

public class PenAdapter implements Pen
{
    PilotPen pp=new PilotPen();
    
	@Override
	public void write(String str) 
	{
		pp.mark(str);
		
	}

}
