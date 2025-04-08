//Write a program to create and run multiple threads using the Thread class
package com.CoreJava;
class ThreadClassDemo extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println("This  thread is running..." + i);
		}
		System.out.println("demo thread is completed");
	}
}
public class Lab_31_Multiple_Threads 
{

	public static void main(String[] args) 
	{
		ThreadClassDemo td = new ThreadClassDemo();
		td.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("This is main thread..." + i);
		}
		System.out.println("main thread completed");
	}

}
