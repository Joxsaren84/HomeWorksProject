package ru.Iam.tregulov.lesson14;

public class Lesson14 {
    public static void main(String[] args) {

        HOURS:
        for (int i = 0; i <= 5; i++) {
            MINUTES:
            for (int j = 0; j <= 59; j++) {
                if (i > 1 & j % 10 == 0)
                    break HOURS;
                for (int k = 0; k <= 59; k++) {
                    if (k * i > j)
                        continue MINUTES;
                    System.out.println(i + ":" + j + ":" + k);
                }
            }
        }
    }
}
