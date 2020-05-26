package com.cts.array;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set s=new LinkedHashSet ();
Scanner sc=new Scanner(System.in);
Scanner sc1=new Scanner(System.in);
for(int i=0;i<10;i++)
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
String gen=sc.next();
System.out.println("Enter the Salary:");
double sal=sc.nextDouble();
s.add(eid);
s.add(name);
s.add(pno);
s.add(add);
s.add(dob);
s.add(doj);
s.add(email);
s.add(gen);
s.add(sal);

}
System.out.println("Employee Details:");
System.out.println(s);
System.out.println();







	}

}
