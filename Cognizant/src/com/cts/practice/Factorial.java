package com.cts.practice;

import java.util.Scanner;

public class Factorial {
	int fact=1;
	Factorial(int x)
	{
		for(int i=1;i<=x;i++)
		{
			fact*=i;
		}
		System.out.println("Factorial is :"+fact);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
int x=s.nextInt();
Factorial f=new Factorial(x);


	}

}
