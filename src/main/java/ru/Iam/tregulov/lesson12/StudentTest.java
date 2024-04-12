package ru.Iam.tregulov.lesson12;

public class StudentTest {

    static void equalsStudent1(Student student1, Student student2){
        if(student1.name.equals(student2.name) && student1.course == student2.course && student1.grade == student2.grade)
            System.out.println("These students are equal");
        else
            System.out.println("These students are not equal");
    }

    static void equalsStudent2(Student student1, Student student2){

        if(student1.name.equals(student2.name))
            if(student1.course == student2.course)
                if(student1.grade == student2.grade)
                    System.out.println("These students are equal");
                else
                    System.out.println("They have different grades.");
            else
                System.out.println("They have different courses.");
        else
            System.out.println("They have different names.");
    }

    public static void main(String[] args) {

        Student student1 = new Student("Ivan", 3, 9.8);
        Student student2 = new Student("Ivan", 3, 9.8);
        Student student3 = new Student("Ivan", 3, 7.8);

        equalsStudent1(student1, student2);
        equalsStudent1(student1, student3);

        equalsStudent2(student2, student3);
        equalsStudent2(student2, student1);
    }
}
