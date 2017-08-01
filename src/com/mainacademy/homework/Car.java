package com.mainacademy.homework;

/**
 * Created by user on 01.08.2017.
 */
public class Car {
    private int speed;
    public int wheelsnumber;
    public int doorsnumber;
    private static int numOfCars;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed (int speed){
        this.speed = speed;
    }

    public Car (int speed){
        this.speed = speed;
        numOfCars++;
    }
    public int getNumOfCars (){
        return numOfCars;
    }





}


