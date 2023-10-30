package com.collection.framework;

import java.util.ArrayList;

import java.util.List;
import java.util.Vector;

public class ListDemo {
	public static void main(String[] args) {

		List<String> name = new ArrayList<>(List.of("gaurav", "vaibhav", "abc"));
		System.out.println(name);

		// ArrayList (Integer) -> cl
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(48);
		marks.add(34);
		System.out.println(marks);

		// ArrayList (String) -> class
		ArrayList<String> s = new ArrayList<String>();
		s.add("A");
		s.add("b");
		s.add("c");
		s.add(2, "a");
		System.out.println("The arraylist String is:" + s);

		// Vector <Integer> class
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(4);
		System.out.println("The values of the vector are :" + v);
		v.remove(2);
		System.out.println("The values of the vector after removes are :" + v);

	}
}