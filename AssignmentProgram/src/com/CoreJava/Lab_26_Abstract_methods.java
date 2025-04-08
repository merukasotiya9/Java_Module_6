//Create an abstract class and implement its methods in a subclass.
package com.CoreJava;
abstract class Vehicle
{
	String v_name;
	public Vehicle(String v_name) 
	{
		this.v_name=v_name;
	}
	public abstract void startEngine();
	
	public void displayInfo()
	{
		System.out.println("This is a "+v_name);
	}
}
class Car extends Vehicle
{
	public Car(String v_name) 
	{
		super(v_name);
	}

	@Override
	public void startEngine() 
	{
		System.out.println(v_name +" Engine start with a key..");
	}
}
class Bike extends Vehicle
{
	public Bike(String v_name) 
	{
		super(v_name);
	}
	@Override
	public void startEngine() 
	{
		System.out.println(v_name +" Engine start with kick start..");
	}
}
public class Lab_26_Abstract_methods 
{

	public static void main(String[] args) 
	{
		Vehicle c=new Car("toyota");
		Vehicle b=new Bike("splendor");
		c.displayInfo();
		c.startEngine();
		b.displayInfo();
		b.startEngine();
	}

}
