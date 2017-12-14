package com.character3;

import java.util.Random;

public class BitManipulation {

	/*
	 * ����λ�������<<���ܽ��������ߵ�������������ƶ�������Ҳ�ָ����λ�����ڵ�λ�� 0��
	 * 
	 * ���з��š�����λ�������>>�����������ߵ�������������ƶ�������Ҳ�ָ����λ��
	 * ���з��š�����λ�����ʹ���ˡ�������չ������ֵΪ�������ڸ�λ����0����ֵΪ�������ڸ�λ����1
	 * 
	 * Java Ҳ�����һ�֡��޷��š�����λ�������>>>������ʹ���ˡ�����չ�����������������ڸ�λ����0����һ�������C ��C++û�е�
	 * 
	 * ����char��byte ����short ������λ������ô����λ����֮ǰ�����ǻ��Զ�ת����һ��int��ֻ���Ҳ��5����λ�Ż��õ��������ɷ�ֹ������һ�� int�����ƶ�����ʵ�ʵ�λ����
	 * 
	 * ����һ�� long ֵ���д������õ��Ľ��Ҳ��long����ʱֻ���õ��Ҳ�� 6����λ����ֹ�ƶ����� long ֵ���ֳɵ�λ����
	 * 
	 * ���ڽ��С��޷��š�����λʱ��Ҳ��������һ�����⡣���� byte ��short ֵ��������λ���㣬�õ��Ŀ��ܲ�����ȷ�Ľ����Java 1.0 ��Java 1.1 �ر�ͻ������
	 * ���ǻ��Զ�ת����int ���ͣ�����������λ����������չ�����ᷢ������������Щ����»�õ�-1 �Ľ����
	 */
	
	public static void main(String[] args) throws Exception {
		Random rand = new Random();
		int i = rand.nextInt();
		int j = rand.nextInt();
		pBinInt("-1", -1);
		pBinInt("+1", +1);
		pBinInt("~1", ~1);
		int maxpos = 2147483647;
		pBinInt("maxpos", maxpos);
		int maxneg = -2147483648;
		pBinInt("maxneg", maxneg);
		pBinInt("i", i);
		pBinInt("~i", ~i);
		pBinInt("-i", -i);
		pBinInt("j", j);
		pBinInt("i & j", i & j);
		pBinInt("i | j", i | j);
		pBinInt("i ^ j", i ^ j);
		pBinInt("i << 5", i << 5);
		pBinInt("i >> 5", i >> 5);
		pBinInt("(~i) >> 5", (~i) >> 5);
		pBinInt("i >>> 5", i >>> 5);
		pBinInt("(~i) >>> 5", (~i) >>> 5);
		long l = rand.nextLong();
		long m = rand.nextLong();
		pBinLong("-1L", -1L);
		pBinLong("+1L", +1L);
		long ll = 9223372036854775807L;
		pBinLong("maxpos", ll);
		long lln = -9223372036854775808L;
		pBinLong("maxneg", lln);
		pBinLong("l", l);
		pBinLong("~l", ~l);
		pBinLong("-l", -l);
		pBinLong("m", m);
		pBinLong("l & m", l & m);
		pBinLong("l | m", l | m);
		pBinLong("l ^ m", l ^ m);
		pBinLong("l << 5", l << 5);
		pBinLong("l >> 5", l >> 5);
		pBinLong("(~l) >> 5", (~l) >> 5);
		pBinLong("l >>> 5", l >>> 5);
		pBinLong("(~l) >>> 5", (~l) >>> 5);
	}
	
	/**
	 * �����Ƹ�ʽ���һ��intֵ
	 * @param s �����ʾ���ַ���
	 * @param i ��Ҫ�����intֵ
	 */
	static void pBinInt(String s, int i) {
		System.out.println(s + ", int: " + i + ", binary:  ");
		
		for (int j = 31; j >= 0; j--) {
			if (((1 << j) & i) != 0) {
				System.out.print("1");
			} else{
				System.out.print("0");
			}
		}
		
		System.out.println();
	}
	
	/**
	 * �����Ƹ�ʽ���һ��longֵ
	 * @param s �����ʾ���ַ���
	 * @param l ��Ҫ�����longֵ
	 */
	static void pBinLong(String s, long l) {
		System.out.println(s + ", long: " + l + ", binary:  ");
		
		for (int i = 63; i >= 0; i--) {
			if (((1L << i) & l) != 0) {
				System.out.print("1");
			} else {
				System.out.print("0");
			}
		}
		
		System.out.println();
	}
	
}
