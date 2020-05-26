package com.cts.array;

public class Arraytask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int sum=0;
double ave;
System.out.println(a.length);
//Sum and average of array elements
for(int i=0;i<a.length;i++)
{
	sum+=a[i];

	}
ave=sum/a.length;
System.out.println("Sum of values in Array:"+sum);
System.out.println("Average value:"+ave);

}
}
