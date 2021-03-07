package com.pallavi.practice;

public class BreakingRecords {

	public static void main(String[] args) {
		int a[]= {12,24,10,24};
		int minimumScore=a[0];
		int maximumScore=a[0];
		int countMin=0;
		int countMax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<minimumScore)
			{
				countMin++;
				 minimumScore=a[i];
			}
			else if(a[i]>maximumScore)
			{
				countMax++;
				maximumScore=a[i];
			}
		}
		System.out.println("Low Score is:"+countMin+"highestScore is:"+countMax);

	}

}
