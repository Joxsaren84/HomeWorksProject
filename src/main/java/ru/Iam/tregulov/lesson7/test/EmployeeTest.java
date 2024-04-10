package ru.Iam.tregulov.lesson7.test;

public class EmployeeTest {
    //Тестим конструкторы и методы из другого класса в другом покете
    //Пишем полный путь к классу, т.к. import мы еще не знаем...
    public static void main(String[] args) {
        //private конструктор не работает
        /*
        ru.Iam.tregulov.lesson7.Employee employee1 = new ru.Iam.tregulov.lesson7.Employee(1000, "Ivanov", 500);
        employee1.printId();
        System.out.println(employee1.id);
        employee1.printSurname();
        System.out.println(employee1.surname);
        employee1.printSalary();
        System.out.println(employee1.salary);
        */

        //default конструктор не работает
        /*
        ru.Iam.tregulov.lesson7.Employee employee2 = new ru.Iam.tregulov.lesson7.Employee(1001, "Petrov", 50, 600, "IT");
        employee2.printId();
        System.out.println(employee2.id);
        employee2.printSurname();
        System.out.println(employee2.surname);
        employee2.printSalary();
        System.out.println(employee2.salary);
         */

        //public конструктор
        ru.Iam.tregulov.lesson7.Employee employee3 = new ru.Iam.tregulov.lesson7.Employee("Sidorov", 800, 1002);
        employee3.printId();
        //дефолтное поле не работает
        //System.out.println(employee3.id);
        employee3.printSurname();
        System.out.println(employee3.surname);
        employee3.printSalary();
        //приватное поле не работает
        //System.out.println(employee3.salary);
    }
}
