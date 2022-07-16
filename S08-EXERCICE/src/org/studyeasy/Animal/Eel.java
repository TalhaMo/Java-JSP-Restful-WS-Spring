package org.studyeasy.Animal;

public class Eel extends Fish {

	private String special;

	

	public Eel() {
		super();
		this.special = "Releases electric stock";
	}



	@Override
	public String toString() {
		return "Eel [special=" + special + ", waterBone=" + waterBone + ", gills=" + gills + ", getHeight()="
				+ getHeight() + ", getWeight()=" + getWeight() + ", getType()=" + getType() + ", getBloodType()="
				+ getBloodType() + "]";
	}
	
	public String ShowInfo() {
		return toString();
	}
}

