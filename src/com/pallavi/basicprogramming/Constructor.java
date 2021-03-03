package com.pallavi.basicprogramming;

public class Constructor {
	int id;
	String name;
	Constructor(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
void display()
{
	System.out.println(id+" " +name);
}
	public static void main(String[] args) {
		Constructor c=new Constructor(11,"pallavi");
		Constructor c2=new Constructor(12,"sharath");
		c2.display();
	
	}

}
