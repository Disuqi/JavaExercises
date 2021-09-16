package com.qa.allExercises;

public class Person {
    private float height;
    private String name;
    private int shoeSize;
    private String jobTitle;
    private int age;

    public Person(float height, String name, int shoeSize, String jobTitle, int age){
        this.height = height;
        this.name = name;
        this.shoeSize = shoeSize;
        this.jobTitle = jobTitle;
        this.age = age;
    }

    public Person(float height, String name){
        this.name = name;
        this.height = height;
    }

    public String greet(){
        return("Hello, my name is " + name + " and my height is " + height + ".");
    }

    public String shareDetails(){
        if(age != 0 && shoeSize != 0 && jobTitle != null){
            return("I am " + age + " years old, I work as a " + jobTitle +
            " and my shoeSize is " + shoeSize + ", just in case you want to buy me a new pair of shoes!");
        }
        else{
            return("I don't want to share more details");
        }
    }
}
