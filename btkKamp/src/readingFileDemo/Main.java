package readingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader reader  = null;
		int total = 0;

		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\Kubra\\git\\btkAkademiJavaKurs\\btkKamp\\src\\readingFileDemo\\sayilar.txt")); 
			String line = null;
			while((line = reader.readLine()) != null) {
				total += Integer.valueOf(line);
				
			}
			System.out.println("Toplam = " + total);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			reader.close();
		}

	}

}
 