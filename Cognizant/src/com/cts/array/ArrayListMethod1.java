package com.cts.array;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer>l=new <Integer> ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		List <Integer>l1=new <Integer> ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(60);
		l1.add(70);
		l1.add(100);
		l1.add(80);
		//Get the values common in both the List
		
		for(int i=0;i<l.size();i++)
		{
			for(int j=0;j<l1.size();j++)
			{
			if(l.get(i)==l1.get(j)) {
				System.out.print(l.get(i)+" ");
			}
			}
			}
		//REMOVE ALL
		List <Integer>al=new <Integer> ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		List <Integer>bl=new <Integer> ArrayList();
		bl.add(70);
		bl.add(80);
		bl.add(60);
		bl.add(70);
		bl.add(80);
		System.out.println(bl);
		
		al.removeAll(bl);
		System.out.println(al);
		
		
			/*	
			//Get the common values in 2 list when there are duplicate values
			List<Integer> l3=new <Integer> ArrayList();
			List <Integer> l4=new <Integer> ArrayList();
			l3.add(10);
			l3.add(20);
			l3.add(20);
			l3.add(40);
			l3.add(40);
			l3.add(70);
			l3.add(100);
			l3.add(80);
			l4.add(10);
			l4.add(20);
			l4.add(20);
			l4.add(30);
			l4.add(40);
			l4.add(70);
			l4.add(70);
			Set <Integer>s=new <Integer>LinkedHashSet(l3);
			Set <Integer> s1=new <Integer> LinkedHashSet(l4);
			
			System.out.println(s);
			System.out.println(s1);
			List <Integer> l5=new <Integer> ArrayList(s);
			List <Integer> l6=new <Integer> ArrayList(s1);
			
			for(int k=0;k<l5.size();k++)
			{
				for(int l=0;l<l6.size();l++)
				{
					if(l5.get(k)==l6.get(l))
					{
						System.out.print(l5.get(k)+" ");
						
					}
				}
			}
				*/		

			}
		}

			

