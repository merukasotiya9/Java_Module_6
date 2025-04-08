//Create a class with static variables and methods to demonstrate their use.
package com.CoreJava;

class Dditiion
{
	static int n1 , n2;
	
	public static void Add()
	{
		n1=20;n2=20;
		System.out.println(n1+n2);
	}
}
public class Lab_13_StaticMethods 
{

	public static void main(String[] args) 
	{
		Dditiion a=new Dditiion();
		a.Add();
		Dditiion.Add();
	}
}

