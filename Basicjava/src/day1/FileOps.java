package day1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOps {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		writeToFile();
	    readFromFile();
	}
	private static void readFromFile(){
		try{
			FileReader fr = new FileReader("C:\\shruti\\rao.txt");
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s=br.readLine())!=null){
				System.out.println(s);
			}
			br.close();
			fr.close();
		}catch(FileNotFoundException fnfe){
			System.out.println(fnfe.getMessage());
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
	}
public static void writeToFile() throws IOException{
	String content = "1.Please write something here";
	File file = new File("C:\\shruti\\rao.txt");
	if(!file.exists()){
		file.createNewFile();
	}
	FileWriter fw = new FileWriter(file.getAbsoluteFile());
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write(content);
	content="\n2.Please write something else here";
	bw.newLine();
	bw.write(content);
	content="\n3.Please write something else here";
	bw.newLine();
	bw.write(content);
	bw.close();
	fw.close();
	System.out.println("finished writing to file");
}
}
