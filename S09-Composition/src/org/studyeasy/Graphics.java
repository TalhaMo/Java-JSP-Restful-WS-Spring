package org.studyeasy;

public class Graphics {

	private String brand;
	private int series;
	private String memory;
	
	public Graphics() {
		this.brand = "Nvidia";
		this.series = 500;
		this.memory = "2 GB";
	}
	public Graphics(String brand, int series, String memory) {
		
		this.brand = brand;
		this.series = series;
		this.memory = memory;
	}
	@Override
	public String toString() {
		return "Graphics [brand=" + brand + ", series=" + series + ", memory=" + memory + "]";
	}
	public String getBrand() {
		return brand;
	}
	public int getSeries() {
		return series;
	}
	public String getMemory() {
		return memory;
	}
	
	
	
	
}
