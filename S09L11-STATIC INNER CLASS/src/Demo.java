import org.studyeasy.Outer;

public class Demo {

	public static void main(String[] args) {
		
		Outer.Inner.testInnerClass();
		int y=Outer.Inner.x;
		System.out.println(y);
		Outer.testMethod();
		
		
	}

}
