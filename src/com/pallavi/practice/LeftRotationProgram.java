package com.pallavi.practice;

import java.util.Scanner;

public class LeftRotationProgram {
	public static int[] rotate(int[] a)
	{

		int firstElement=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			
			a[i]=a[i+1];

		}
		a[a.length-1]=firstElement;

		return a;

	}

	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int n=2;
		for(int i=0;i<n;i++)
		{
			a=rotate(a);

		}
		for (int rotate : a) {
			System.out.print(rotate);

		}
	}
}
