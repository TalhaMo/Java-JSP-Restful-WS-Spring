package org.studyeasy;

import org.studyeasy.phone.OnePlus5;
import org.studyeasy.phone.Phone;

public class Hello {

	public static void main(String[] args) {

		Phone phone = new OnePlus5();
		String processor=phone.processor();
		System.out.println("processor:"+processor);
	}

}
