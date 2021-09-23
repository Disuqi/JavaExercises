package com.qa.eunms;

public enum Directions{
    NORTH("Forward", 'N'),
    SOUTH("Backwards", 'S'),
    WEST("Left", 'W'),
    EAST("Right", 'E');


    private final String motion;
    private final char abrev;

    Directions(String motion, char abrev){
        this.motion = motion;
        this.abrev = abrev;
    }

    public String getMotion(){
        return motion;
    }

    public char getAbrev(){
        return abrev;
    }

    public String toString(){
        return abrev + " is the same as moving " + motion;
    }
}