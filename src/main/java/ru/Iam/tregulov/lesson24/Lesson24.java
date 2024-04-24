package ru.Iam.tregulov.lesson24;

public class Lesson24 {
    public static void main(String[] args) {

        Mechenosec mechenosec = new Mechenosec("Fredy");
        System.out.println(mechenosec.name);
        mechenosec.eat();
        mechenosec.swim();
        mechenosec.sleep();

        Speakable speakable = new Pingvin("Kavalsky");
        speakable.speak();

        Animal animal = new Lev("Alex");
        System.out.println(animal.name);
        animal.eat();
        animal.sleep();

        Mammal mammal = new Lev("Banifaciy");
        System.out.println(mammal.name);
        mammal.run();
        mammal.eat();
        mammal.sleep();
        mammal.speak();
    }
}
