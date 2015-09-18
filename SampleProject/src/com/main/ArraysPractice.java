package com.main;

import java.util.Arrays;

public class ArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numberSeries = {1,2,3,4,5,6,8};
		int missingNumber = missingNum(numberSeries);
		System.out.println("The missing number is: "+ missingNumber);
		
		int[] arr= {3,2,4,1,8};
		int[] sortedArray = sortArray(arr);
		System.out.println(Arrays.toString(sortedArray));	
		
		int[] arr1 = {1,2,5,6,8,4,9};
		int[] swapArray = swap2elements(arr1);
		System.out.println(Arrays.toString(swapArray));
	}
	
	public static int largest(int[] arr){
		int max = arr[0];
		for (int i =1; i<arr.length; i++){
			if (arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
	
	public static boolean linearsearch(int[] arr, int searchkey){
		boolean ret = false;
		for (int x:arr){
			if ( x == searchkey){
				ret = true;
				break;
			}
				
		}
		return ret;
	}
	
	//using just loops and not sets
	public static int[] commonNum(int[] arr1, int[] arr2){
		int len1 = arr1.length;
		int len2 = arr2.length;
		int index = 0;
		int [] arrCommons = new int [len1];
		for (int i = 0; i < len1; i++){
			for (int j = 0; j < len2; j++){
				if (arr1[i] == arr2[j]){
					arrCommons[index] = arr1[i];
					index++;
				}
			}
		}
		return arrCommons;
	}
	
	//assuming only 1 number is missing
	public static int missingNum(int[] arr){
		int missingNumber = 0;
		for (int i = 0; i < arr.length-1; i++){
			if (arr[i+1]!= arr[i]+1){
				missingNumber = arr[i] + 1;
				return missingNumber;
			}
		}
		return missingNumber;
	}
		
	public static int[] sortArray(int[] array){
		
		for (int i = 0; i<array.length; i++){
			int min = array[i];
			for (int j = i+1; j<array.length; j++){
				if(array[j] < min){
					min = array[j];
					array[j]= array[i];
					array[i] = min;
				}
			}
		}
		return array;
		}
	
	//sorts the 1 number that is not in order. For eg.{1,2,5,6,4} ->inserts 4 between 2 & 5 
	public static int[] swap2elements(int[] arr){
		int nxtIndex = 0;
		int currIndex = 0;
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++){
			if(arr[i+1] != arr[i]+1){
				nxtIndex = i+1;
				currIndex = i;
				break;
			}
		}
		for (int j = nxtIndex +1; j < arr.length; j++){
			if (arr[j] > arr[currIndex] && arr[j] < arr[nxtIndex]){
				temp = arr[j];
				for(int k = j; k > nxtIndex; k--){
					arr[k] = arr[k-1];
				}
				arr[nxtIndex] = temp;
				break;
			}
		}
		return arr;
	}
	
	//merging 2 sorted arrays into 1 sorted array
	public static int[] merge2arrays(int[] arr1, int[]arr2){
		int[] mergedArray = new int[arr1.length + arr2.length];
		int i = 0; int j = 0; int k = 0;
		
		while(i < arr1.length && j < arr2.length){
			if(arr1[i] < arr2[j]){
				mergedArray[k] = arr1[i];
				i++;
			}
			else{
				mergedArray[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		while(i < arr1.length){
			mergedArray[k] = arr1[i];
			i++;
			k++;
		}
		
		while(j < arr2.length){
			mergedArray[k] = arr2[j];
			j++;
			k++;
		}
		return mergedArray;
	}
}
