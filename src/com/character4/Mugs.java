package com.character4;

public class Mugs {
	
	Mug c1;
	Mug c2;
	// 支持对“匿名内部类”的初始化,必须采用这一语法格式
	{
		c1 = new Mug(1);
		c2 = new Mug(2);
		System.out.println("c1 & c2 initialized");
	}
	Mugs() {
		System.out.println("Mugs()");
	}
	public static void main(String[] args) {
		System.out.println("Inside main()");
		Mugs x = new Mugs();
	}

}
