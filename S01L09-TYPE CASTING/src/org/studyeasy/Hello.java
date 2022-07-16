package org.studyeasy;

public class Hello {

	public static void main(String[] args) {
		int x=12345;
		int sum=0;
	while(true) {
		sum+=x%10;
		x/=10;
		if(x<10) {
			break;
		}
		
	};
	sum=sum+x;
		
		//System.out.println(x);
		System.out.println(sum);
	
	}
}
