package com.otherPrgrms;

public class Others {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 7;
		print1to10(num);
		
		GC a = new GC("white");
		a = null;
 
		System.gc();

	}
	
	public static void print1to10(int num){
		if (num > 0){
			System.out.print(num + " ");
			num--;
			print1to10(num);
		}
	}

}
