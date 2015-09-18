package com.main;

import java.util.Stack;

public class StringComputations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Add digits to end of each word";
		System.out.println(str);
		String digitStr = appendDigits(str);
		System.out.println(digitStr);
		
		
		String strng = reverseString("Apple");
		System.out.println(strng);
		String revWords = reverseWords(str);
		System.out.println(revWords);
		
		String parentheses = "{[()]}";
		if(isBalanced(parentheses))
            System.out.println(parentheses + " is balanced");
        else
            System.out.println(parentheses+ " is not balanced");

	}
	
	public static String reverseString(String str){
		int len = str.length();
		char temp = ' ';
		char [] revArr = str.toCharArray();
		for (int i=0, j = len-1; i < len/2; i++, j--){
			temp = revArr[i];
			revArr[i] = revArr[j];
			revArr[j] = temp;
		}
		String revString = new String(revArr);
		return revString;
	}
	
	public static String replaceSubString(String str, String subStr, String replace){
		String newStr = " ";
		if (str.contains(subStr)){
			newStr = str.replace(subStr, replace);
		}
		else
			newStr = "Sub string not found!";
		return newStr;
	}
	
	public static String appendDigits(String str){
		String[] strArray = str.split("\\s+");
		int len = strArray.length;
		for (int  i =0; i < len; i++){
			int digit = i+1;
			strArray[i] = strArray[i].concat(String.valueOf(digit));
		}
		StringBuilder builder = new StringBuilder();
		for (String s : strArray){
			builder.append(s);
			builder.append(" ");
		}
		return builder.toString();
	}
	
	public static String reverseWords(String str){
		String[] strArray = str.split("\\s+");
		int len = str.length();
		
		for (int i = 0; i < len; i++){
			strArray[i] = reverseString(strArray[i]);
		}
		
		StringBuilder builder = new StringBuilder();
		for (String s : strArray){
			builder.append(s);
			builder.append(" ");
			System.out.println(s);
		}
		return builder.toString();
	}
	
	public static boolean checkIfPalindrome(String str){
		int len =str.length();
		boolean check = false;
		for (int i =0, j =len-1; i <len/2; i++, j--){
			if (str.charAt(i) == str.charAt(j))
				check = true;
			else{
				check = false;
				break;}
		}
		return check;
	}

	public static boolean isBalanced(String in){
		 Stack<Character> st = new Stack<Character>();

	        for(char chr : in.toCharArray())
	        {
	            switch(chr) {

	                case '{':
	                case '(':
	                case '[':
	                    st.push(chr);
	                    break;

	                case ']':
	                    if(st.isEmpty() || st.pop() != '[') 
	                        return false;
	                    break;
	                case ')':
	                    if(st.isEmpty() || st.pop() != '(')
	                        return false;
	                    break;
	                case '}':
	                    if(st.isEmpty() || st.pop() != '{')
	                        return false;
	                    break;
	            }
	        }
	        return st.isEmpty();
	    }
}
