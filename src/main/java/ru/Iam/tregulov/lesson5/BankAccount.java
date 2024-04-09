package ru.Iam.tregulov.lesson5;

/*
    В класс BankAccount добвьте 2 метода. Первый метод называется popolnenieScheta
     и увеличивает баланс на сумму, которая указанна в параметре метода. Второй
     метод называется snyatieSoScheta и меньшает баланс на сумму, которая указанна
     в параметре этого метода.
 */

public class BankAccount {
    int id;
    String name;
    double balance;

    void popolnenieScheta(double sum){
        balance += sum;
    }

    void snyatieSoScheta(double dif){
        balance -=dif;
    }
}

class TestBankAccount{
    public static void main(String[] args) {

        BankAccount bA1 = new BankAccount();
        bA1.name = "Piter";
        bA1.id = 1000;
        bA1.balance = 100;

        bA1.popolnenieScheta(100);
        System.out.println(bA1.balance);

        bA1.snyatieSoScheta(51);
        System.out.println(bA1.balance);
    }
}