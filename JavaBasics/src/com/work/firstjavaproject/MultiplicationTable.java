package com.work.firstjavaproject;

public class MultiplicationTable {

	void printMultiplicationTable() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d X %d = %d", 5, i, 5 * i).println();

		}
	}

	void printMultiplicationTable(int table) {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d X %d = %d", table, i, table * i).println();
		}
	}

	void printMultiplicationTable(int table, int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.printf("%d X %d = %d", table, i, table * i).println();

		}
	}

}
