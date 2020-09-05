package com.ravens;

public class Alien {

	private int age = 0;
	private Computer com;

	public Computer getCom() {
		return com;
	}
	public void setCom(Computer com) {
		this.com = com;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Alien() {
		System.out.println("created object of Alien");
	}
	public void printer() {
		System.out.println("printer of Alien");
	}
	public void code() {
		System.out.println("coding...");
		com.compile();
	}	

}
