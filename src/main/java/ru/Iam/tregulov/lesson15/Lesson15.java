package ru.Iam.tregulov.lesson15;

public class Lesson15 {
    public static void main(String[] args) {

        int h = 0;
        INNER:
        while(h < 24){
            int m = -1;
            MIDDLE:
            do{
                m++;
                if (h > 1 & m % 10 == 0)
                    break INNER;
                int s = 0;
                OUTER:
                while (s < 60){
                    if (s * h > m)
                        continue MIDDLE;
                    System.out.println(h + ":" + m + ":" + s);
                    s++;
                }
            }while(m < 59);
            h++;
        }
    }
}
