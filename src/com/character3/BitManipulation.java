package com.character3;

import java.util.Random;

public class BitManipulation {

	/*
	 * 左移位运算符（<<）能将运算符左边的运算对象向左移动运算符右侧指定的位数（在低位补 0）
	 * 
	 * “有符号”右移位运算符（>>）则将运算符左边的运算对象向右移动运算符右侧指定的位数
	 * “有符号”右移位运算符使用了“符号扩展”：若值为正，则在高位插入0；若值为负，则在高位插入1
	 * 
	 * Java 也添加了一种“无符号”右移位运算符（>>>），它使用了“零扩展”：无论正负，都在高位插入0。这一运算符是C 或C++没有的
	 * 
	 * 若对char，byte 或者short 进行移位处理，那么在移位进行之前，它们会自动转换成一个int。只有右侧的5个低位才会用到。这样可防止我们在一个 int数里移动不切实际的位数。
	 * 
	 * 若对一个 long 值进行处理，最后得到的结果也是long。此时只会用到右侧的 6个低位，防止移动超过 long 值里现成的位数。
	 * 
	 * 但在进行“无符号”右移位时，也可能遇到一个问题。若对 byte 或short 值进行右移位运算，得到的可能不是正确的结果（Java 1.0 和Java 1.1 特别突出）。
	 * 它们会自动转换成int 类型，并进行右移位。但“零扩展”不会发生，所以在那些情况下会得到-1 的结果。
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
	 * 二进制格式输出一个int值
	 * @param s 输出提示的字符串
	 * @param i 所要输出的int值
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
	 * 二进制格式输出一个long值
	 * @param s 输出提示的字符串
	 * @param l 所要输出的long值
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
