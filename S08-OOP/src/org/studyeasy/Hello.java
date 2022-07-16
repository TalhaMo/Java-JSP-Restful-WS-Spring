package org.studyeasy;

public class Hello {

	public static void main(String[] args) {
		
		Car car=new Car("closed","on","seated",10);
		/*car.setDoors("closed");
		car.setEngine("on");
		car.setDriver("seated");
		car.setSpeed(0);
		car.run()*/;
		System.out.println(car.run());
	}

}
