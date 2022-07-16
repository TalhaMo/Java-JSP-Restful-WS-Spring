package org.studyeasy;

import org.studyeasy.vehicles.Bike;

public class Demo {

	public static void main(String[] args) {
		
		Bike bike = new Bike("logn", "diesel", 4, 4, 40, "LED");
		bike.run();
		//System.out.println(bike.getFuelTank());
		//System.out.println(bike);
		

	}

}
