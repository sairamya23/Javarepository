package com.cts.practice;

import java.util.Scanner;

public class MulTable {

	MulTable(int n)
	{
		for(int i=1;i<=12;i++)
		{
			System.out.println(n+ "*"+ i+ "="+n*i);
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int x=s.nextInt();
		MulTable m=new MulTable(x);

	}

}
