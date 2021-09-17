package com.qa.inheritance;

public class Farmer extends Person {
    public String farm;
    public Farmer(String name, int age, String farm){
        super(name, age);
        this.farm = farm;
    }

    public String farm(){
        return this.getName()+" the farmer is farming";
    }
    public String getFarm(){
        return farm;
    }
    public void setFarm(String farm){
        this.farm = farm;
    }
    @Override
    public String sleep(){
        return "The farmer is sleeping";
    }
}
