package com.pallavi.basicprogramming;

public class ExceptionHandle {
public static void main(String[] args)
{
	try {
		int data=50/0;
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
	finally{
		System.out.println("closing connection");

	
	}
	System.out.println("rest of the code executed");
}
}
