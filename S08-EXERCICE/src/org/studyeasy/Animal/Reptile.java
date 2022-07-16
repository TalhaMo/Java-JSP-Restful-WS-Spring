package org.studyeasy.Animal;

public class Reptile extends Animal {
	
	private String drySkin;
	private String backbone;
	private String eggs;
	
	public Reptile() {
		super();
		this.drySkin = "drySkin";
		this.backbone = "backbone";
		this.eggs = "eggs";
	}

	public Reptile(String drySkin, String backbone, String eggs,float height, float weight, String type, String bloodType) {
		super(height, weight, type, bloodType);
		this.drySkin = drySkin;
		this.backbone = backbone;
		this.eggs = eggs;
	}

	public String getDrySkin() {
		return drySkin;
	}

	public String getBackbone() {
		return backbone;
	}

	public String getEggs() {
		return eggs;
	}

	@Override
	public String toString() {
		return "Reptile [getDrySkin()=" + getDrySkin() + ", getBackbone()=" + getBackbone() + ", getEggs()=" + getEggs()
				+ ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getType()=" + getType()
				+ ", getBloodType()=" + getBloodType() + "]";
	}

	
	public String ShowInfo() {
		return toString();
		
	}

}
