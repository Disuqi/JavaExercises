package com.qa.javaBasics;

public class Results {
	private static double physics;
	private static double chemistry;
	private static double biology;
	private static double total;
	private static double percentage;


	public static void method1(double phygrade, double chemgrade, double biograde) {

		physics = phygrade;
		chemistry = chemgrade;
		biology = biograde;

		total = physics + chemistry + biology;

		System.out.println("Your Physics Grade is: " + physics);

		System.out.println("Your Chemistry Grade is: " + chemistry);

		System.out.println("Your Biology Grade is: " + biology);

		System.out.println("Your Total Grade is: " + total);

	}

	public static void method2() {

		percentage = (total * 100) / 450;

		System.out.println("Your Total Percentage is: " + percentage + "%");

	}

}