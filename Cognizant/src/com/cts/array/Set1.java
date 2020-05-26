package com.cts.array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Integer>h=new <Integer> HashSet();Set <Integer>h1=new LinkedHashSet<Integer>();
		Set t=new TreeSet();

		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(4);
		h.add(60);
		h.add(70);
		h.add(80);
		h.add(90);
		h.add(100);
		System.out.println(h);
		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(60);
		h1.add(50);
		h1.add(60);
		h1.add(70);
		h1.add(80);
		h1.add(90);
		h1.add(100);
		System.out.println(h1);
		h.retainAll(h1);
		System.out.println("Hashset common values");
		System.out.println(h);
		
		t.add(100);
		t.add(12);
		t.add(10);
		t.add(47);
		t.add(50); 
		t.add(60);
		t.add(80);
		t.add(70);
		t.add(90);
		t.add(20);
		h1.retainAll(t);
		System.out.println("Treeset and Linked Set common values");
		System.out.println(h1);
		t.removeAll(h1);
		System.out.println("Treeset after removal");
		System.out.println(t);

	}

}
