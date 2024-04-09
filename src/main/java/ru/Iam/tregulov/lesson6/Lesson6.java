package ru.Iam.tregulov.lesson6;

public class Lesson6 {
    int sum(){
        System.out.println("Sum is 0");
        return 0;
    }

    int sum(int a){
        System.out.println("Sum is " + a);
        return a;
    }

    int sum(int a, int b){
        System.out.println("Sum is " + (a + b));
        return a + b;
    }

    int sum(int a, int b, int c){
        System.out.println("Sum is " + (a + b + c));
        return a + b + c;
    }

    int sum(int a, int b, int c, int d){
        int s = a + b + c + d;
        System.out.println("Sum is " + s);
        return s;
    }

    public static void main(String[] args) {
        Lesson6 l = new Lesson6();
        l.sum();
        l.sum(1);
        l.sum(1, 1);
        l.sum(1,1,1);
        l.sum(1, 1, 1 ,1);
    }
}
