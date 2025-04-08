package com.CoreJava;

class Cycle implements Bycycle,MotorCycle,CarBaby
{
	String c_name;
	int price;
		
	@Override
	public void set_Data() 
	{
		c_name="Avon Cycle";
		price=5000;
	}
	@Override
	public void display() 
	{
		System.out.println("Cycle name is "+c_name);
		System.out.println("Cycle price is "+price);
	}
	@Override
	public void bikeInfo() 
	{
//		System.out.println(b_name);
//		System.out.println(Price);
	}
	@Override
	public void displayInfo() 
	{		
		System.out.println("Bike name is "+b_name);
		System.out.println("Bike Price is "+Price);
	}
	@Override
	public void carInfo() 
	{
		System.out.println(C_name);
		System.out.println(c_price);
	}
	@Override
	public void displayCarInfo() 
	{
		System.out.println("Car Name is "+C_name);
		System.out.println("Car Price is "+c_price);
	}
}
public class Lab_27_Multiple_Interface 
{
	public static void main(String[] args) 
		{
			Cycle c=new Cycle();
			c.set_Data();
			c.display();
			c.bikeInfo();
			c.displayInfo();
			c.carInfo();
			c.displayCarInfo();
		}
}
