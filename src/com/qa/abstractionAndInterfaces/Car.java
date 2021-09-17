package com.qa.abstractionAndInterfaces;

public class Car implements Vehicle, Radio {
    
    @Override
    public void move(){
        System.out.println("The engine was turned on and the car quickly started moving forward");
    }
    
    @Override
    public void stop(){
        System.out.println("The driver has hit the breaks and the car stopped");
    }

    @Override
    public void playMusic(){
        System.out.println("The radio is playing music");
    }
}
