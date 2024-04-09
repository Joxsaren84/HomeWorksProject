package ru.Iam.tregulov.lesson5;

/*
    Создайте класс Employee с атрибутами id, surname, age, salary, department, которые должны задаваться в конструкторе.
    Вданном классе также создайте метод увеличения зарплаты вдвое. Создайте второй класс EmployeeTest, в котором
    создайте 2 обекта класса Employee. Увеличьте зарплату каждому работнику вдвое с помощью метода и выведите на экран
    значение новой зарплаты.
*/

import org.w3c.dom.ls.LSOutput;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id, String surname, int age, double salary, String department){
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    void doubleSalary(){
        salary *= 2;
    }
}

class EmployeeTest{
    public static void main(String[] args) {

        Employee e1 = new Employee(1000, "Doll", 50, 500, "It");
        Employee e2 = new Employee(1001, "Libovsky", 25, 250, "Manager");

        System.out.println("The salary for employee " + e1.surname + " is " + e1.salary);
        System.out.println("The salary for employee " + e2.surname + " is " + e2.salary);

        e1.doubleSalary();
        e2.doubleSalary();

        System.out.println("New salary for employee " + e1.surname + " is " + e1.salary);
        System.out.println("New salary for employee " + e2.surname + " is " + e2.salary);
    }
}