package com.cts.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.wrapclass.WrapClass;
import com.wrapclass.WrapClass1;

public class UdSet extends WrapClass1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				
		
		Set <WrapClass1> s= new HashSet<WrapClass1>();
		
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		for(int i=0;i<=1;i++)
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
		WrapClass1 r=new WrapClass1(eid, pno,name,add, dob,doj,email,gen,sal);
		s.add(r);
		
		/*			
	r.setId(1);
	r.setAddress("Ambattur");
	r.setDob("28/12/86");
	r.setDoj("18/03/20");
	r.setEmail("Ramya@gmail.com");
	r.setGender('F');
	r.setName("Ramya");
	r.setPno(9710919408l);
	r.setSal(2000001.0);
	r1.setId(2);
	r1.setAddress("Street");
	r1.setDob("28/12/86");
	r1.setDoj("18/03/20");
	r1.setEmail("Ramya@gmail.com");
	r1.setGender('M');
	r1.setName("Sam");
	r1.setPno(9710919408l);
	r1.setSal(2000021.0);
	*/
		}
	
	for (WrapClass1 ar : s) {
		System.out.print(ar.getId());
		System.out.print(" "   +ar.getAddress());
		System.out.print(" " +ar.getGender());
		System.out.println();
	}
	
	}
}
