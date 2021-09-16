package com.qa.encapsulationExercise;

public class Encapsulation {
    private String str;
    private int integer;
    private long bigInteger;    
    private float decimal;
    private double bigDecimal;

    public Encapsulation(){}
    public Encapsulation(String str, int integer, long bigInteger, float decimal, double bigDecimal){
        this.str = str;
        this.integer = integer;
        this.bigInteger = bigInteger;
        this.decimal = decimal;
        this.bigDecimal = bigDecimal;
    }
    public String getStr(){
        return str;
    }
    public void setStr(String str){
        this.str = str;
    }
    public int getInteger(){
        return integer;
    }
    public void setInteger(int integer){
        this.integer = integer;
    }
    public long getBigInteger(){
        return bigInteger;
    }
    public void setBigInteger(long bigInteger){
        this.bigInteger = bigInteger;
    }
    public float getDecimal(){
        return decimal;
    }
    public void setDecimal(float decimal){
        this.decimal = decimal;
    }
    public double getBigDeciaml(){
        return bigDecimal;
    }
    public void setBigDecimal(double bigDecimal){
        this.bigDecimal = bigDecimal;
    }
    public String toString(){
        return str + " " + integer + " " + bigInteger + " " + decimal + " " + bigDecimal;
    }

}
