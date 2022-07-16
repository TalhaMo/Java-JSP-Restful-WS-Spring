package org.studyeasy;

import org.studyeasy.Animal.Animal;
import org.studyeasy.Animal.Eel;
import org.studyeasy.Animal.Fish;
import org.studyeasy.Animal.Reptile;

public class Main {

	public static void main(String[] args) {
		Reptile reptile=new Reptile();
		
		System.out.println(reptile);
		Eel animal =new Eel();
		
		System.out.println(animal.ShowInfo());
	}

}
