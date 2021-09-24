package com.qa.streamsAndLambdas;
import java.util.*;
import java.util.stream.Collectors;
public class Ex123{
    
    public static void main(String[] args){

        ex3(Arrays.asList(2, 4, 10, 3, 5, 3, 7));

    }

    public static void ex1(){
        List<String> nameList = Arrays.asList("Micheal", "Dean", "James" ,"Chris");   
        nameList.stream().forEach(x -> {if(x != "James") System.out.println("hello " + x); else System.out.println(x);});
    }   
    public static void ex2(){
        List<Integer> intList = Arrays.asList(3,4, 7, 8, 12);
        Integer result = intList.stream().reduce((a, b) -> a * b).get();
        System.out.println(result);
    }
    public static void ex3(List<Integer> list){
        int max = list.stream().max(Integer::compare).get();
        int min = list.stream().min(Integer::compare).get();
        System.out.println(String.format("Max: %d \nMin: %d \nNo odds:", max, min));
        list.stream().filter(x -> x%2 == 0).forEach( x -> System.out.println(x));
        System.out.println("No evens:");
        list.stream().filter(x -> x%2 != 0).forEach( x -> System.out.println(x));
        System.out.println("Sum: " + list.stream().reduce((a, b) -> a+b).get());
        System.out.println(list.stream().map(x -> x*x).filter(x -> x%2 != 0).min(Integer::compare).get());
    }
}
