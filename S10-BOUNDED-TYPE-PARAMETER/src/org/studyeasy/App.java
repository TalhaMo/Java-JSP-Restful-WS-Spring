package org.studyeasy;



class Data<K extends Integer,V extends App>{
	private K key;
	private V value;
	
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
	public <E extends Character,N extends Number> void display(E element, N number) {
		System.out.println("element: "+element+" number: "+number);
		
	}
	
	
	
}

public class App {

	public static void main(String[] args) {
		Data<Integer,App> data=new Data<Integer,App>(1,new App());
		data.display('$', 4);
		data.getValue().test();
		System.out.println(data.getKey());
		

	}
	public void test() {
		System.out.println("testing ....");
	}

}
