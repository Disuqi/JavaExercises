package com.qa.abstractionAndInterfaces;

public class Van implements Vehicle, Radio {
    @Override
    public void move(){
        System.out.println("The van started moving at an average speed");
    }
    @Override
    public void stop(){
        System.out.println("The van took a while to stop");
    }
    
    @Override
    public void playMusic(){
        System.out.println("The radio is not working");
    }

}
