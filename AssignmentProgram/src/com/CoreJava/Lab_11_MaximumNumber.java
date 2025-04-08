//Write a program to find the maximum of three numbers using a method
package com.CoreJava;

import java.util.Scanner;
	
public class Lab_11_MaximumNumber 
{
	int num1,num2,num3;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Lab_11_MaximumNumber m=new Lab_11_MaximumNumber();
		m.set_Data();
		m.findMax();
	}
	public void set_Data()
	{
		System.out.println("Enter First Number :- ");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number :- ");
		int num2=sc.nextInt();
		System.out.println("Enter third Number :- ");
		int num3=sc.nextInt();
	}
public  void findMax()
	{
		if(num1>num2 && num1>num3)
		{
			System.out.println(" Number "+num1+" is Maximum");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println(" Number "+num2+" is Maximum");
		}
		else if(num3>num1 && num3>num2)
		{
			System.out.println(" Number "+num3+" is Maximum");
		}
	}
	
}
