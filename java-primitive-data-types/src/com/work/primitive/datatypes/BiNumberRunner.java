package com.work.primitive.datatypes;

public class BiNumberRunner {

	public static void main(String args[]) {

		BiNumber numbers = new BiNumber(34, 67);
		System.out.println(numbers.add());
		System.out.println(numbers.multiply());
		numbers.DoubleValue();
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());
	}

}
