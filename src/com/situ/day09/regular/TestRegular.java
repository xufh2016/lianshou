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
		// String regex = "o\\b";//注意再加一个'\'
		// String regex = "\\bo";//注意再加一个'\'
		String regex = "\\bhello|\\bandroid";// 满足以hello单词开头或以android单词为结尾的规则来截取

		String[] strings = string.split(regex);
		for (String string2 : strings) {
			System.out.println(string2);
		}
	}
}
