package com.character4;

public class ExplicitStatic {
	
	public static void main(String[] args) {
		System.out.println("Inside main()");
		Cups.c1.f(99); // (1)
	}
	static Cups x = new Cups(); // (2)
	static Cups y = new Cups(); // (2)

}
