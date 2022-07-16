import java.util.function.IntPredicate;

public class App {

	public static void main(String[] args) {
		
	IntPredicate lessThan18=value->value<18;
	IntPredicate moreThan10=value->value>10;
	//System.out.println(moreThan10.and(lessThan18).test(20));
	
	new App().demo(11, lessThan18, moreThan10);
		
	}
	public void demo(int x, IntPredicate lessThan18,IntPredicate moreThan10) {
		if(moreThan10.and(lessThan18).test(x)) {
			System.out.println("the input is valid");
		}else {
			System.out.println("invalid input");
		}
}
}
