package com.pallavi.basicprogramming;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		for(int i=0;i<=n;i++)
		{
			System.out.println(i);
		}
	}

}
