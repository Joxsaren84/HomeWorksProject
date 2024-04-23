package ru.Iam.tregulov.lesson22.task2;

public class Cat extends Pet{

    public Cat(String name){
        this.name = name;
        System.out.println("I'm cat and my name is " + this.name + ".");
    }

    public void sleep(){
        System.out.println("Cat sleeps.");
    }
}
