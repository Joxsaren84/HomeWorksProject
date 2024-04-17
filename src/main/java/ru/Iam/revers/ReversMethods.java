package ru.Iam.revers;

public class ReversMethods {

    static String firstMethod(String s){
        String reversStr = new String(new StringBuilder(s).reverse());
        return reversStr;
    }

    static String secondMethod(String s){
        char [] array = s.toCharArray();
        for(int i = 0; i <= array.length / 2; i++){
            char buff = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = buff;
        }
        String reversString = new String(array);
        return reversString;
    }

    static String thirdMethod(String s){
        char [] array = new char[s.length()];
        for(int i = 0, j = s.length() - 1; j >= 0; i++, j--){
            array[i] = s.charAt(j);
        }
        String reversString = new String(array);
        return reversString;
    }

    public static void main(String[] args) {
        System.out.println(firstMethod("Hello world"));
        System.out.println(secondMethod("Hello world"));
        System.out.println(thirdMethod("Hello world"));
    }
}
