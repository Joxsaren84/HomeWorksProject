package ru.Iam.tregulov.lesson30;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestEmployee {

    void printEmployee(Employee e){
        System.out.print("Name: " + e.name);
        System.out.print(" department: " + e.department);
        System.out.println(" salary: " + e.salary);
    }

    void filtraciaRabotnikov(ArrayList<Employee> el, Predicate<Employee> t){
        for(Employee e : el){
            if(t.test(e)){
                printEmployee(e);
            }
        }
    }
}
