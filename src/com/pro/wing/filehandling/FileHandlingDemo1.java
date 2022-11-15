package com.pro.wing.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingDemo1 {
	
	public static void main(String[] args) {
		int line_count=0;
		int word_count=0;
		int char_count=0;
		
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
				 String words[] = data.split(" ");
				 
				  for( String word : words)
				  {
//					  System.out.println(word);
					  word_count++;
					  
					  char_count = char_count+word.length();
				  }
				  line_count++;  
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
				br.close();
			} catch (IOException e) {
				System.out.println(" IO Exception ");
				e.printStackTrace();
			}catch (NullPointerException e) {
				System.out.println("NullPointerExpection");
				e.printStackTrace();
			}
		}
		
		System.out.println(line_count);
		System.out.println(word_count);
		System.out.println(char_count);
		
	}

}
