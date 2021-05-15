package workingWithFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		//getFileInfo();
		//readFile();
		writeFile();
		readFile();



	}
	public static void createFile() {
		File file = new File("C:\\Users\\Kubra\\eclipse-workspace\\files\\students.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("Dosya oluþturuldu.");
			}else {
				System.out.println("Dosya zaten var.");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void getFileInfo() {
		File file = new File("C:\\Users\\Kubra\\eclipse-workspace\\files\\students.txt");
		if(file.exists()) {
			System.out.println("Dosya Adý : " + file.getName());
			System.out.println("Dosya Yolu : " + file.getAbsolutePath());
			System.out.println("Dosya Yazýlabilir mi ? " + file.canWrite());
			System.out.println("Dosya Okunabilir mi ? : " + file.canRead());
			System.out.println("Dosya Boyutu(byte) : " + file.length());

		}
	}
	public static void readFile() {
		File file = new File("C:\\Users\\Kubra\\eclipse-workspace\\files\\students.txt");
		try {
			Scanner reader = new Scanner(file);
			while(reader.hasNextLine()){
			String line = reader.nextLine();
			System.out.println(line);
		}
			reader.close();
			}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void writeFile() {
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Kubra\\eclipse-workspace\\files\\students.txt",true)); 
			writer.newLine();
			writer.write("Esra");
			System.out.println("Dosyaya yazýldý.");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
