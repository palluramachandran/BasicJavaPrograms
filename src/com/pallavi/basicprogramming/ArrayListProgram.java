package com.pallavi.basicprogramming;

import java.util.ArrayList;

public class ArrayListProgram {
public static void main(String[] args)
{
	ArrayList<String> list=new ArrayList();
	list.add("Pallu");
	list.add("Sharath");
	list.add("devansh");
	for(String li:list)
	{
		System.out.println(li);
	}
}
}
