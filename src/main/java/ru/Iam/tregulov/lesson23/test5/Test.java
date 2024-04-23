package ru.Iam.tregulov.lesson23.test5;

class X {
    String s1 = "Privet";
}

class Y extends X {
    boolean bool = false;
}

public class Test {
    public static void main(String[] args) {
        Y x = new Y(); //Тип объекта должен быть Y
        System.out.println(x.s1 + " " + x.bool);
    }
}
