//Implement method overriding to show polymorphism in action.
package com.CoreJava;
class Shape
{
	void draw()
	{
		System.out.println("Drawing a Shape...");
	}
}
class Circle extends Shape
{
	@Override
	void draw() 
	{
		super.draw();
		System.out.println("Drawing a Circle...");
	}
}
class Rectangle extends Shape
{
	@Override
	void draw() 
	{
		super.draw();
		System.out.println("Drawing a Rectangle...");
	}
}
public class Lab_16_MethodOverriding 
{

	public static void main(String[] args) 
	{
		Shape s=new Shape();
		s.draw();
		Shape c=new Circle();
		c.draw();
		Shape r=new Rectangle();
		r.draw();
	}

}
