
package com.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String findStr = "Shibani!";
		String filepath = "C:\\Users\\shiba_000\\Documents\\Shibani\\abc.csv";
		int c = strCount(filepath, findStr);
		System.out.println("Number of '"+ findStr +"' "
				+ "in this file: " + c);
		int words = countWordsInFile(filepath);
		System.out.println("Number of words in this file: "+ words);
		
		String newFilepath = "C:\\Users\\shiba_000\\Documents\\Shibani\\newabc.csv";
		copyFileContent(filepath, newFilepath);
		findAndReplace(newFilepath, findStr, "SM");
		
		String path = "C:\\Users\\shiba_000\\Documents\\Shibani";
		filesInFolder(path);
		
	}
	
	 public static int  strCount(String filepath, String str){
		  int count = 0;
		  BufferedReader buff = null;
		  try {
		   buff = new BufferedReader(new FileReader(filepath));
		   String line;
		   while ( (line = buff.readLine()) != null){
			   
			   for (String s : line.split(" ")){
				   if (s.equalsIgnoreCase(str))
					   count++;
			   }
		   }
		   
		  }
		  
		  catch (FileNotFoundException e) {
		   e.printStackTrace();
		  } 
		  catch (IOException e) {
		   e.printStackTrace();
		  }
		  finally {
		   if (buff != null){
		    try {
		     buff.close();
		    } 
		  catch (IOException e) {
		     e.printStackTrace();
		    }
		    
		   }
		}
		return count;
}

public static int countWordsInFile(String filepath){
	 int count = 0;
	 BufferedReader buff = null;
	 try {
		buff = new BufferedReader(new FileReader(filepath));
		String line = "";
		while ((line = buff.readLine())!= null){
			 String[] words = line.split("[\\p{Punct}\\s]+");
			 count = count + words.length;
			}
	 	} 
	 catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	 catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 finally {
		   if (buff != null){
		    try {
		     buff.close();
		    } 
		  catch (IOException e) {
		     e.printStackTrace();
		    }
		   }
		}
		return count;
}

public static void findAndReplace(String newFilepath, String search, String replace){
	BufferedReader buff = null;
	FileWriter fw = null;
	String line= " ";
	String oldTxt = " ";
	
	try {
		buff = new BufferedReader(new FileReader(newFilepath));
		while((line = buff.readLine()) != null){
			oldTxt += line + " ";
			}
		buff.close();
		String newTxt = oldTxt.replaceAll(search, replace);
		
		fw = new FileWriter(newFilepath);
		fw.write(newTxt);
		}
	
	catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	finally {
		   if (buff != null){
		    try {
		     buff.close();
		    } 
		  catch (IOException e) {
		     e.printStackTrace();
		    }
		    }
		   
		 if (fw != null){
			    try {
			     fw.close();
			    } 
		catch (IOException e) {
			     e.printStackTrace();
			    }
			    }
		}
}

public static void filesInFolder(String path){
	
	String files;
	File folder = new File(path);
	File[] listOfFiles = folder.listFiles();
	
	for (int  i =0; i < listOfFiles.length; i++){
		files = listOfFiles[i].getName();
		System.out.println(files);
	}
}

public static void copyFileContent(String filepath, String newFilePath){ 
	FileReader fr = null;
	FileWriter fw = null;
	try {
	    fr = new FileReader(filepath);
	    fw = new FileWriter(newFilePath);
	    int c = fr.read();
	    while(c!=-1) {
	        fw.write(c);
	        c = fr.read();
	    	}
		} 
	catch(IOException e) {
	    e.printStackTrace();
		}
	finally {
		 if (fr != null){
			    try {
			     fr.close();
			    } 
			  catch (IOException e) {
			     e.printStackTrace();
			    }
			    }
		 if (fw != null){
			    try {
			     fw.close();
			    } 
			  catch (IOException e) {
			     e.printStackTrace();
			    }
			    }
		}
	}
	
}
