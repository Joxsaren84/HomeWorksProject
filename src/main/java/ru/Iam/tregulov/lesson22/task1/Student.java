package ru.Iam.tregulov.lesson22.task1;

public class Student {


    private StringBuilder name;
    private int grade;
    private int course;

    public StringBuilder getName() {
        return new StringBuilder(name);
    }

    public void setName(StringBuilder name) {
        if (name.length() >= 3)
            this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade >= 1 & grade <= 10)
            this.grade = grade;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if(course > 0 & course < 5)
            this.course = course;
    }

    public void ShowInfo(){
        System.out.println("name is: " + getName());
        System.out.println("course is: " + getCourse());
        System.out.println("grade is: " + getGrade());
    }

}
