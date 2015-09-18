package com.main;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print Fibonacci series
		int num = 5;
		int[] arr = printFibonacci(num);
		if (arr.length != 0){
			for (int i = 0; i < num; i++)
				System.out.print(arr[i]+" ");
			System.out.println(" ");
		}
		else
			System.out.println("Please specify a positive number!");
		
		int factrl = factorial(num);
		if (factrl != 0){
			System.out.println("The factorial of "+ num + " is: "+ factrl);
		}
		else
			System.out.println("Please specify a positive number!");
		
		
		
	}
	
	public static int[] printFibonacci(int numsToPrint){
		// negative numbers return size 0 array
		int[] fibonacciArr = new int[0];
		
		if (numsToPrint >= 0){
			fibonacciArr = new int[numsToPrint]; 
			int currNum = 1;
			int prevNum = 0;
			int sum = 0;
			
			for (int i = currNum; i<=numsToPrint; i++){
				sum= currNum + prevNum;
				fibonacciArr[i-1]= prevNum;
				prevNum = currNum;
				currNum = sum;
			}
		}
		return fibonacciArr;
	}
	
	public static StringBuilder printPingPong(int num){
		StringBuilder str = new StringBuilder("");
		Boolean result = false;
		if (num%3 == 0)
		{
			str.append("Ping ");
			result = true;
		}
		if (num%5 == 0)
		{
			str.append("Pong");
			result = true;
		}
			
		if (result == false)
			str.append(num);
		
		return str;
			
	}
	
	public static void swapWithoutTemp(int a, int b){
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("'a' is now:"+a);
		System.out.println("'b' is now:" +b);
	}
	
	public static void swap2Nums(int a, int b){
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("'a' is now:"+a);
		System.out.println("'b' is now:" +b);
		
	}

	public static int factorial(int n){
		int factrl = 0;
		if (n >= 0){
			factrl = 1;
			
			while (n > 1){
				factrl = factrl * (n-1);
				n--;
			}
		}
		return factrl;
	}
	
	public static int recurFactorial(int n){
		  if (n == 0) {
	           return 1;
	       } else {
	           return n * recurFactorial(n - 1);
	       }
	}
	
	public static boolean checkPrimeNum(double num){
		boolean prime = false;
		
		if (num == 2)
			prime = true;
		else if(num % 2 == 0)
			prime = false;
		for (double i = 3; i <= Math.sqrt(num); i += 2){
			if (num % i == 0)
				return false;
		}
		return prime;
	}
	
	//armstrong: Eg. 153 = 1^3 + 5^3 + 3^3 where 3 is the number of digits in any given number
	public static boolean armstrongNum(int num){
		boolean armstrong = false;
		
		String str = new Integer(num).toString();
		int length = str.length();
		
		int number = num;
		int sum = 0;
		while (number >0){
			//get the digit in 'ones' place
			sum = (sum + number % 10) ^ length;
			//remove the last digit from number
			number = number / 10;
		}
		if (num > 0 && sum == num)
			armstrong = true;
		return armstrong;
	}
	
	public static void printCmdInput(String str){
		
	}
	
	public static void printPattern(int noOfLines){
		
		for (int i = 1; i <= noOfLines; i++){
			for (int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
