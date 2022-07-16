package org.studyeasy.Animal;

public class Animal {
	private float height;
	private float weight;
	private String type;
	private String bloodType;
	
	
	public Animal() {
		this.height = 10;
		this.weight = 10;
		this.type = "type";
		this.bloodType = "bloodType";
	}


	public Animal(float height, float weight, String type, String bloodType) {
		
		this.height = height;
		this.weight = weight;
		this.type = type;
		this.bloodType = bloodType;
	}


	public float getHeight() {
		return height;
	}


	public float getWeight() {
		return weight;
	}


	public String getType() {
		return type;
	}


	public String getBloodType() {
		return bloodType;
	}


	
	public String ShowInfo() {
		return "Animal [getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getType()=" + getType()
				+ ", getBloodType()=" + getBloodType() + "]";
	}
	
	
	

}
