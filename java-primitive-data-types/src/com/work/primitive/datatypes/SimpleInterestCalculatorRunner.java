package com.work.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");
		BigDecimal totalSum = calculator.calculateTotalValue(5);
		System.out.println(totalSum);

	}

}
