//Write a program to demonstrate exception handling using try-catch-finally
package com.CoreJava;

public class Lab_28_Try_Catch_Finally
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("We are dividing 10 by 0");
			int x = 10/0; 
			System.out.println(x); 
		}
		catch(Exception e)
		{
			System.out.println("Dividing by zero : ArithmeticException ");
//			e.printStackTrace();
		}
		finally
		{
			System.out.println("Program Succesfully ended..");
		}
	}

}
