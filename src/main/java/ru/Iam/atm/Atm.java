package ru.Iam.atm;

import java.util.Scanner;

public class Atm {

    static void giveMeMyMoney(int money){
        if(money % 50 > 0 || money <= 0)
            System.out.println("Сумма должна быть положительня и кратна 50, введите другую сумму!!!");
        else {
            if(money / 5000 > 0){
                System.out.println("Выдать " + money / 5000 + " по 5000");
                money %= 5000;
            }

            if(money / 2000 > 0){
                System.out.println("Выдать " + money / 2000 + " по 2000");
                money %= 2000;
            }

            if(money / 1000 > 0){
                System.out.println("Выдать " + money / 1000 + " по 1000");
                money %= 1000;
            }

            if(money / 500 > 0){
                System.out.println("Выдать " + money / 500 + " по 500");
                money %= 500;
            }

            if(money / 200 > 0){
                System.out.println("Выдать " + money / 200 + " по 200");
                money %= 200;
            }

            if(money / 100 > 0){
                System.out.println("Выдать " + money / 100 + " по 100");
                money %= 100;
            }

            if(money / 50 > 0){
                System.out.println("Выдать " + money / 50 + " по 50");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Введите сумму для снятия или -1 для выхода");

            int money = scanner.nextInt();
            if(money == -1) {
                System.out.println("Всего хорошего!");
                scanner.close();
                break;
            }
            else{
                giveMeMyMoney(money);
            }
        }
    }
}
