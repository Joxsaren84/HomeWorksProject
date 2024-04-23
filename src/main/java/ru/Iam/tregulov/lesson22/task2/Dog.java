package ru.Iam.tregulov.lesson22.task2;

public class Dog extends Pet{

    public Dog(String name){
        this.name = name;
        System.out.println("I'm dog and my name is " + this.name + ".");
    }

    public void play(){
        System.out.println("Dog plays.");
    }

}
