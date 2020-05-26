package com.cts.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map.Entry;

public class duplicatesinString {

	public static void main(String[] args) {
String s="Welcome to java Welcome to Selenium";
String[] split = s.split(" ");
List l=new ArrayList();
Map <String,Integer>m=new TreeMap<String,Integer>();
int i=1;
for(int j=0;j<split.length;j++)
{
if(m.containsKey(split[j]))
{
m.put(split[j], i+1);
}
else
{
	m.put(split[j], 1);
	
}
}
Set <Entry<String,Integer>> e=m.entrySet();
for (Entry<String, Integer> entry : e) {
	System.out.println(entry);
}

System.out.println(m.keySet());

}
}