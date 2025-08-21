package com.java.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Collection Framerwork:");
//            Type safe arrayList
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Vinit");
		arrayList.add("Vishal");
		arrayList.add("Kishan");
		arrayList.add("Kishan");
//            arrayList.add(1);  We cannnot add int type if we have created arrayList of String type
		System.out.println(arrayList);
		arrayList.remove(2);
		System.out.println(arrayList);
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.size());
		System.out.println(arrayList.contains("Vishal"));
		System.out.println(arrayList.isEmpty());
		System.out.println(arrayList.set(0, "Vinita"));
		System.out.println(arrayList);
		arrayList.add(0, "Dharmendra Singh");
		System.out.println(arrayList);
//            Untype safe
		LinkedList linkedList = new LinkedList();
		linkedList.add("vinit");
		linkedList.add(100);
		linkedList.add(1.24f);
		linkedList.add(true);
		System.out.println(linkedList);
//           Creatting Vector
		System.out.println("vector:");
		Vector<String> vectorStrings = new Vector<>();
		vectorStrings.addAll(arrayList);
		System.out.println(vectorStrings);
//            Set
//            Duplicate not allowed and order is not preserved
		System.out.println("===========Set================");
		HashSet<Double> nmSet = new HashSet<Double>();
		nmSet.add(1.45);
		nmSet.add(258.246);
		nmSet.add(1.00);
		nmSet.add(1.00);
		System.out.println(nmSet);
//            TreeSet: Do not allow duplicate and sorts data in ascending order
		TreeSet<Integer> intSet = new TreeSet<>();
		intSet.add(5);
		intSet.add(4);
		intSet.add(100);
		intSet.add(5);
		System.out.println(intSet);
//            Traversing through collection object
		System.out.println("Iterating through ArrayList using for each loop:");
		for (String string : arrayList) {
			System.out.print(string);
			StringBuffer stringBuffer  = new StringBuffer(string);
			System.out.println("\t"+stringBuffer.reverse());
			
		}
//		Traversing using Iterator
		System.out.println("Traversing through iterator which will helps in forward traversal");
		Iterator<String> itr = arrayList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
//		ListIterator: This will helps in forward and backward traversal of List because it has functionality of iterator also
		System.out.println("=============List iterator========");
		ListIterator<String> listrIterator =  arrayList.listIterator(arrayList.size());
		while(listrIterator.hasPrevious())
		{
			System.out.println(listrIterator.previous());
		}
//		for each method :java 8
		System.out.println("traversing using for each method");
		arrayList.forEach(e -> System.out.println(e));
		System.out.println("traversing using for each method on set");
		intSet.forEach(e-> System.out.println(e));
		System.out.println("TreeSet implementation");
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.addAll(arrayList);
		treeSet.forEach(e-> System.out.println(e));
		
		System.out.println("Using iterator in treeSet");
		Iterator iterator = treeSet.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		} 
//		ListIterator<String> strListIterator = treeSet.
//		List Iterator cannot be used by Set
		System.out.println("Welcome to HashMap:"); 
		
		HashMap<String,Integer> ashMap = new HashMap<>();
		ashMap.put("Core Java",4000);
		ashMap.put("basic python", 2000);
		ashMap.put("Spring Boot", 8000);
		ashMap.put("Core Java",3500);
		System.out.println(ashMap);
		ashMap.forEach((e1,e2)->System.out.println(e1+"\t"+e2));
		Set<String> strings = ashMap.keySet();
		strings.forEach((e)->System.out.println(ashMap.get(e)));
		System.out.println(strings);
		
		
		
		

	}

}
