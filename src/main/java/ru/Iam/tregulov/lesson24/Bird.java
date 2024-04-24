package ru.Iam.tregulov.lesson24;

public abstract class Bird extends Animal implements Speakable{

    String name;

    Bird(String name) {
        super(name);
        this.name = name;
    }

    public abstract void fly();

    @Override
    public void speak(){
        System.out.println(name + " sings");
    }

}
