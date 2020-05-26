package com.cts.array;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l=new ArrayList();
		
		List a=new LinkedList();
		List c=new Vector();
				
		l.add(5);
		l.add("String");
		l.add(false);
		l.add(3.4);
		l.add(5);
		a.add(5);
		a.add("String");
		a.add(false);
		a.add(3.4);
		a.add(5);
		a.add('o');
		a.add("Hello");
		c.add(10);
		c.add(5);
		c.add("String");
		c.add(false);
		c.add(3.4);
		c.add(5);
		System.out.println(l);
		System.out.println(a);
		System.out.println(c);
		
		System.out.println(l.size());
		System.out.println(a.size());
		System.out.println(c.size());

	}

}
