package org.studyeasy;

public class Laptop {

	private float screen;
	private Processor processor;
	private String ram;
	private String drive;
	private Graphics graphics;
	private String opticalDrive;
	private String keyboard;
	
	public Laptop() {
		this.screen = 15.6f;
		this.processor = new Processor();
		this.ram = "DDR4";
		this.drive = "2TB";
		this.graphics = new Graphics();
		this.opticalDrive = "MLT Layer";
		this.keyboard = "backlit";
	}

	public Laptop(float screen, Processor processor, String ram, String drive, Graphics graphics, String opticalDrive,
			String keyboard) {
		
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.drive = drive;
		this.graphics = graphics;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}

	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", drive=" + drive
				+ ", graphics=" + graphics + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
	}

	public Processor getProcessor() {
		return processor;
	}

	public float getScreen() {
		return screen;
	}

	public String getRam() {
		return ram;
	}

	public String getDrive() {
		return drive;
	}

	public Graphics getGraphics() {
		return graphics;
	}

	public String getOpticalDrive() {
		return opticalDrive;
	}

	public String getKeyboard() {
		return keyboard;
	}
	
	public String gamingMode() {
		processor.setFrequency(processor.getMaxFrequency());
		return "Success";
	}
	
	
	
}
