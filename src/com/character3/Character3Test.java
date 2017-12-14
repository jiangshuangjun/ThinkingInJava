package com.character3;

import org.junit.Test;

public class Character3Test {
	
	// ��ӡ��1��100֮�������
	@Test
	public void test1() throws Exception {
		// ʵ��һ
		for (int i = 1; i < 100; i++) {
			System.out.println(" i = " + i);
		}
		
		System.out.println("***************************");
		
		// ʵ�ֶ�
		int j = 1;
		while (j < 100) {
			System.out.println(" j = " + j);
			j ++;
		}
		
		System.out.println("***************************");
		
		// ʵ����
		int k = 1;
		do {
			System.out.println(" k = " + k);
			k++;
		} while (k < 100);
	}
	
	// �޸���ϰ(1)����ֵΪ47ʱ��һ�� break�˳�������ɻ��� return����
	@Test
	public void test2() throws Exception {
		// ʵ��һ
		for (int i = 1; i < 100; i++) {
			if (i == 47) {
				break;
			}
			
			System.out.println(" i = " + i);
		}
		
		System.out.println("***************************");
		
		// ʵ�ֶ�
		int j = 1;
		while (j < 100) {
			if (j == 47) {
				break;
			}
			
			System.out.println(" j = " + j);
			j ++;
		}
		
		System.out.println("***************************");
		
		// ʵ����
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
	 * ����һ��switch ��䣬Ϊÿһ��case ����ʾһ����Ϣ������ switch����һ�� forѭ������䳢��ÿһ��case��
	 * ��ÿ��case ���涼����һ��break����������в��ԡ�Ȼ��ɾ��break����������ʲô������֡�
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
