package ru.Iam.tregulov.lesson24;

public abstract class Fish extends Animal{

    public String name;

    public Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void sleep(){
        System.out.println("Vsegda interesno nablyudat, kak spyat ribi");
    }

    public abstract void swim();
}
