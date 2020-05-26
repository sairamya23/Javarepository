package com.cts.practice;

import java.util.Arrays;
import java.util.Scanner;

public class MaxandMin {
static int min=0;
static int max=0;
	
	public static void max(int[] b) {
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
		if(b[i]<b[j])
		{
			max=b[j];
		min=b[i];
		}
			else
			{
				max=b[i];
				min=b[j];
			}
		}
		
	}
		System.out.println("MAXIMUM NUMBER :" +max);
		System.out.println("MINIMUM NUMBER :"+min);
		}
	
	public static void main(String[] args) 
	{		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Elements in Array :");
		int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the numbers :");
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
	}

System.out.println("Elements are :"+ Arrays.toString(a));
System.out.println("Enter the option :");
String o=sc.next();
switch (o) {
case "max":
	max(a);
	break;

default:
	break;
}
	}

}
