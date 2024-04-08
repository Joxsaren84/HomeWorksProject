package ru.Iam.tregulov.lesson4;

/*
    Создайте 2 класса. 1-ый назовите Student. Он должен содержать в себе
    следующие атрибуты: номер студенческого билета, имя, фамилию, год обучения,
    средняя оценка по математике, средняя оценка по экономике, средняя оценка
    по иностранному языку. 2-ой класс назовите StudentTest. В нем вы должны
    будете создать 3 разных объекта класса Student, вывести на экран в читабельном
    виде среднюю арифметическую оценку каждого студента (учитывая все 3 параметра)
*/

public class Student {
    int studentId;
    int course;

    double mathAverage;
    double economyAverage;
    double foreignLangAverage;

    String name;
    String lastName;
}

class StudentTest{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Jonny";
        student1.lastName = "Page";
        student1.course = 3;
        student1.studentId = 1000;
        student1.mathAverage = 5;
        student1.economyAverage = 5;
        student1.foreignLangAverage = 5;

        Student student2 = new Student();
        student2.name = "Yoko";
        student2.lastName = "Ona";
        student2.course = 1;
        student2.studentId = 1001;
        student2.mathAverage = 3;
        student2.economyAverage = 3;
        student2.foreignLangAverage = 4;

        Student student3 = new Student();
        student3.name = "John";
        student3.lastName = "Doll";
        student3.course = 1;
        student3.studentId = 1002;
        student3.mathAverage = 3;
        student3.economyAverage = 4;
        student3.foreignLangAverage = 5;

        System.out.println("Name: " + student1.name);
        System.out.println("Last name: " + student1.lastName);
        System.out.printf("Average grade: %.1f\n\n", (student1.mathAverage + student1.economyAverage + student1.foreignLangAverage)/3);

        System.out.println("Name: " + student2.name);
        System.out.println("Last name: " + student2.lastName);
        System.out.printf("Average grade: %.1f\n\n", (student2.mathAverage + student2.economyAverage + student2.foreignLangAverage)/3);

        System.out.println("Name: " + student3.name);
        System.out.println("Last name: " + student3.lastName);
        System.out.printf("Average grade: %.1f\n\n", (student3.mathAverage + student3.economyAverage + student3.foreignLangAverage)/3);
    }
}