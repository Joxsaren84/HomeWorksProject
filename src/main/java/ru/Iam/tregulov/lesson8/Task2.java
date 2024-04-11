package ru.Iam.tregulov.lesson8;

public class Task2 {
    static final double Pi = 3.14;

    public double circleArea(double r){
        return Pi * r * r;
    }

    public static double circumference(double r){
        return Pi * r * 2;
    }

    public void circleInfo(double r){
        System.out.println("The radius of the circle is " + r);
        System.out.println("The area of the circle is " + circleArea(r));
        System.out.println("The circumference is " + circumference(r));
    }
}
