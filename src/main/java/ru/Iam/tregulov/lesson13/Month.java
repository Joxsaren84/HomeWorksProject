package ru.Iam.tregulov.lesson13;

import java.util.Scanner;

public class Month {

    static void numberOfDays(int monthNumber){
        switch (monthNumber){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("There are 31 days in this month.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("There are 30 days in this month.");
                break;
            case 2:
                System.out.println("There are 28 days in this month.");
                break;
            default:
                System.out.println("The month is not input correctly.");
        }
    }

    public static void main(String[] args) {
        Scanner scanMonth = new Scanner(System.in);
        System.out.print("Input month number: ");
        numberOfDays(scanMonth.nextInt());
        scanMonth.close();
    }

}
