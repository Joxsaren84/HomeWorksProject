package ru.Iam.clients;

import java.util.Arrays;
import java.util.Scanner;

public class Clients {

    public static void main(String[] args) {
        System.out.println("Введите кличесво клиентов: ");
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        String[][] clientsArray = new String[size][4];

        System.out.println("Введите поочередно фамилию, имя, отчество и остаток на счете:");
        for (String[] arr : clientsArray){
            for (int i = 0; i < 4; i++){
                arr[i] = scanner.next();
            }
        }
        scanner.close();

        //Сортировка по фамилии
        System.out.println("Сортировка по фамилии");
        for (int i = 0; i < clientsArray.length; i++){
            for (int j = 0; j < clientsArray.length - 1; j++){
                if(clientsArray[j][0].compareTo(clientsArray[j+1][0]) > 0){
                    String [] buffer = clientsArray[j];
                    clientsArray[j] = clientsArray[j+1];
                    clientsArray[j+1] = buffer;
                }
            }
        }

        for (String[] arr : clientsArray)
                System.out.println(Arrays.toString(arr));

        //Сортировка по баблу
        System.out.println("\nСортировка по баблу");
        for (int i = 0; i < clientsArray.length; i++){
            for (int j = 0; j < clientsArray.length - 1; j++){
                if(Double.parseDouble(clientsArray[j][3]) > Double.parseDouble(clientsArray[j+1][3])){
                    String [] buffer = clientsArray[j];
                    clientsArray[j] = clientsArray[j+1];
                    clientsArray[j+1] = buffer;
                }
            }
        }

        for (String[] arr : clientsArray)
            System.out.println(Arrays.toString(arr));
    }
}
