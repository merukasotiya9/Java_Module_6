//Implement multiple catch blocks for different types of exceptions.
package com.CoreJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lab_29_Multiple_Catch_Blocks 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileOutputStream fos = new FileOutputStream("test.txt"); // FileNotFound
			String s = "This is my Assignment topic...";
			byte[] b = s.getBytes();
			fos.write(b); 
			fos.flush(); 
			fos.close(); 
			
			int a[]= {0 , 1 , 2 , 3 , 4};
			System.out.println(a[5]);
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("This is FileNotFound Exception...");
		}
		catch (IOException e) 
		{
			System.out.println("This is a IOException...");
			e.printStackTrace();
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Index is out of Bounds....");
		}
	}

}
