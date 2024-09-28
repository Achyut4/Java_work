package com.work.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	private BigDecimal principal;
	private BigDecimal interest;
	private BigDecimal years;

	public SimpleInterestCalculator(String principal, String interest) {

		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));

		// TODO Auto-generated constructor stub
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		// TODO Auto-generated method stub
		BigDecimal noOfYearsBigDacimal = new BigDecimal(noOfYears);

		return principal.add(principal.multiply(interest).multiply(noOfYearsBigDacimal));
	}

}
