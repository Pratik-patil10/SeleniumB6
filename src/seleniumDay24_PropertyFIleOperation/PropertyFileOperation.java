package seleniumDay24_PropertyFIleOperation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileOperation {

	// See theconfigPropertyiFile => as property file for input file to TC
	/*
	 * Code to Read property* file File file=new File("location of file") Properties
	 * prop=new Properties(); FileInputStream fis=new FileInputStream(file)
	 * 
	 * prop.load(fis); String value = prop.getProperty(key);
	 */

	public static Properties prop;

	public static String readProperty(String key) throws Exception // return type String cz proprty file has all para as
																	// string
	{
		File file = new File("D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\configPropertyiFile.properties"); // create file
																										// object & drop
																										// property
																										// location

		prop = new Properties(); // prope class object

		FileInputStream fis = new FileInputStream(file); // create obj of FileInputstream
		prop.load(fis); // load the file

		String value = prop.getProperty(key);

		return value;
	}

	public static void writeProperty(String key, String Value) // return type String cz proprty file has all para as
																	// string
	{

		File file = new File("D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\configPropertyiFile.properties");
		// create file
		// object & drop
		// property
		// location
		FileOutputStream fos = null;

		try {			
			// create new file in or open existing file from the project's root folder
			fos = new FileOutputStream(file);
			
			
			// set properties
			prop.put(key, Value);

			// store properties to the opened file
			prop.store(fos, "FileUpdated");
		} catch (IOException io) 
		{
			io.printStackTrace();
		} 
		finally 
		{
			try 
			{
				if (fos != null) 
				{
					fos.close();
				}
			} catch (Exception ex) 
				{
				ex.printStackTrace();
				}
		}

	}
	}
