package com.qa.ExampleJUnit;

public class Calculator {

	static int num1 = 7;
	static int num2 = 5;

	public static int calculateAdd(int num1, int num2) {
		int product = num1 + num2;
		System.out.println(product);
		return product;
	};

	public static int calculateMult(int num1, int num2) {
		int product = num1 * num2;
		System.out.println(product);
		return product;
	};

	public static int calculateSubt(int num1, int num2) {
		int product = num1 - num2;
		System.out.println(product);
		return product;
	};

	public static double calculateDiv(double num1, double num2) {
		double product = num1 / num2;
		System.out.println(product);
		return product;
	};
}