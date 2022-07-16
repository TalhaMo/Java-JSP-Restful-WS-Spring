package org.studyeasy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.TreeMap;


 class  Code implements Comparable<Code> {
	private String sectionNo;
	private String lectureNo;
	
	public Code(String sectionNo, String lectureNo) {
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}

	public String getSectionNo() {
		return sectionNo;
	}

	public String getLectureNo() {
		return lectureNo;
	}

	@Override
	public String toString() {
		return  sectionNo +lectureNo ;
	}

	@Override
	public int compareTo(Code o) {
		String code1=sectionNo.concat(lectureNo);
		String code2=o.getSectionNo()+o.lectureNo;
		return code1.compareTo(code2);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lectureNo, sectionNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Code other = (Code) obj;
		return Objects.equals(lectureNo, other.lectureNo) && Objects.equals(sectionNo, other.sectionNo);
	}
	
	
}

public class App {

	public static void main(String[] args) {
		
				Map<Code, String> lectures=new TreeMap<>();
				lectures.put(new Code("S03","L01"), "one");
				lectures.put(new Code("S02","L01"), "two");
				lectures.put(new Code("S01","L02"), "three");
				lectures.put(new Code("S01","L03"), "one");
				lectures.put(new Code("S01","L04"), "one");
				/*
				  lectures.put(new Code("S01","L01"), "one");
				lectures.put(new Code("S02","L01"), "two");
				lectures.put(new Code("S01","L02"), "three");
				lectures.put(new Code("S01","L03"), "one");
				lectures.put(new Code("S01","L01"), "one");
				for(Map.Entry<Code,String> lecture:lectures.entrySet()) {
					System.out.println("key: "+lecture.getKey()+" value: "+lecture.getValue());
					
				}*/
				
				Iterator<Entry<Code,String>> entry= lectures.entrySet().iterator();
				while(entry.hasNext()) {
					Entry<Code,String> temp=entry.next();
					System.out.println("key: "+temp.getKey()+" value: "+temp.getValue());
				}
				
				Code code1=new Code("L01","S01");
				Code code2=new Code("S01","L01");
				System.out.println(code1.hashCode());
				System.out.println(code2.hashCode());
				System.out.println(lectures.get(code2));
				
				Code code;
				for(Map.Entry<Code, String> lecture:lectures.entrySet()) {
					if(lecture.getValue().equals("two")) {
						code= lecture.getKey();
						System.out.println(code);
					}
				}
	}
	
	

}
