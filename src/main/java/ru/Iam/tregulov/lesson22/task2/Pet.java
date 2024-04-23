package ru.Iam.tregulov.lesson22.task2;

public class Pet extends Animal{

    String name;
    public int tail = 1;
    public int pow = 4;

    public Pet(){
        System.out.println("I'm pet.");
        eyes = 2;
    }

    public void run(){
        System.out.println("Pet runs.");
    }

    public void jump(){
        System.out.println("Pet jumps.");
    }

}
