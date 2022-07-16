package org.studyeasy;


import java.util.ArrayList;
import java.util.List;

class Vehicle{
	private int vehicleId;

	public Vehicle(int vehicleId) {
		
		this.vehicleId = vehicleId;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + "]";
	}
	
	public void info() {
		System.out.println("vehicle id is "+getVehicleId());
	}
	
}
class Car extends Vehicle{
	private String carModel;

	public Car(int vehicleId, String carModel) {
		super(vehicleId);
		this.carModel = carModel;
	}

	public String getCarModel() {
		return carModel;
	}

	@Override
	public String toString() {
		return "Car [carModel=" + carModel + "]";
	}
	@Override
	public void info() {
		System.out.println("car model is "+getCarModel());
	}
	
}

public class App {

	public static void main(String[] args) {
		
		List<Vehicle> list=new ArrayList<>();
		list.add(new Vehicle(10));
		list.add(new Vehicle(11));
		list.add(new Vehicle(12));
		list.add(new Vehicle(13));
		list.add(new Car(13,"model"));

		display(list);
		

	}
	public static void display(List<? extends Vehicle> list) {
		for(Vehicle element:list) {
			element.info();
		}
	}

}
