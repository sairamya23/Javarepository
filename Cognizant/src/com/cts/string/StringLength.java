package com.cts.string;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*String s="GreensTechnology";
String s1="SeleniumAutomationtool";
String s3="velmurugan";
String s4="j a v a p r o g r a m";
String s5="9095484678";
System.out.println(s.length());
System.out.println(s1.length());
System.out.println(s3.length());
System.out.println(s4.length());
System.out.println(s5.length());
System.out.println(s.lastIndexOf('o'));
System.out.println(s1.indexOf('o'));
System.out.println(s3.indexOf('n'));
System.out.println(s4.lastIndexOf(' '));
System.out.println(s5.indexOf('8'));
System.out.println(s.charAt(9));
System.out.println(s1.charAt(11));
System.out.println(s3.charAt(4));
System.out.println(s4.charAt(8));
System.out.println(s5.charAt(8));*/
Scanner t=new Scanner(System.in);
/*System.out.println("Enter string1:");
String x=t.nextLine();
char[] ca=x.toCharArray();
System.out.println(ca.length);

String lx=x.toLowerCase();
System.out.println(lx);
System.out.println("Enter String 2:");
String x1=t.nextLine();
String zx=x1.toLowerCase();
String ux1=x1.toUpperCase();
System.out.println(ux1);
boolean b=x.equalsIgnoreCase((x1));
System.out.println(b);
System.out.println("Enter the Email:");
String email=t.nextLine();
boolean b1=email.contains("@");
System.out.println(b1);
System.out.println("Enter the Address:");
String address=t.nextLine();
int len=address.length();
System.out.println("Length:"+len);
System.out.println("Enter Phone no:");
String Phoneno=t.next();
String pin=address.substring(len-6, len);
System.out.println(pin);

String digi="\\d+";
if(pin.matches(digi))
{
//{String newadd=address.replace(pin, " ");
//System.out.println("New Address:"+newadd);
	System.out.println( "Valid Pin" );
}
/*long parseLong = Long.parseLong(p);
else
{
	System.out.println("Invalid pincode");
	}*/
		/*char c=0;
		int uppercasecount=0;
		int lowercasecount=0;
		
		String str = "Welcome to SeleNium";
		String str1="Welcome to JAVA";
		
		String str3=new String("Welcome");
		String str4=new String("To");
		String str5=new String("Java");
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		int add1=System.identityHashCode(str);
		int add2=System.identityHashCode(str1);
		System.out.println(add1);
		System.out.println(add2);
		String[]j=str.split("l");
		for(String c2:j)
				{
			System.out.println(c2);
				}
		System.out.println(str.substring(0,7));
		
			boolean b=str.startsWith("welcome");
			System.out.println(b);
			boolean b3=str.endsWith("Selenium");
			System.out.println(b3);
			boolean b1=str.isEmpty();
			System.out.println(b1);
			boolean b2=str1.isEmpty();
			System.out.println(b2);
			System.out.println("Enter Name1");
			String name1=t.nextLine();
			System.out.println("Enter Name2:");
			String name2=t.nextLine();
			int c1=name1.compareTo(name2);
			System.out.println(c1);
			
			if(name1.equals(name2))
			{
				System.out.println("Strings are equal");
			}
			else
			{
				System.out.println("Not equal Strings");
			}*/
//Vowels and consonants count
			String st="Welcome@123";
			int vowels=0;
			int consonants=0;
			for(int l=0;l<st.length();l++)
			{
			char cha=st.charAt(l);
			if(cha=='a'||cha=='e'||cha=='i'||cha=='o'||cha=='u')
			{
				vowels+=1;
				
			}
			else
			{
				consonants+=1;
				
			}
			}
			System.out.println("Vowels:"+vowels);
			System.out.println("Consonants:"+consonants);
			String sta=st.replaceAll("[aeiou]", "@");
			System.out.println(sta);
			int len = st.length();
			int uc=0;
			int lc=0;
			int dig=0;
			int spc=0;
		     // Getting the count of caps, small,digit and special characters
		      for (int i = 0; i < len; i++) {
		        char c = st.charAt(i);
		      if (Character.isUpperCase(c)) {
		    	  uc+=1;
		      }
		      else if(Character.isLowerCase(c))
		      {
		    	  lc+=1;
		    	  
		      }
		      else if(Character.isDigit(c))
		      {
		    	  dig+=1;
		    	  		      }
		      else
		    	  spc+=1;
		      }
		      System.out.println("CAPITAL LETTERS:"+uc);
		      System.out.println("SMALL LETTERS:"+lc);
		      System.out.println("NUMBERS:"+dig);
		      System.out.println("SPECIAL CHARACTERS:"+spc);
			//Convert to upper and lower case
	     /* System.out.println("Original String: "+str);
	      int len = str.length();
	      StringBuffer strBuffer = new StringBuffer(len);
	      for (int i = 0; i < len; i++) {
	         c = str.charAt(i);
	      if (Character.isUpperCase(c)) {
	    	  uppercasecount+=1;
	            c = Character.toLowerCase(c);
	            
	         }
	         
	         else  if (Character.isLowerCase(c)) {
	        	 lowercasecount+=1;
	            c = Character.toUpperCase(c);
	            
	         }
	         strBuffer.append(c);
	      }
	      System.out.println("Uppercase:"+uppercasecount);
	      System.out.println("Lowercase:"+lowercasecount);
	      
	      System.out.println("Converting case: "+strBuffer.toString());
	   }
	}*/
	

	}
}

	
