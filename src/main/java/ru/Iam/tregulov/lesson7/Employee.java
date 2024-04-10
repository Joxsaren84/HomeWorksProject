package ru.Iam.tregulov.lesson7;

public class Employee {

    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    private Employee(int id, String surname, double salary){
        this.id = id;
        this.surname = surname;
        this.salary = salary;
    }

    Employee(int id, String surname, int age, double salary, String department){
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public Employee(String surname, double salary, int id){
        this.id = id;
        this.surname = surname;
        this.salary = salary;
    }

    void doubleSalary(){
        salary *= 2;
    }

    public void printId() {
        System.out.println(id);
    }

    public void printSurname() {
        System.out.println(surname);
    }

    public void printSalary() {
        System.out.println(salary);
    }

    //Тестим конструкторы и методы внутри самого класса
    public static void main(String[] args) {
        //private конструктор
        Employee employee1 = new Employee(1000, "Ivanov", 500);
        employee1.printId();
        System.out.println(employee1.id);
        employee1.printSurname();
        System.out.println(employee1.surname);
        employee1.printSalary();
        System.out.println(employee1.salary);

        //default конструктор
        Employee employee2 = new Employee(1001, "Petrov", 50, 600, "IT");
        employee2.printId();
        System.out.println(employee2.id);
        employee2.printSurname();
        System.out.println(employee2.surname);
        employee2.printSalary();
        System.out.println(employee2.salary);

        //public конструктор
        Employee employee3 = new Employee("Sidorov", 800, 1002);
        employee3.printId();
        System.out.println(employee3.id);
        employee3.printSurname();
        System.out.println(employee3.surname);
        employee3.printSalary();
        System.out.println(employee3.salary);
    }
}
