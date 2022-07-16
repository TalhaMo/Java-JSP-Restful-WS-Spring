package org.studyeasy.Animal;

public class Fish extends Animal{
	
	protected boolean waterBone=true;
	protected boolean gills=true;

	public Fish() {
		
		super(10 ,10 ,"fish","fish");
		this.waterBone= true;
		this.gills= true;
	}


	
	
	@Override
	public String toString() {
		return "Fish [waterBone=" + waterBone + ", gills=" + gills + ", getHeight()=" + getHeight() + ", getWeight()="
				+ getWeight() + ", getType()=" + getType() + ", getBloodType()=" + getBloodType() + "]";
	}




	public String ShowInfo() {
		return toString();
	}

}
