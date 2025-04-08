//Write a program to perform matrix addition and subtraction using 2D arrays.
package com.CoreJava;

import java.util.Scanner;

public class Lab_20_Matrix_Addition_Subtraction 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row Size of Array :- ");
		int r=sc.nextInt();
		System.out.println("Enter Column Size Array :- ");
		int c=sc.nextInt();
		
		int a1[][]=new int[r][c];
		int a2[][]=new int[r][c];
		int a3[][]=new int[r][c];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter element of Array1 ["+i+"]["+j+"] :- ");
				a1[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter element of Array2 ["+i+"]["+j+"] :- ");
				a2[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Element of Array 1 ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(" "+a1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Element of Array 2 ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(" "+a2[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a3[i][j]=a1[i][j]+a2[i][j];
			}
			System.out.println();
		}
		System.out.println("Addtion of Two Matrix ");
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(" "+a3[i][j]);
			}
			System.out.println();
		}
//		for(int i=0;i<r;i++)
//		{
//			for(int j=0;j<c;j++)
//			{
//				a3[i][j]=a1[i][j]-a2[i][j];
//			}
//			System.out.println();
//		}
//		System.out.println("Sub-traction of Two Matrix ");
//		for(int i=0;i<r;i++)
//		{
//			for(int j=0;j<c;j++)
//			{
//				System.out.print(" "+a3[i][j]);
//			}
//			System.out.println();
//		}
		
	}

}
