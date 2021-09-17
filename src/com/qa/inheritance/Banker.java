package com.qa.inheritance;

public class Banker extends Person{
    private String bank;

    public Banker(String name, int age, String bank){
        super(name, age);
        this.bank = bank;
    }

    public String banking(){
        return "The banker " + this.getName() + " is banking";
    }

    public String getBank(){
        return bank;
    }

    public void setBank(String bank){
        this.bank = bank;
    }

    @Override
    public String sleep(){
        return "The banker is sleeping";
    }
}
