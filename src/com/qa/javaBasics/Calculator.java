package com.qa.javaBasics;

public class Calculator implements MathsChallenge {

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

	@Override
	public int sumOfDivisors(int input){
		int result = 0;
		for(int i = 1; i <= input; i++){
			if(input%i == 0){
				result += i;
			}
		}
		return  result;
	}
}
    

