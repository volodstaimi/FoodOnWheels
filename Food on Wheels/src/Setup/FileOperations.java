package Setup;
import java.io.*;
import java.util.*;
public class FileOperations {
	
 public String readFile(String fileName)
 {	String data="";
	 try {
		FileReader file= new FileReader(fileName);
		Scanner reader= new Scanner(file);
		while (reader.hasNext())
		{data= data+reader.nextLine()+"\n";}
		reader.close();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	
	 return data;
 }
	public boolean writeFile(String fileName, String data)
	{	boolean flg=false;
		try {
			FileWriter writer= new FileWriter(fileName);
			writer.write(data);
			flg=true;
			writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}	
		return flg;
	}
}
