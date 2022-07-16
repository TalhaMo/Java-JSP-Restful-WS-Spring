package org.studyeasy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class Name implements Comparable<Name>{
	private String name;

	public Name(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Name [name=" + name + "]";
	}

	@Override
	public int compareTo(Name o) {
		return
				getName().compareTo(o.getName());
		
	}
	
	
}

public class App {

	public static void main(String[] args) {
	
		Set<Name> set=new HashSet<>();
		set.add(new Name("med"));
		set.add(new Name("emna"));
		set.add(new Name("kenza"));
		set.add(new Name("samar"));
		set.add(new Name("rania"));
		
		
		List<Name> list=new ArrayList<>();
		list.addAll(set);
		Collections.sort(list);
		for(Name element:list){
			System.out.println(element);
		}
		System.out.println(Collections.binarySearch(list,new Name("med")));
	}
	

}
