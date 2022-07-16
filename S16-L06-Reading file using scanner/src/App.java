import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		try {
			Scanner sc=new Scanner(new File("src\\test.txt"));
			String line;
			while(sc.hasNext()) {
				line=sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("file not found "+e);
		}

	}

}
