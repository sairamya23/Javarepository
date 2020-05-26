package com.cts.array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
public class Removeduplicates {

			public static void main(String[] args) throws CloneNotSupportedException 
	    {
			
	        Integer[] n = new Integer[] {100,20,10,30,40,50,10,30,50};
	        Map<Integer,Integer> m=new HashMap<Integer,Integer>();
	        int i=1;
	        for(int j=0;j<n.length-1;j++)
	        if(m.containsKey(n[j]))
	        {
	        	m.put(n[j], i+1);
	        }
	        else
	        {
	        	m.put(n[j], 1);
	        		        }
	        Set <Entry<Integer,Integer>> st=m.entrySet();
	        for (Entry<Integer, Integer> entry : st) {
				System.out.println(entry);
			}
	    }	
			}
	       /* Integer [] temp=new Integer[9];
	        Arrays.sort(n); 
	        System.out.println(Arrays.toString(n));
	        int j=0;
	        for(int i=0;i<n.length-1;i++)
	        {
	        	      	
	        	if (n[i]!=n[i+1])
	        	{
	        		temp[j]=n[i];
	        		j++;
	        	}
	        }
	        
	        		temp[j++]=n[n.length-1];
	        	
	        		System.out.println();
	        		
	        	for(int k=0;k<j;k++)
	        	{
	        		System.out.println(temp[k]);
	        	}
	        		
	        		        	}
	        }
	       /*System.out.println("------------------------");
	        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(n) );
	         
	        
	        Integer[] newn = linkedHashSet.toArray(new Integer[] {	});
	        for(int y:newn)
	        {System.out.print(y+" ");
	        	
	        }*/
	    
	