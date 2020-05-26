package com.cts.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Ascen {
	
	

	public void ascen(int[] b)
	{int temp;
		System.out.println("Ascending order");
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
			if(b[i]>b[j])
			{
			temp=b[i];
			b[i]=b[j];
			b[j]=temp;
			}
		}
		
		}
		System.out.println(Arrays.toString(b));
	}
		
		public void descn(int[] b)
		{int temp;
			System.out.println("Descending order");
			for(int i=0;i<b.length;i++)
			{
				for(int j=i+1;j<b.length;j++)
				{
				if(b[i]<b[j])
				{
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
				}
			}
			
			}
		
		System.out.println(Arrays.toString(b));
		}
Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

int order;
Ascen as=new Ascen();
System.out.println("Enter the length of Array:");
int n=s.nextInt();
int [] a=new int[n];
System.out.println("Enter the numbers:");
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
	
	}
System.out.println(Arrays.toString(a));
System.out.println("Enter the order");
order=s.nextInt();
if(order==1)
{
	as.ascen(a);
}
else 
{
	as.descn(a);
}

}

	}

		