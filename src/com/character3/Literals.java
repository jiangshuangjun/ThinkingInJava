package com.character3;

public class Literals {
	/*
	 * 十六进制（Base 16）——它适用于所有整数数据类型——用一个前置的 0x或 0X指示。并在后面跟随采用大写或小写形式的0-9 以及a-f。
	 * 若试图将一个变量初始化成超出自身能力的一个值（无论这个值的数值形式如何），编译器就会向我们报告一条出错消息。
	 * 
	 * 最大的十六进制值只会在char，byte 以及short 身上出现。若超出这一限制，编译器会将值自动变成一个int，并告诉我们需要对这一次赋值进行“缩小造型”。
	 * 
	 * 八进制（Base 8）是用数字中的一个前置0 以及0-7的数位指示的。
	 * 
	 * 字面值后的尾随字符标志着它的类型。若为大写或小写的 L，代表 long；大写或小写的F，代表 float；大写或小写的D，则代表double。
	 */
	
	char c = 0xffff; // max char hex value
	byte b = 0x7f; // max byte hex value
	short s = 0x7fff; // max short hex value
	int i1 = 0x2f; // Hexadecimal (lowercase)
	int i2 = 0X2F; // Hexadecimal (uppercase)
	int i3 = 0177; // Octal (leading zero)
	// Hex and Oct also work with long.
	long n1 = 200L; // long suffix
	long n2 = 200l; // long suffix
	long n3 = 200;
	//! long l6(200); // not allowed
	float f1 = 1;
	float f2 = 1F; // float suffix
	float f3 = 1f; // float suffix
	float f4 = 1e-45f; // 10 to the power
	float f5 = 1e+9f; // float suffix
	double d1 = 1d; // double suffix
	double d2 = 1D; // double suffix
	double d3 = 47e47d; // 10 to the power
}
