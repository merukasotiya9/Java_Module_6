//Use inter-thread communication methods like wait(), notify(), and notifyAll().
package com.CoreJava;
class ThreadOne extends Thread
{
	public void run()
	{
		synchronized(this)
		{
			for(int i=1;i<=5;i++)
			{
				System.out.print("First Thread : " + i + " ");
				try 
				{
                    Thread.sleep(1000);
                } catch (InterruptedException e) 
				{
                    e.printStackTrace();
                }
			}
			notify(); 
		}
	}
}
class ThreadTwo extends Thread
{
	public void run()
	{
		synchronized(this)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("Second Thread : " + j + " ");
				try 
				{
                    Thread.sleep(1000);
                } catch (InterruptedException e) 
				{
                    e.printStackTrace();
                }
			}
			notify();
		}
	}
}
public class Lab_33_Inter_Thread_Excersize 
{

	public static void main(String[] args) 
	{
		ThreadOne a = new ThreadOne();
		ThreadTwo b = new ThreadTwo();
		
		a.start();
		synchronized (a) 
		{
			try 
			{
				a.wait();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
		b.start();
		synchronized (b) 
		{
			try 
			{
				b.wait();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}

}
