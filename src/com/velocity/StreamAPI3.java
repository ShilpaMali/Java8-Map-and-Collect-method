package com.velocity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI3 {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "yogesh", 45000));
		list.add(new Employee(102, "ram", 55000));
		list.add(new Employee(103, "shyam", 50000));
		list.add(new Employee(104, "vinit", 65000));
		list.add(new Employee(105, "akash", 35000));
		// System.out.println(list.stream().map(e->e.getEmpName()));
		System.out.println(list.stream().map(e -> e).collect(Collectors.toList()));

	}

}
