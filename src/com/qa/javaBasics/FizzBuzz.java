package com.qa.javaBasics;

public class FizzBuzz {


	public static String fizzBuzz(int input) {

		String fizzBuzz = Integer.toString(input);

		if (input % 3 == 0) {

			fizzBuzz = "Fizz";
			if (input % 5 == 0) {

				fizzBuzz = "FizzBuzz";
				return fizzBuzz;
			}

		}

		if (input % 5 == 0) {

			fizzBuzz = "Buzz";

		}

		return fizzBuzz;
	}
// ALTERNATIVE SOLUTION
	public static String fizzBuzz2(int number) {
		if (number % 3 == 0) {
			if (number % 5 == 0) {
				return "fizzbuzz";
			} else {
				return "fizz";
			}
		} else if (number % 5 == 0) {
			return "buzz";
		}
		return String.valueOf(number);
	}

}