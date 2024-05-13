package ru.Iam.tregulov.lesson30;

import java.util.ArrayList;

public class Employee {

    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public static void main(String[] args) {
        ArrayList <Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee("Viktor", "IT", 300);
        Employee emp2 = new Employee("Egor", "Managers", 200);
        Employee emp3 = new Employee("Helga", "Cleaning", 100);
        Employee emp4 = new Employee("Sale", "Sale", 300);
        Employee emp5 = new Employee("Georg", "director", 450);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        TestEmployee test = new TestEmployee();
        test.filtraciaRabotnikov(employees, employee -> {return (employee.salary > 200 && !employee.department.equals("IT"));});
        System.out.println("***********************************************");
        test.filtraciaRabotnikov(employees, employee -> {return (employee.salary != 450 && employee.name.startsWith("E"));});
        System.out.println("***********************************************");
        test.filtraciaRabotnikov(employees, employee -> employee.name.equals(employee.department));

    }
}
