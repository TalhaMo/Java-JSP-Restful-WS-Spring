package org.studyeasy;

public class Car {

	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public Car() {
		this.doors="open";
		this.engine="off";
		this.driver="absent";
		this.speed=0;
		
	}
	
	
	public Car(String doors, String engine, String driver, int speed) {
		
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}



	public String getDoors() {
		return doors;
	}
	


	public String getEngine() {
		return engine;
	}

	
	public String getDriver() {
		return driver;
	}

	

	public int getSpeed() {
		return speed;
	}


	public String run() {
		if(doors.equals("closed")&&engine.equals("on")&&driver.equals("seated")&&speed>0) {
			return "running";
		}else return "not running";
	}
	
}
