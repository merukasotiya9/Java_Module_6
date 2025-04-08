//Implement thread synchronization using synchronized blocks or methods
package com.CoreJava;
class Message
{
	public void display(String msg)
	{
		System.out.print(" [ " + msg);
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.print(" ] ");
	}
}
class Sync extends Thread 
{
	Message m1;
	String msg;
	public Sync(Message m1, String msg)
	{
		this.msg = msg;
		this.m1 = m1;
	}
	
	public void run()
	{
		synchronized (m1) 
		{
			m1.display(msg);
		}
	}
}

public class Lab_32_Syncronization_Block 
{
	public static void main(String[] args) 
	{
		Message m = new Message();
		Sync s1 = new Sync(m, "Hello");
		Sync s2 = new Sync(m, "Kese ho app!!");
		Sync s3 = new Sync(m, "Chalo byeee...");
		s1.start();
		s2.start();
		s3.start();
	}

}
