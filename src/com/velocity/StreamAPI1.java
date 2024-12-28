package com.velocity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI1 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("ajit");
		list.add("yogesh");
		list.add("shubham");
		list.add("mohit");

		List<String> l = list.stream().collect(Collectors.toList());
		System.out.println(l);
	}

}
