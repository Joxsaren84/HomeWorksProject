package ru.Iam.pifagor.table;

public class PifagorTable {
    public static void main(String[] args){

        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                System.out.printf("%3d", i * j);
            }
            System.out.print("\n");
        }
    }
}
