package ru.Iam.tregulov.lesson24;

public abstract class Mammal extends Animal implements Speakable {

    String name;

    Mammal(String name) {
        super(name);
        this.name = name;
    }

    public abstract void run();
}
