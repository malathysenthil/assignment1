package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	public Properties readFile(String fileName) {
		FileReader reader;
		Properties prop=new Properties();  
		try {
			reader = new FileReader(fileName);
			prop.load(reader);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return prop;
	}
}
