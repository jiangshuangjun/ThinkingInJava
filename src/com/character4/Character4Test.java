package com.character4;

import org.junit.Test;

public class Character4Test {
	
	// ��Ĭ�Ϲ���������һ���ࣨû���Ա�������������ӡһ����Ϣ����������������һ������
	@Test
	public void test1() throws Exception {
		new TestA();
	}
	
	// ����ϰ 1�Ļ���������һ�����صĹ��������������һ�� String�Ա���������ͬ�Լ�����Ϣ��ӡ����
	@Test
	public void test2() throws Exception {
		new TestA("�˺���");
	}
	
	// ����ϰ 2��������Ϊ�����ϣ������������Ķ�������һ�����飬����Ҫʵ�ʴ������󲢷��䵽��������г���ʱ��ע���Ƿ��ӡ�����Թ��������õĳ�ʼ����Ϣ
	@Test
	public void test3() throws Exception {
		TestA[] a = new TestA[]{};
	}
	
	// ����ͬ���������ϵ�����Ķ������������ϰ3��
	@Test
	public void test4() throws Exception {
		TestA[] a = new TestA[]{new TestA(), new TestA("�˺���")};
	}
	
	/* ���Ա�����before������after���͡�none�����г������� Garbage.java���ظ�����������۲��Ƿ�
	 * ������п�����һЩ�̶���ģʽ���ı���룬ʹSystem.runFinalization()��System.gc()֮ǰ���ã��ٹ�
	 * ������
	*/
	@Test
	public void test5() throws Exception {
		System.out.println("�������Garbage.java��");
	}

}
