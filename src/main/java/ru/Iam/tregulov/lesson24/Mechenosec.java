package ru.Iam.tregulov.lesson24;

public class Mechenosec extends Fish{

    String name;

    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void swim(){
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet");
    }

    @Override
    public void eat(){
        System.out.println("Mechenosic ne xishnaya riba, I ona est obichniy ribiy korm!");
    }

}
