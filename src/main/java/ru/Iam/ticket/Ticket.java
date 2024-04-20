package ru.Iam.ticket;

public class Ticket {

    static boolean isLucky(int n){
        return ((n / 100000 + n % 100000 / 10000 + n % 10000 / 1000) == (n % 1000 / 100 + n % 100 / 10 + n % 10));
    }

    static boolean isLucky(String s){
        //todo обработать исключение NumberFormatException через try когда пройду тему
        return isLucky(Integer.parseInt(s));
    }

    public static void main(String[] args) {

        int number = 888111;
        String sNumber = "055550";

        System.out.println(isLucky(sNumber));
        System.out.println(isLucky(number));
    }
}
