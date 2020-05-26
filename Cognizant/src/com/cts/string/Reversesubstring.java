package com.cts.string;

public class Reversesubstring {

	public static void main(String[] args) {
StringBuffer s=new StringBuffer("abcdefghi");
String reverse="";
String reverse1="";
String reverse2="";
String s1 = s.substring(0, 3);
String s2 = s.substring(3, 6);
String s3 = s.substring(6, 9);
for (int i=s1.length()-1;i>=0;i--)
{
reverse=reverse+s1.charAt(i);
reverse1=reverse1+s2.charAt(i);
reverse2=reverse2+s3.charAt(i);
}
reverse=reverse+reverse1+reverse2;
System.out.println("Reversed string: "+reverse);
	}
}
