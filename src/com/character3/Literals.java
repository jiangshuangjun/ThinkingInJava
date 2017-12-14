package com.character3;

public class Literals {
	/*
	 * ʮ�����ƣ�Base 16�����������������������������͡�����һ��ǰ�õ� 0x�� 0Xָʾ�����ں��������ô�д��Сд��ʽ��0-9 �Լ�a-f��
	 * ����ͼ��һ��������ʼ���ɳ�������������һ��ֵ���������ֵ����ֵ��ʽ��Σ����������ͻ������Ǳ���һ��������Ϣ��
	 * 
	 * ����ʮ������ֵֻ����char��byte �Լ�short ���ϳ��֡���������һ���ƣ��������Ὣֵ�Զ����һ��int��������������Ҫ����һ�θ�ֵ���С���С���͡���
	 * 
	 * �˽��ƣ�Base 8�����������е�һ��ǰ��0 �Լ�0-7����λָʾ�ġ�
	 * 
	 * ����ֵ���β���ַ���־���������͡���Ϊ��д��Сд�� L������ long����д��Сд��F������ float����д��Сд��D�������double��
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
