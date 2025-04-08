//Demonstrate constructor overloading by passing different types of parameters
package com.CoreJava;

import java.util.Scanner;

class DataType
{
	int num1=100 , num2=200;
	public DataType()
	{
		System.out.println("Addition of :- "+(num1+num2));
	}
	public DataType(int num1 , int num2)
	{
		this.num1=num1;
		this.num2=num2;
		System.out.println("Sub-traction of :- "+(num1-num2));
	}
	public DataType(int num1)
	{
		this.num1=num1;
		System.out.println("Multi-plication of :- "+(num1*num1));
	}
	public DataType(float a, float b)
	{
		num1=(int)a;
		num2=(int)b;
		System.out.println("Division of :- "+(num1/num2));
	}
}
public class Lab_19_Constructor_Overloading 
{
	public static void main(String[] args) 
	{
		Scanner ms=new Scanner(System.in);
		System.out.println("Enter First Number :- ");
		int n1=ms.nextInt();
		System.out.println("Enter Second Number :- ");
		int n2=ms.nextInt();
		DataType p=new DataType();
		DataType p1=new DataType(n1,n2);
		DataType p2=new DataType(n1);
		DataType p3=new DataType(5f ,5f);
	}

}
