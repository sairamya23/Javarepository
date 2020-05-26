package com.cts.array;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Map1 extends empD {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap <Integer,String> m=new HashMap<Integer,String>();
LinkedHashMap <Integer,empD> lm=new LinkedHashMap<Integer,empD>();
TreeMap tm=new TreeMap();
empD ma=new empD();
Hashtable ht=new Hashtable();
empD o=ma.empDet("Ramya", "9710919408", "28/12/86", "12/11/2007", "sairamya23@gmail.com", 'F');
lm.put(10, o);
System.out.println(lm);
/*m.put(20,"sql");
m.put(30, "oops");
m.put(40, "Sql");
m.put(50, "oracle");
m.put(60,"DB");
m.put(10,"Selenium");
m.put(50, "PSql");
m.put(40, "Hadoop");
System.out.println(m);
lm.put(10, "10");
lm.put(20,"20");
lm.put(30, "30");
lm.put(40, "40");
lm.put(50, "50");
lm.put(60,"60");
lm.put(10,"10");
lm.put(50, "50");
lm.put(40, "40");
System.out.println(lm);
tm.put("!", "10");
tm.put("@","20");
tm.put("#", "30");
tm.put("$", "40");
tm.put("%", "50");
tm.put("^","60");
tm.put("&","10");
tm.put("*", "50");
tm.put("(", "40");
System.out.println(tm);
ht.put("vel", "Selenium");
ht.put("Ganesh","framework");
ht.put("Dinesh", "oracle");
ht.put("Vengat", "corejava");
ht.put("subash", "jira");
System.out.println(ht);
//Getting Keys//

Set<Integer> keySet = m.keySet();
System.out.println("Hash Map Keys are :"+keySet);
Set<Integer> keySet2 = lm.keySet();
System.out.println("Linked Hash Map keys are :"+keySet2);
Set keySet3 = tm.keySet();
System.out.println("Tree Map Keys are :"+keySet3);
Set keySet4 = ht.keySet();
System.out.println("Hash Table Keys are :"+keySet4);
//Getting Values//
alues are :"+v2);
Collection v3 = tm.values();
System.out.println("Tree Map Values are :"+v3);
Collection v4 = ht.values()
Collection<String> v1 = m.values();
System.out.println("Hash Map Values are :"+v1);
Collection<String> v2 = lm.values();
System.out.println("Linked Hash Map v;
System.out.println("Hash Table Values are :"+v4);

//Iterating using Enhanced for loop and getting Key and Value

Set<Entry<Integer, String>> entrySet = m.entrySet();
for(Entry<Integer, String>entry:entrySet)	
{
	//System.out.println("HashMap :" +entry);
	System.out.println("Key in HashMap :" +entry.getKey());
	System.out.println("Value in HashMap :"+entry.getValue());

}	
Set<Entry<Integer, String>> e = lm.entrySet();
for(Entry<Integer,String> e1:e)
{
//System.out.println("Linked HashMap :" +e1);
System.out.println("Key in LinkedHashMap :" +e1.getKey());
System.out.println("Value in LinkedHashMap :"+e1.getValue());
}
Set <Entry>et = tm.entrySet();
for(Entry et1:et)
{
//System.out.println("Tree Map :"+et1);
System.out.println("key in Tree Map :" +et1.getKey());
System.out.println("

Value in Tree Map :" + et1.getValue());
}
Set <Entry>et2 = ht.entrySet();
for(Entry c:et2)
{
//	System.out.println("HashTable :" +c);
	System.out.println("Key in HashTable :" +c.getKey());
	System.out.println("Value in HashTable :"+c.getValue());
}
//Scanner Class
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
}
*/
	}
}