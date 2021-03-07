package com.pallavi.basicprogramming;


import java.util.ArrayList;
import java.util.List;

public class ArrayListProgram {
public static void main(String[] args)
{
	List<String> list=new ArrayList();
	list.add("Pallu");
	list.add("Sharath");
	list.add("devansh");
	for(String li:list)
	{
		System.out.println(li);
	}
}
}
