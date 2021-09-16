package com.qa.allExercises;
import com.qa.encapsulationExercise.*;

public class Runner {
    public static void main(String[] args) {
        //Calculator Exercise
        System.out.println(Calculator.add(5, 6));
		System.out.println(Calculator.sub(20, 11));
		System.out.println(Calculator.mul(5, 6));
		Calculator.div(5, 10);
        //Results Exercise
        Results.method1(50, 60, 60);
        Results.method2();
        //FlowCharts Exercise
        FlowCharts.flowDecision(5, 6, true);
		FlowCharts.flowDecisionProject(50);
        //BlackJack Exericise
        System.out.println(BlackJack.blackJack(25, 5));
        //UniqueSum Exercise
        System.out.println(UniqueSum.uniqueSum(1, 1, 2));
        //FizzBuzz Exercise
        System.out.println(FizzBuzz.fizzBuzz(4));
		System.out.println(FizzBuzz.fizzBuzz(5));
        //Coins
        Coins.change(5.57, 20);
        Coins.change(15.43, 100);
        Coins.change(12.41, 20);
        //Person Exercise
        Person p1 = new Person(6.2f, "John", 10, "Software Developer", 27);
        System.out.println(p1.greet());
        System.out.println(p1.shareDetails());
        Person p2 = new Person(5.8f, "David", 8, "Bus Driver", 32);
        System.out.println(p2.greet());
        System.out.println(p2.shareDetails());
        Person p3 = new Person(5.6f, "Anna");
        System.out.println(p3.greet());
        System.out.println(p3.shareDetails());
        Person p4 = new Person(5.4f, "Karen");
        System.out.println(p4.greet());
        System.out.println(p4.shareDetails());
        //Encapsulation Exercise
        Encapsulation encap = new Encapsulation();
        encap.setStr("Hello");
        encap.setInteger(10);
        encap.setBigInteger(100000);
        encap.setDecimal(2.2f);
        encap.setBigDecimal(3.333333d);
        System.out.println(encap.toString());
    }
    
}
