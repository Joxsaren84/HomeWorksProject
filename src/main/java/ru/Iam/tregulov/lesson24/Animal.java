package ru.Iam.tregulov.lesson24;

public abstract class Animal {

    String name;

    Animal(String name){
        this.name = name;
    }

    public abstract void eat();
    public abstract void sleep();

}
