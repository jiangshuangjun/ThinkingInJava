package com.character4;

import org.junit.Test;

public class Character4Test {
	
	// 用默认构建器创建一个类（没有自变量），用它打印一条消息。创建属于这个类的一个对象
	@Test
	public void test1() throws Exception {
		new TestA();
	}
	
	// 在练习 1的基础上增加一个过载的构建器，令其采用一个 String自变量，并随同自己的消息打印出来
	@Test
	public void test2() throws Exception {
		new TestA("邓孩子");
	}
	
	// 以练习 2创建的类为基础上，创建属于它的对象句柄的一个数组，但不要实际创建对象并分配到数组里。运行程序时，注意是否打印出来自构建器调用的初始化消息
	@Test
	public void test3() throws Exception {
		TestA[] a = new TestA[]{};
	}
	
	// 创建同句柄数组联系起来的对象，最终完成练习3。
	@Test
	public void test4() throws Exception {
		TestA[] a = new TestA[]{new TestA(), new TestA("邓孩子")};
	}
	
	/* 用自变量“before”，“after”和“none”运行程序，试验 Garbage.java。重复这个操作，观察是否
	 * 从输出中看出了一些固定的模式。改变代码，使System.runFinalization()在System.gc()之前调用，再观
	 * 察结果。
	*/
	@Test
	public void test5() throws Exception {
		System.out.println("详情请见Garbage.java类");
	}

}
