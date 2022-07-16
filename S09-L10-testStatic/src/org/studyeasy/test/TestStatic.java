package org.studyeasy.test;

public class TestStatic {

	private static int x;
	
	
	public static int getCount() {
		return x++;
	}
	public static int getX() {
		return x;
	}

	public static void setX(int x) {
		TestStatic.x = x;
	}
	
	
}
