package com.qa.eunms;

public class Runner2 {
    public static void main(String[] args){
        Directions[] directionsList = new Directions[4];
        directionsList = Directions.values();
        for(Directions direc : directionsList){
            System.out.println(direc.toString());
        }
    }
}
