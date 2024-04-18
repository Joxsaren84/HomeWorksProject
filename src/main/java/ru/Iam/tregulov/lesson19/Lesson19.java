package ru.Iam.tregulov.lesson19;

public class Lesson19 {

    static String [] abc(String [] ... array){

        int size = 0; //переменная размера для создания одномерного массива

        for(String [] a : array){
            size += a.length;
        }

        String [] outputArray = new String[size]; //одномерный массив для оутпута

        int index = 0;

        for(String [] a : array){
            for(String s : a){
                outputArray[index] = s;
                index++;
            }
        }
        return outputArray;
    }

    public static void main(String[] args) {
       String [] array = abc(new String[] {"123132", "hfhfh", "kdfkfk"}, new String[] {"jjkljlk"});

       for(String s : args){
           for(int i = 0; i < array.length; i++){
               if(s.equals(array[i]))
                   array[i] = null;
           }
       }

       for(String s : array)
           System.out.println(s + " ");

       System.out.println();
    }
}
