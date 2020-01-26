package com.isi.java.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main 
{
	private static final String path = "myFile.txt";
	
	private static final String classPath = "src/com/isi/java/files/Main.java";
	
	public static void main(String[] args)
	{
		try(PrintWriter out = new PrintWriter(path))
		{
			out.println("Hello, I am writing a line to my file.");
			out.println("Here is another line.");
			out.print("Here is a string.");
			out.print("Here is another string.");
			
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try
		(
//				FileReader fileReader = new FileReader(path);
//				BufferedReader bufferedReader = new BufferedReader(fileReader);				
				BufferedReader reader = new BufferedReader(new FileReader(classPath)))
		
		{
			String line="";
			while ((line = reader.readLine())!=null)
			{
				System.out.println(line);
				Thread.sleep(200);
			}
		}
		
		catch (IOException | InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		catch (FileNotFoundException | IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		
	}

}
