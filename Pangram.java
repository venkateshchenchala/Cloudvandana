package com.venky.cloudvandhana;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=scn.nextLine();
		s=s.toLowerCase();
		if(ispanagram(s))System.out.println("panagram");
		else System.out.println("Not panagram");
	}
	public static boolean ispanagram(String s)
	{
		 Set<Character>a=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c>='a'&&c<='z')
		     a.add(c);	
			if(a.size()==26)return true;
		}
         return false;
		
		
	}
}


