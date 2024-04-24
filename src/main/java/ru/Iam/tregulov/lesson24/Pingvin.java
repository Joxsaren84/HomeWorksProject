package ru.Iam.tregulov.lesson24;

public class Pingvin extends Bird{

    String name;

    Pingvin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat(){
        System.out.println("Pingvin lubit est ribu");
    }

    @Override
    public void sleep(){
        System.out.println("Pingvini spiat prizhavhis drug k drugu");
    }

    @Override
    public void fly(){
        System.out.println("Pingvini ne ymeut letat");
    }

    @Override
    public void speak(){
        System.out.println("Pingvini ne poyut kak solovyi");
    }
}
