
public class Demo {

	public static void main(String[] args) {
		
		System.out.println(numPrime(9));


	/*	int a=4;
		int temp;
		boolean isPrime=true;
		for(int i=2;i<=a/2;i++) {
			temp=a%i;
			if(temp==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("number is prime");
		}else {
			System.out.println("number is not prime");
		}*/
	}
	
	public static boolean numPrime(int a) {
		boolean isPrime=true;
		for(int i=2;i<=a/2;i++) {
			
			if(a%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}

}
