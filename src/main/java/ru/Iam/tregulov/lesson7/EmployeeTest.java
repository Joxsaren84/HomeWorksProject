package ru.Iam.tregulov.lesson7;

public class EmployeeTest {
    //Тестим конструкторы и методы из другого класса но в одном покете
    public static void main(String[] args) {
        //private конструктор не работает
        /*
        Employee employee1 = new Employee(1000, "Ivanov", 500);
        employee1.printId();
        System.out.println(employee1.id);
        employee1.printSurname();
        System.out.println(employee1.surname);
        employee1.printSalary();
        System.out.println(employee1.salary);
        */

        //default конструктор
        Employee employee2 = new Employee(1001, "Petrov", 50, 600, "IT");
        employee2.printId();
        System.out.println(employee2.id);
        employee2.printSurname();
        System.out.println(employee2.surname);
        employee2.printSalary();
        //приватное поле не работает
        //System.out.println(employee2.salary);

        //public конструктор
        Employee employee3 = new Employee("Sidorov", 800, 1002);
        employee3.printId();
        System.out.println(employee3.id);
        employee3.printSurname();
        System.out.println(employee3.surname);
        employee3.printSalary();
        //приватное поле не работает
        //System.out.println(employee3.salary);
    }
}
