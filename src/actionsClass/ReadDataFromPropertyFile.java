package actionsClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException 
	{
		
		
		//1. create object of Properties
		
		Properties prop= new Properties();
		
		//2. create object of FileInPutStream
		
		FileInputStream myFile= new FileInputStream("D:\\Yogendra\\Feb18_Batch_Selenium\\myProperty.properties");
		
		//load property file
		
		prop.load(myFile);
		
		//get The property by calling key
		
		System.out.println(prop.get("url"));
		
		System.out.println(prop.get("mobNum"));
		
	}

}
