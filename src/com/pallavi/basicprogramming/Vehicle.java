package com.pallavi.basicprogramming;

public class Vehicle {
	void run() {
		System.out.println("Vehicle is running");
	}

}
class Bike extends Vehicle
{
	void run()
	{System.out.println("Bike is running");
	}
	
	public static void main(String[] args)
	{
		Vehicle v=new Bike();
		v.run();
	}
}
