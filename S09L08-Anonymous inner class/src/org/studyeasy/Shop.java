package org.studyeasy;

import org.studyeasy.shop.Door;

public class Shop {

	public static void main(String[] args) {
		Door door=new Door();
		door.getLock().isUnlocked("test");
		System.out.println(door.getLock().isUnlocked(args[0]));
		if(door.getLock().isUnlocked(args[0])) {
			System.out.println("welcome we are open");
		}else {
			System.out.println("we are closed, please visit later");
		}
	}
	
}
