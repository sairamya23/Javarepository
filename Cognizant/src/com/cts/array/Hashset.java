package com.cts.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer>h=new <Integer> HashSet();
Set<Integer>h1=new LinkedHashSet<Integer>();
Set <Integer>t=new TreeSet<Integer>();

h.add(10);
h.add(20);
h.add(30);
h.add(40);
h.add(50);
h.add(60);
h.add(70);
h.add(80);
h.add(90);
h.add(100);
System.out.println(h);
h1.add(10);
h1.add(20);
h1.add(30);
h1.add(40);
h1.add(50);
h1.add(60);
h1.add(70);
h1.add(80);
h1.add(90);
h1.add(100);
System.out.println(h1);
t.add(100);
t.add(10);
t.add(10);
t.add(47);
t.add(50);
t.add(60);
t.add(80);
t.add(70);
t.add(90);
t.add(20);
for(int i:t)
{
	System.out.println(i);
}
List <Integer>al=new <Integer> ArrayList();
Set <Integer>h2=new <Integer> HashSet();
al.add(1);
al.add(2);
al.add(3);
al.add(4);
al.add(5);
h2.addAll(al);



	}

}
