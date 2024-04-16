package ru.Iam.tregulov.lesson16;

public class Lesson16 {

    static void email(String str){

        while (str.length() > 0) {
            System.out.println(str.substring(str.indexOf('@') + 1, str.indexOf('.'))); //находим и выводим первую подстроку от @ до .
            str = str.substring(str.indexOf(';') + 1); //обрезаем к чертям все что до первого вхождения ';' и саму запяточку
        }
    }

    public static void main(String[] args) {
        String emailsList = "ya@yahoo.com; on@mail.ru; ona@gmail.com; hhh@yandex.ru; bb@sinara.ru;";
        email(emailsList);
    }
}
