package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("Gaurav", "Vaibhav", "Avi");
		List<String> filternames = names.stream()
				.filter(name -> name.startsWith("G"))
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(filternames);
	}

}
