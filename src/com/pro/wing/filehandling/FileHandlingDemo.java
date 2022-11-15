package com.pro.wing.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingDemo {
	
	public static void main(String[] args) {
		
		File file = new File("D:/Eclipse/Eclipse Data/File_Handling/src/com/pro/wing/filehandling/abc.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		try
		{
			 fr= new FileReader(file);
			 br= new BufferedReader(fr);
			 
			 String data;
			 while((data =br.readLine())!= null)
			 {
				 System.out.println(data);
				 
			 }
			 
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		}catch(IOException e)
		{
			
			System.out.println("SomeErrorOccured");
			e.printStackTrace();
		}
		finally
		{
			try {
				fr.close();
			} catch (IOException e) {
				System.out.println(" IO Exception ");
				e.printStackTrace();
			}catch (NullPointerException e) {
				System.out.println("NullPointerExpection");
				e.printStackTrace();
			}
		}
		
	}

}
