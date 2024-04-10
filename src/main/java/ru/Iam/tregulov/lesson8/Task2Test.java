package ru.Iam.tregulov.lesson8;

public class Task2Test {

    public static void main(String[] args) {

        //запустим статичный метод
        System.out.println("The circumference is " + Task2.circumference(10));

        //создаем объект и используем non-static методы
        Task2 task = new Task2();

        System.out.println("The area of the circle is " + task.circleArea(10));


        task.circleInfo(11);
    }
}
