package com.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class CollectionsFramework {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ex = new ArrayList<Integer>();
		ex = createNewList(10);
		
		findElement(ex,5);
		printListElements(ex);
		printListInReverse(ex);
		
		//List<Integer> list = new ArrayList<Integer>(Arrays.asList(2,3,5,7,3,8,5,9,2));
		//List<Integer> duplList = findDuplicateElements(list);
		//printListElements(duplList);
		
		/*List<String> list1 = new ArrayList<String> (Arrays.asList("a1","a2","a3","a4"));
		List<String> list2 = new ArrayList<String> (Arrays.asList("b1","b2","b3","b4","b5","b6","b7"));
		
		List<String> newList = mergeListsPattern(list1, list2);
		Iterator<String> it = newList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		Integer[] intArray = arraylistToArray(ex);
		System.out.println(Arrays.toString(intArray));
		
		String filepath = "C:\\Users\\shiba_000\\Documents\\Shibani\\KeyValueData.txt";
		Map<String, String> newHashMap = new HashMap<String, String>();
		newHashMap = readDataCreateMap(filepath);
		
		for (Map.Entry<String, String> entry : newHashMap.entrySet()){
			System.out.println(entry.getKey()+ ":" + entry.getValue());
			}
		String key = "01";
		String value = getValueEntry(newHashMap, key);
		System.out.println("The value for key "+ key+ " is: "+ value);
		
		int count = 1;
		for (Months mon : Months.values()){
			System.out.println(mon);
		}
	}
	
	public static List<Integer> createNewList(int n){
		List<Integer> list = new ArrayList <Integer>(50);
		
		for (int  i = 1; i<=n; i++)
			list.add(i);
		return list;
	}
	
	public static void findElement(List<Integer>l, int num){
		boolean foundElement = false;
		Integer element = (Integer) num;
		if (l.contains(element))
			foundElement = true;
		System.out.println("Element '"+ num+ "'found: "+ foundElement);
	}

	public static  void printListElements(List<Integer>l){
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public static void printListInReverse(List<Integer>l){
		int indx = l.size();
		ListIterator<Integer> listIt = l.listIterator(indx);
		while(listIt.hasPrevious())
			System.out.println(listIt.previous());
	}
	
	public static List<Integer> findDuplicateElements(List<Integer> l){
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> duplicateList = new ArrayList<Integer>();
		
		for(int i : l){
			if (! set.add(i))
				duplicateList.add(i);
		}
		
		return duplicateList;
	}
	
	public static List<String> mergeListsPattern(List<String> list1, List<String> list2){
		List<String> newList = new ArrayList<String>(list1.size()+list2.size());
		ListIterator<String> it1 = list1.listIterator();
		ListIterator<String> it2 = list2.listIterator();
		
		while(it1.hasNext() && it2.hasNext()){
			newList.add(it1.next());
			newList.add(it2.next());
		}
		
		while(it1.hasNext()){
			newList.add(it1.next());
		}
		
		while(it2.hasNext()){
			newList.add(it2.next());
		}
		
		return newList;
	}
	
	public static Map<String, String> readDataCreateMap(String filepath){
		BufferedReader buff = null;
		Map<String, String> newMap = new HashMap<String, String>();
		
		try {
			buff = new BufferedReader(new FileReader(filepath));
			String line = "";
			while((line = buff.readLine())!= null){
				String[] str = line.split(":");
				newMap.put(str[0], str[1]);
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
		finally{
			if (buff != null){
			    try {
			     buff.close();
			     
			    } 
			  catch (IOException e) {
			     e.printStackTrace();
			    }
		}
		}
	
		return newMap;
	}
	
	public static String getValueEntry(Map<String, String> myMap, String key){
		String value = myMap.get(key);
		return value;
	}
	
	public static Integer[] arraylistToArray(List<Integer> arList){
	Integer[] array = arList.toArray(new Integer[arList.size()]);
	return array;
	}
	
	public static enum Months{
		JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
	}
}
