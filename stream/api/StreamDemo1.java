package com.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<> (Arrays.asList(1,2,3,4,4,6,7));
		final List<Integer> l = list.stream()
				.filter(value -> value%2==0)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(l.toArray()));			
				
	}
}
