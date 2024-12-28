package com.velocity;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

// Use of Collect method

public class StreamAPI2 {
	
	public static void main(String[] args) {

		Set<String> set=new HashSet<String>();
		set.add("ajit");
		set.add("yogesh");
		set.add("shubham");
		set.add("mohit");

		Set<String> s=set.stream().collect(Collectors.toSet());
		System.out.println(s);
	}

}
