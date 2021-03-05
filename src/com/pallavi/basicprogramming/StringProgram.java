package com.pallavi.basicprogramming;

public class StringProgram {
public static void main(String[] args)
{
	String s="sourav";
	String s2="sachintendulkar";
	String s3=new String("sourav");
	System.out.println(s.equals(s3));
	System.out.println(s==s3);
	System.out.println(s2.equals(s3));
	System.out.println(s.compareTo(s3));
	System.out.println(s2.compareTo(s3));
	System.out.println(s+s2);
	String s4=s.concat(s3);
	System.out.println(s4);
	System.out.println(s2.substring(2, 7)); 
	System.out.println(s2.trim());
	System.out.println(s.charAt(2));
	System.out.println(s2.length());
	System.out.println(String.join("-",s,s2));
	System.out.println(s.replace("o","p"));
	String[] words=s2.split("t");
	for(String w:words)
	{
		System.out.println(w);
	}
	System.out.println(s2.toUpperCase());
}
}
