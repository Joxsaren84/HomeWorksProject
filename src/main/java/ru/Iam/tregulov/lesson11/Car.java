package ru.Iam.tregulov.lesson11;

public class Car {

    String color;
    String engine;
    int numberOfDoors;

    public Car(String color, String engine, int numberOfDoors) {
        this.color = color;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }

    public void showInfo(){
        System.out.println("Color: " + color + " engine: " + engine + " number of doors: " + numberOfDoors);
    }
}
