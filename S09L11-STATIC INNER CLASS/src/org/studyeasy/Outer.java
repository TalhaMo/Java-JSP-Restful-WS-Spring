package org.studyeasy;

public class Outer {
	private static int testVar=5;
	
	public static void testMethod() {
		System.out.println("test inner class var "+Inner.x);
	};
	
public static class Inner{
	public static int x=0;
	public static void testInnerClass() {
		System.out.println("test inner class method");
		System.out.println("test var : "+ testVar);
		testMethod();
	}
	
}
}