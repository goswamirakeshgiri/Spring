package com.rg;

public class Drawing {
	Shape shape=null;
	String inputShape=null;
	int count;
	
	
	public void setinputShape(String inputShape)
	{
		this.inputShape=inputShape;
	}
	
	Drawing(String inputShape, int count)
	{
		this.inputShape=inputShape;
		this.count=count;
	}
	Drawing(int count)
	{
		this.count=count;
	}
	public void draw()
	{
		if (inputShape.equals("Triangle"))
		{
			shape=new Triangle();
	
		}
		if(inputShape.equals("Rectangle"))
		{
			shape=new Rectangle();
		}
		shape.draw(count);
		
	}
}
