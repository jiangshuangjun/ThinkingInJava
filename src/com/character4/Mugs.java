package com.character4;

public class Mugs {
	
	Mug c1;
	Mug c2;
	// ֧�ֶԡ������ڲ��ࡱ�ĳ�ʼ��,���������һ�﷨��ʽ
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
