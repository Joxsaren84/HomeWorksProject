package ru.Iam.tregulov.lesson20.lesson17;

public class Lesson17 {

    static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
        if (sb1 == sb2){
            return true;
        }else{
            String s1 = new String(sb1);
            String s2 = new String(sb2);
            return s1.equals(s2);
        }
    }

    public static void main(String[] args) {
        StringBuilder stb1 = new StringBuilder("Hello world");
        StringBuilder stb2 = stb1;
        StringBuilder stb3 = new StringBuilder("Hello Lord");
        StringBuilder stb4 = new StringBuilder("Hello world");

        System.out.println(ravenstvo(stb1, stb2));
        System.out.println(ravenstvo(stb1, stb3));
        System.out.println(ravenstvo(stb1, stb4));
    }
}
