package com.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamDemo2 {
	public static void main(String[] args) {
		final List<Integer> list = new ArrayList<>(Arrays.asList(3,4,5,6,6,7,8,8,8,8));
		System.out.print("Descending order");
		list.stream().sorted()
		.forEach(System.out::println);
		System.out.print("Ascending order");
		list.stream().sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
	}
}
