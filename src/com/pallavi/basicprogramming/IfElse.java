package com.pallavi.basicprogramming;

import java.util.Scanner;

public class IfElse {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int number=s.nextInt();

		if(number%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}

	}

}
