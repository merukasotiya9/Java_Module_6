//Use the super keyword to call the parent class constructor and methods.
package com.CoreJava;
class Person
{
	String name;
	int age;
	
	public void set_Data(String name,int age)
	{
		this.name=name;
		this.age=age;
		name="Bharat";
		age=23;
	}
	public void display_info()
	{
		System.out.println("Name is :- " + name);
		System.out.println("Age is :- "+age);
	}
}
class Worker extends Person
{
	double salary;
	public Worker(String name , int age , double salary) 
	{
		
		this.name=name;
		super.age=age;
		this.salary=salary;
	}
	@Override
	public void display_info() 
	{
		super.display_info();
		System.out.println(name + "salary is  :- "+salary);
		System.out.println(name +" is working");
	}
}
class Learner extends Person
{
	String school_name;
	public Learner(String name , int age , String school_name) 
	{
		super.name=name;
		super.age=age;
		this.school_name=school_name;
	}
	@Override
	public void display_info() 
	{
		super.display_info();
		System.out.println(name +" School name is  :- "+school_name);
		System.out.println(name +" is Studing");
	}
}
public class Lab_25_Super_Keyword 
{

	public static void main(String[] args) 
	{
		Worker obj=new Worker("bharat",16,208484848);
		Learner obj1=new Learner("Meru", 15, "vivekannand");
		obj.display_info();
		obj1.display_info();
	}

}
