package com.collection.framework;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	
	ArrayList <String>list = new ArrayList();
	
	list.add("Gaurav");
	list.add(0,"Vaibhav");
	list.add(2,"Avi");
	list.add("ram");
//	list.toArray();
	
//	System.out.println(list);
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
		}
		System.out.println("Size of Array : "+ list.size());
	
	
	
}
}
