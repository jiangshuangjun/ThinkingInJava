package com.character4;

public class Cups {
	
	static Cup c1;
	static Cup c2;
	static {
		c1 = new Cup(1);
		c2 = new Cup(2);
	}
	Cups() {
		System.out.println("Cups()");
	}

}
