package ru.Iam.tregulov.lesson22.task1;

public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName(new StringBuilder("Anton"));
        System.out.println(student.getName());

        //проверим что инкапсуляция для поля работает
        student.getName().append(" Gandon");
        System.out.println(student.getName());

        student.setCourse(4);
        System.out.println(student.getCourse());
        student.setCourse(5);
        System.out.println(student.getCourse());

        student.setGrade(10);
        System.out.println(student.getGrade());
        student.setGrade(0);
        System.out.println(student.getGrade());

        student.ShowInfo();
    }

}
