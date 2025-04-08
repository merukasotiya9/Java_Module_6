//Implement a program using HashSet to remove duplicate elements from a list.
package com.CoreJava;

import java.util.HashSet;

public class Lab_38_Hashset_Duplicate 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> set =new HashSet<>();
		
		set.add(10);
		set.add(10);
		set.add(20);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(40);
		
		System.out.println(set);
		set.remove(10);
		System.out.println("Size of set "+set.size());
		System.out.println(set);
		
		
		int[] a= {1,2,8,3,4,5,1,2,8,6,5,9,3,6,8};
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		System.out.println(set);
	}

}
