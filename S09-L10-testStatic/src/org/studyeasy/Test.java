package org.studyeasy;

import org.studyeasy.test.TestStatic;

public class Test {

	public static void main(String[] args) {
		
			TestStatic.getX();
			TestStatic.setX(10);;
			System.out.println(TestStatic.getX());
			TestStatic.setX(5);
			System.out.println(TestStatic.getX());
			System.out.println(TestStatic.getX());
			
			System.out.println(TestStatic.getCount());
			System.out.println(TestStatic.getCount());
		
	}

}
