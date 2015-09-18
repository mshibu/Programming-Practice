
package com.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HandleExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 11;
		int b = 0;
		
		try{
			divide2Nums(a,b);
			}
			catch (ArithmeticException e){
				System.out.println("arithmetic error!");
			}
		
		String findStr = "Shibani!";
		String filepath = "C:\\Users\\shiba_000\\Documents\\Shibani\\abcd.csv";// Invalid file 
		int c = strCount(filepath, findStr);
		
	}
	
	public static void divide2Nums(int a, int b) throws ArithmeticException{
		
			double quotient = a/b;
			System.out.println(quotient);
	
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
		   System.out.println("Invalid file name!");
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

}
