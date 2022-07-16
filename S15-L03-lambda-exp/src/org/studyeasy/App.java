package org.studyeasy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Data{
	private String name;

	public Data(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "name: " + name ;
	}
	
	
}

public class App {

	public static void main(String[] args) {
		
		List<Data> list=new ArrayList<>();
		list.add(new Data("med"));
		list.add(new Data("habib"));
		list.add(new Data("kenza"));
		list.add(new Data("rania"));
		list.add(new Data("samar"));
		list.add(new Data("emna"));
		
		Collections.sort(list,(Data o1, Data o2)->{
			if(o1.getName().length()<o2.getName().length()) {
				return -1;
			}else if(o1.getName().length()>o2.getName().length()) {
				return 1;
			}else {
				return 0;
			}
		});
		
		/*for(Data name:list) {
			System.out.println(name);
		}*/
		list.forEach(temp->{
			System.out.println(temp);
		});

	}

}
