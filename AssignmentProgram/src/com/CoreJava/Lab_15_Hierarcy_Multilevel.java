//Create a class hierarchy and demonstrate multilevel inheritance
package com.CoreJava;

import java.util.Scanner;

class Parent
{
	String F_name;
	Scanner ms=new Scanner(System.in);
	public void f_detail()
	{
		System.out.println("Enter father Name :- ");
		F_name=ms.nextLine();
	}
}
class Child1 extends Parent
{
	String c_name;
	public void c1()
	{
		f_detail();
		System.out.println("Enter Child name:- ");
		c_name=ms.nextLine();
	}
	public void print_c1()
	{
		System.out.println(c_name+"  "+F_name);
	}
}
class Child2 extends Parent
{
	String c_name;
	public void c2()
	{
		f_detail();
		System.out.println("enter Child name :- ");
		c_name=ms.nextLine();
	}
	public void print_c2()
	{
		System.out.println(c_name+"  "+F_name);
	}

}

public class Lab_15_Hierarcy_Multilevel 
{
	public static void main(String[] args) 
	{
		Child1 c=new Child1();
		c.c1();
		c.print_c1();
		
		Child2 cc=new Child2();
		cc.c2();
		cc.print_c2();
	}

}
