//Write a program that demonstrates the use of an ArrayList and LinkedList.
package com.CoreJava;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lab_37_Array_Linked_List 
{

	public static void main(String[] args) 
	{
		ArrayList<String> fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Kavy");
		fruits.add("Papaya");
		fruits.addFirst("Cherry");
		fruits.add(1, "Jambun");
		
		System.out.println("Fruits list "+fruits);
		
		System.out.println("-------Used to simple for loop------ ");
		for(int i=0;i<fruits.size();i++)
		{
			System.out.println("Fruit " +  i + "  "  + fruits.get(i));
		}
		
		System.out.println("-------Used to For Each Loop------- ");
		for(String fruit :fruits)
		{
			System.out.println("fruit is "+ fruit);
		}
		
		fruits.remove("Banana");
		System.out.println("fruits list"+fruits);
		
		LinkedList list=new LinkedList();
		list.add("Dog");
		list.add("Cow");
		list.add("Jenisha");
		list.add(8182);
		list.add("Kishan");
		
		System.out.println(list);

		for(int i=0;i<list.size();i++)
		{
			System.out.println("linked list "+ list.get(i));
		}
		
		list.add(2, "Meru");
//		list.addAll("Merge the Two List "+fruits);
//		System.out.println(list);
		
		list.addFirst("Babubhai");
		list.addLast("rohan");
		System.out.println(list);
		
		list.remove("cow");
		list.removeFirst();
		System.out.println(list);

	}

}
