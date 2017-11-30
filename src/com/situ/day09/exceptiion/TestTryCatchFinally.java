package com.situ.day09.exceptiion;

import org.junit.Test;

public class TestTryCatchFinally {
	// try-catch �����return "try" ��return "catch"�����滻��return
	// "finally"�ˡ�finally���return �Ḳ��try-catch ���е�return��
	@SuppressWarnings("finally")
	public String tryCatchFinally() {
		try {
			return "try";
		} catch (Exception e) {
			// TODO: handle exception
			return "catch";
		} finally {
			return "finally";
		}
	}

	@Test
	public void testTry() {
		System.out.println(tryCatchFinally());
	}

}
