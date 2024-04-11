package ru.Iam.tregulov.lesson9;

public class Test1 {
    int a = 1;
    //int static a = 2; одноименные переменные

    void abc(int a){
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.abc(3);
    }
}
