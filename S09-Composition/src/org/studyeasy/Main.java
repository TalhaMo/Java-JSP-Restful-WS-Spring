package org.studyeasy;

public class Main {

	public static void main(String[] args) {
	
		//Laptop lappy =new Laptop();
		//System.out.println(lappy.getGraphics().getBrand());
		Processor processor =new Processor("intel","7200u",7,4,4,"6MB","2.5Ghz","2.5Ghz","3.1Ghz");
		Graphics graphicsCard=new Graphics("nvidia",1050,"4GB");
		Laptop gamingLaptop=new Laptop(17f, processor, "DDR4", "2TB", graphicsCard, null, "backlit");
		System.out.println(gamingLaptop);
		gamingLaptop.gamingMode();
		System.out.println(gamingLaptop.getProcessor().getFrequency());
	}

}
