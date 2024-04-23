package ru.Iam.tregulov.lesson23.test4;

class X{}
class Y extends X{}


public class Test {
    public static void abc(X x, Y y){
        System.out.println("Privet");
    }
    public static void abc(Y y, X x){
        System.out.println("Poka");
    }

    public static void main(String[] args) {
        Y a = new Y();
        //abc(a, a);
    }
}
