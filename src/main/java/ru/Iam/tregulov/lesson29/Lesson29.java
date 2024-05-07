package ru.Iam.tregulov.lesson29;

import java.time.*;
import java.time.format.*;

public class Lesson29 {
    static DateTimeFormatter firstFormatter = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    static DateTimeFormatter secondFormatter = DateTimeFormatter.ofPattern("hh:mm, dd/MMMM/yy");

    public static void main(String[] args) {

        LocalDateTime dt1 = LocalDateTime.of(2024, Month.MAY, 1, 8, 0);
        LocalDateTime dt2 = LocalDateTime.of(2024, Month.JUNE, 1, 23, 59);
        Period period = Period.ofDays(5);
        Duration duration = Duration.ofDays(2);
        smena(dt1, dt2, period, duration);
    }

    static void smena(LocalDateTime ldt1, LocalDateTime ldt2, Period period, Duration duration){
        while(ldt1.isBefore(ldt2)){
            System.out.print("Работаем с: " + ldt1.format(firstFormatter));
            ldt1 = ldt1.plus(period);
            System.out.println(" До: " + ldt1.format(secondFormatter));
            System.out.print("Отдыхаем с: " + ldt1.format(secondFormatter));
            ldt1 = ldt1.plus(duration);
            System.out.println(" До: " + ldt1.format(firstFormatter));
        }
    }
}
