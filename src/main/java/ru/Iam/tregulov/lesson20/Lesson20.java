package ru.Iam.tregulov.lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class Lesson20 {

    static ArrayList <String> abc(String ... array) {

        ArrayList<String> list = new ArrayList<>();

        for (String s : array) {
            if (!list.contains(s))
                list.add(s);
        }

        Collections.sort(list);

        return list;
    }


    public static void main(String[] args) {
        System.out.println(abc("C", "C", "A", "C", "A", "B"));
    }
}
