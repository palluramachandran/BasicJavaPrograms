package com.pallavi.basicprogramming;

import java.util.Scanner;

public class Switch {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int a=s.nextInt();
		switch(a)
		{
		case 10:System.out.println("10");
		break;
		case 20:System.out.println("20");
		break;
		default:System.out.println("invalid number");
		break;
		}

	}
}
