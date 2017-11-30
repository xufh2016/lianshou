package com.situ.day09.exceptiion;

import org.junit.Test;

public class TestTryCatchFinally {
	// try-catch 块里的return "try" 、return "catch"都被替换成return
	// "finally"了。finally里的return 会覆盖try-catch 块中的return。
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
