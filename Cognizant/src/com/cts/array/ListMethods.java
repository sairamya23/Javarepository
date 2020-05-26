package com.cts.array;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <Integer>l=new <Integer> ArrayList();
l.add(10);
l.add(20);
l.add(30);
l.add(40);
l.add(50);
l.add(10);
l.add(100);
l.add(50);
int i = l.indexOf(10);
int j=l.lastIndexOf(10);
System.out.println("Index of 10:"+i);
System.out.println("Last Index of 10:"+j);
Integer[] a = l.toArray(new Integer[] {});
//Getting all the index of 10 and 40
for(int k=0;k<l.size();k++)
{
if(a[k]==10||a[k]==50)
{System.out.println(k);
}
}
int b=l.get(2);
int c=l.get(4);
System.out.println("Second index value is:"+b);
System.out.println("Fourth index value is:"+c);
System.out.println("Normal for loop");
for(int q=0;q<l.size();q++)
{System.out.println(l.get(q));
}
System.out.println("------------------------------");
System.out.println("Enhanced for loop");
for(Integer w:l)
{
	
	System.out.println(w);
}
//Remove the value at the indexes
l.remove(2);
System.out.print(l);
l.remove(l.lastIndexOf(10));
System.out.println();
System.out.print(l);

//Add the value
l.add(2, 50);
l.add(7,70);
l.add(80);
l.set(l.lastIndexOf(50), 100);
l.set(l.indexOf(40), 90);
System.out.println();
System.out.println(l);
System.out.println("----------After replcement------");
//replace all 50 to 1
for(int e=0;e<l.size();e++)
if(l.get(e)==50)
{
	l.set(e,1);
}

	System.out.println();
System.out.println(l);
}
}

	


