package ru.Iam.tregulov.lesson18;

public class Task1 {

    static int [] sortirovka(int [] arr){

        //пузырёк
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int buff = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buff;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] array = sortirovka(new int [] {5, 8, 2, 7, 3, -1});

        for(int n : array){
            System.out.println(n);
        }

        //массив передается в метод по ссылке
        int [] array2 = new int[] {3, 2, 1};

        sortirovka(array2);

        for(int n : array2){
            System.out.println(n);
        }
    }
}
