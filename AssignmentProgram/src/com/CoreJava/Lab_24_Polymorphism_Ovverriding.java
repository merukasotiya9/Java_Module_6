package com.CoreJava;
class AreaShape
{
	public int area()
	{
		System.out.println("Calculationg the area shape...");
		return 0;
	}

}
class Area_Circle extends AreaShape
{
	int radious ; float pi;
	public Area_Circle(int radious , float pi)
	{
		this.radious=radious;
		this.pi=pi;
	}
	@Override
	public int area() 
	{
		return (int)(pi*radious*radious);		
	}
}
class Area_Rectangle extends AreaShape
{
	int length , width;
	public Area_Rectangle(int length , int width) 
	{
		this.length=length;
		this.width=width;
	}
	@Override
	public int area() 
	{
		return length*width;
	}
}
public class Lab_24_Polymorphism_Ovverriding 
{
	public static void main(String[] args) 
	{
		AreaShape a=new AreaShape();
		a.area();
		AreaShape c=new Area_Circle(5 , 3.14f);
		System.out.println("Area of circle :- "+c.area());
		
		AreaShape r=new Area_Rectangle(4, 6);
		System.out.println("Area of Rectangle :- "+r.area());
	}

}
