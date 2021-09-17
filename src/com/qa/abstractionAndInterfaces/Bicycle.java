package com.qa.abstractionAndInterfaces;

public class Bicycle implements Vehicle, RollerChains {
    @Override
    public void move(){
        System.out.println("The bike is slowly moving forward");
    }
    @Override
    public void stop(){
        System.out.println("The bike has stopped");
    }
    @Override
    public void breakChains(){
        System.out.println("The chains are broken and the bike can no longer move");
    }
}
