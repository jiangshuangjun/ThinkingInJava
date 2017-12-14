package com.character3;

import org.junit.Test;

public class Character3Test {
	
	// 打印出1到100之间的整数
	@Test
	public void test1() throws Exception {
		// 实现一
		for (int i = 1; i < 100; i++) {
			System.out.println(" i = " + i);
		}
		
		System.out.println("***************************");
		
		// 实现二
		int j = 1;
		while (j < 100) {
			System.out.println(" j = " + j);
			j ++;
		}
		
		System.out.println("***************************");
		
		// 实现三
		int k = 1;
		do {
			System.out.println(" k = " + k);
			k++;
		} while (k < 100);
	}
	
	// 修改练习(1)，在值为47时用一个 break退出程序。亦可换成 return试试
	@Test
	public void test2() throws Exception {
		// 实现一
		for (int i = 1; i < 100; i++) {
			if (i == 47) {
				break;
			}
			
			System.out.println(" i = " + i);
		}
		
		System.out.println("***************************");
		
		// 实现二
		int j = 1;
		while (j < 100) {
			if (j == 47) {
				break;
			}
			
			System.out.println(" j = " + j);
			j ++;
		}
		
		System.out.println("***************************");
		
		// 实现三
		int k = 1;
		do {
			if (k == 47) {
				return;
			}
			
			System.out.println(" k = " + k);
			k++;
		} while (k < 100);
	}
	
	/*
	 * 创建一个switch 语句，为每一种case 都显示一条消息。并将 switch置入一个 for循环里，令其尝试每一种case。
	 * 在每个case 后面都放置一个break，并对其进行测试。然后，删除break，看看会有什么情况出现。
	 */
	@Test
	public void test3() throws Exception {
		for (int i = 0; i < 3; i++) {
			switch (i) {
				case 0:
					System.out.print("0");
					break;
				case 1:
					System.out.print("1");
					break;
				case 2:
					System.out.print("2");
					break;
				default:
					break;
			}
			System.out.println();
		}
	}

}
