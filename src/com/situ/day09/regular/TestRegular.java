package com.situ.day09.regular;

import org.junit.Test;

public class TestRegular {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// testSplit("asdasd23khkjhj1kj23lkj545kh");
		testSplit("hello world" + " android baby fox sdfj hello");
	}
   @Test
	private static void testSplit(String string) {
		// TODO Auto-generated method stub
		// String regex = "\\d*23";
		// String regex = "o\\b";//ע���ټ�һ��'\'
		// String regex = "\\bo";//ע���ټ�һ��'\'
		String regex = "\\bhello|\\bandroid";// ������hello���ʿ�ͷ����android����Ϊ��β�Ĺ�������ȡ

		String[] strings = string.split(regex);
		for (String string2 : strings) {
			System.out.println(string2);
		}
	}
}
