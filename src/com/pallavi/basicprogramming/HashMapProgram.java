package com.pallavi.basicprogramming;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapProgram {
	public static void main(String[] args)
	{
		Map<String,Integer> map=new TreeMap<>();
		map.put( "Apple",1);
		map.put( "Mango",2);
		map.put("banana",3);
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
	}

}
