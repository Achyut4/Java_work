package com.work.firstjavaproject;

public class MultiplicationTable {

	void printMultiplicationTable() {
		printMultiplicationTable(5);
	}

	void printMultiplicationTable(int table) {
		printMultiplicationTable(table, 1, 10);
	}

	void printMultiplicationTable(int table, int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.printf("%d X %d = %d", table, i, table * i).println();

		}
	}

}
