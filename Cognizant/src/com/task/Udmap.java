package com.task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.cts.array.Ramya;

public class Udmap {

	public static void main(String[] args) {
		Map <Integer,List<Ramya> m= new HashMap<Integer,List<Ramya>();
		Ramya r=new Ramya();
	
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
		System.out.println("Enter the employee ID:");
		int eid=sc.nextInt();
		System.out.println("Enter the Name:");
		String name=sc1.nextLine();  
		System.out.println("Enter the Phone NO:");
		long pno=sc.nextLong();
		System.out.println("Enter the Address:");
		String add=sc1.nextLine();
		System.out.println("Enter the DOB:");
		String dob=sc1.nextLine();
		System.out.println("Enter the DOJ:");
		String doj=sc1.nextLine();
		
		System.out.println("Enter the email:");
		String email=sc1.nextLine();
		System.out.println("Enter the Gender:");
		char gen=sc.next().charAt(0);
		System.out.println("Enter the Salary:");
		double sal=sc.nextDouble();
		r.setId(eid);
		r.setAddress(add);
		r.setName(name);
		r.setDob(dob);
		r.setDoj(doj);
		r.setPno(pno);
		r.setEmail(email);
		r.setGender(gen);
		r.setSal(sal);
		
		m.put(r.getId(),;
		
		
		
	}

}
