package com.codingdojo.miriam;

public class TestGorilla {

	public static void main(String[] args) {
		Gorilla gorilla1 = new Gorilla(40);
		gorilla1.thowSomething();
		gorilla1.thowSomething();
		gorilla1.thowSomething();
		
		gorilla1.eatBannanas();
		gorilla1.eatBannanas();
		
		gorilla1.climb();
		
		System.out.println("========================");
		gorilla1.showEnergy();
		

	}

}
