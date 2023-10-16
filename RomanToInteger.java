package com.venky.cloudvandhana;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RomanToInteger {

	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter romanletter I-X");
	 String s=sc.next();
	 s=s.toUpperCase();
	 Map<String,Integer> m = new LinkedHashMap<>();
	 m.put("I",1);
	 m.put("II",2);
	 m.put("III",3);
	 m.put("IV",4);
	 m.put("V",5);
	 m.put("VI",6);
	 m.put("VII",7);
	 m.put("VIII",8);
	 m.put("IX",9);
	 m.put("X",10);

	 Set<String>k=m.keySet();
	 Iterator<String>i=k.iterator();
	 while(i.hasNext())
	 {
		 String se = i.next();
		 if(s.equals(se))
		 {
			 System.out.println(m.get(se));
		 }   
	   }
	}
}
