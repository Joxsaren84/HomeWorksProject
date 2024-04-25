package ru.Iam.tregulov.lesson25;

import ru.Iam.tregulov.lesson24.*;

public class Lesson25 {
    public static void main(String[] args) {

        Animal [] animals = new Animal[] {new Lev("alex"), new Mechenosec("fred"), new Pingvin("pin")};
        Speakable [] arraySpeakable = new Speakable[] {new Pingvin("pin"), new Lev("lev")};

        for (Object a : animals){
            checkObj(a);
        }

        for(Object a : arraySpeakable){
            checkObj(a);
        }

    }

    public static void checkObj(Object a){
        if(a instanceof Animal) {
            System.out.println(((Animal)a).name);
            ((Animal)a).sleep();
            ((Animal)a).eat();
        }

        if(a instanceof Bird){
            System.out.println(((Bird)a).name);
            ((Bird)a).speak();
            ((Bird)a).sleep();
            ((Bird)a).eat();
            ((Bird)a).fly();
        }

        if (a instanceof Fish){
            System.out.println(((Fish)a).name);
            ((Fish)a).swim();
            ((Fish)a).sleep();
            ((Fish)a).eat();
        }

        if(a instanceof Mammal) {
            System.out.println(((Mammal)a).name);
            ((Mammal) a).speak();
            ((Mammal) a).eat();
            ((Mammal) a).run();
            ((Mammal) a).sleep();
        }

        if(a instanceof Speakable){
            ((Speakable)a).speak();
        }

        if(a instanceof Lev){
            System.out.println(((Lev)a).name);
            ((Lev) a).sleep();
            ((Lev) a).eat();
            ((Lev) a).run();
            ((Lev) a).speak();
        }

        if(a instanceof Mechenosec){
            System.out.println(((Mechenosec)a).name);
            ((Mechenosec)a).sleep();
            ((Mechenosec)a).eat();
            ((Mechenosec)a).swim();
        }

        if(a instanceof Pingvin){
            System.out.println(((Pingvin)a).name);
            ((Pingvin)a).eat();
            ((Pingvin)a).fly();
            ((Pingvin)a).speak();
        }
    }

}
