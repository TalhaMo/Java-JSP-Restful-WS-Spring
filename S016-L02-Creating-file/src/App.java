import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args)  {

		File file=new File("studyeasy");
		file.mkdir();
		file=new File("studyeasy\\team.txt");
		try 
			(BufferedWriter bw=new BufferedWriter(new FileWriter(file,true))){
			bw.write("med");
			bw.newLine();
			bw.write("kenza");
			bw.newLine();
			bw.write("rania");
			bw.newLine();
			bw.write("habib");
			bw.newLine();
			bw.write("emna");
			System.out.println("writing onto the file completed");
			bw.close();
		} catch (IOException e) {
			System.out.println("error occred, while writing onto the file");
		}
		try {
			BufferedReader br= new BufferedReader(new FileReader("studyeasy\\\\team.txt"));
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
