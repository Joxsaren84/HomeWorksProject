package ru.Iam.tregulov.lesson24;

public class Lev extends Mammal{

    String name;

    Lev(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat(){
        System.out.println("Lev kak lyuboy xisnik, lubit miaso!");
    }

    @Override
    public void sleep(){
        System.out.println("Bolshuy chast dnia lev spit");
    }

    @Override
    public void run(){
        System.out.println("Lev eto ne samaya bistraya koshka");
    }

}
