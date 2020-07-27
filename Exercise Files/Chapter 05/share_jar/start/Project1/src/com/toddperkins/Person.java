package com.toddperkins;

public class Person {
	
	public String name;
	
	public Person(String myName) {
		name = myName;
	}
	
	public void sayHello() {
		System.out.println("Hello " + name);
	}
	
}
