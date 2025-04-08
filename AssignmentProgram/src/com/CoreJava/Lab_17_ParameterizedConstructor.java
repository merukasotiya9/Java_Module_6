//Write a program to create and initialize an object using a parameterized constructor
package com.CoreJava;

import java.util.Scanner;

class Parameter
{
	int num1 , num2 ,num3;
	public Parameter(int num1 , int num2) 
	{
		this.num1=num1;
		this.num2=num2;
		System.out.println("Addition of two Numbers :- "+(num1+num2));
	}
	public Parameter(int num1)
	{
		this.num1=num1;
		System.out.println("Find the Sqaure :- "+(num1*num1));
	}
	public Parameter(int num1 , int num2 , int num3) 
	{
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
		System.out.println("Find the formual :- "+(num1*num2+num3));
	}
}
public class Lab_17_ParameterizedConstructor 
{

	public static void main(String[] args) 
	{
		Scanner mz=new Scanner(System.in);
		System.out.println("Enter First number :- ");
		int n1=mz.nextInt();
		System.out.println("Enter Second number :- ");
		int n2=mz.nextInt();
		System.out.println("Enter Third number :- ");
		int n3=mz.nextInt();
		Parameter a=new Parameter(n1,n2);
		Parameter b=new Parameter(n1);
		Parameter c=new Parameter(n1,n2,n3);
	}

}
