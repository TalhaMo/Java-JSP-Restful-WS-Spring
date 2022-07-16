package org.studyeasy;

public class Processor {
	
	private String brand;
	private String series;
	private int generation;
	private int noOfCores;
	private int noOfThreads;
	private String cacheMemory;
	private String frequency;
	private String minFrequency;
	private String maxFrequency;
	
	public Processor() {
		
		this.brand = "intel";
		this.series = "7200u";
		this.generation = 7;
		this.noOfCores = 2;
		this.noOfThreads = 4;
		this.cacheMemory = "3MB";
		this.frequency = "2.5Ghz";
		this.minFrequency = "2.5Ghz";
		this.maxFrequency = "3.1Ghz";
	}



	public Processor(String brand, String series, int generation, int noOfCores, int noOfThreads, String cacheMemory,
			String frequency, String minFrequency, String maxFrequency) {
		
		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.noOfCores = noOfCores;
		this.noOfThreads = noOfThreads;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		this.minFrequency = minFrequency;
		this.maxFrequency = maxFrequency;
	}



	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", generation=" + generation + ", noOfCores="
				+ noOfCores + ", noOfThreads=" + noOfThreads + ", cacheMemory=" + cacheMemory + ", frequency="
				+ frequency + ", minFrequency=" + minFrequency + ", maxFrequency=" + maxFrequency + "]";
	}

	public String getBrand() {
		return brand;
	}

	public String getSeries() {
		return series;
	}

	public int getGeneration() {
		return generation;
	}

	public int getNoOfCores() {
		return noOfCores;
	}

	public int getNoOfThreads() {
		return noOfThreads;
	}

	public String getCacheMemory() {
		return cacheMemory;
	}

	public String getFrequency() {
		return frequency;
	}

	public String getMinFrequency() {
		return minFrequency;
	}

	public String getMaxFrequency() {
		return maxFrequency;
	}



	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	
	


}
