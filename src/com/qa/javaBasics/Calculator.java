package com.qa.javaBasics;

public class Calculator {

	public static double result;

	public static double add(double firstNumber, double secondNumber) {

		result = firstNumber + secondNumber;

		return result;
	}

	public static double sub(double firstNumber, double secondNumber) {

		result = firstNumber - secondNumber;

		return result;
	}

	public static double mul(double firstNumber, double secondNumber) {

		result = firstNumber * secondNumber;
		return result;
	}

	public static void div(double num1, double num2) {

		if (num1 < num2) {

			double result = num1 / num2;
			System.out.println(result);

		} else {

			System.out.println("The operation cannot be performed. The first number must be smaller than the second.");

		}

	}
}
    

