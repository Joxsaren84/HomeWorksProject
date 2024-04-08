package ru.Iam.tregulov.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        //Создать 4 переменные всех целочисленных типов данных в следующем виде:

        //Все 4 переменные типа byte должны равняться 12 и быть записааны в разных системах счисления;
        byte b1 = 0b1100;
        byte b2 = 014;
        byte b3 = 12;
        byte b4 = 0xC;

        //Все 4 переменные типа short должны равняться -1300 и быть записааны в разных системах счисления;
        short s1 = -0b0101_0001_0100;
        short s2 = -02424;
        short s3 = -1300;
        short s4 = -0x514;

        //Все 4 переменные типа int должны равняться 0 и быть записааны в разных системах счисления;
        int i1 = 0b0;
        int i2 = 0_0;
        int i3 = 0;
        int i4 = 0x0;

        //Все 4 переменные типа long должны равняться 123456789 и быть записааны в разных системах счисления;
        long l1 = 0b0111_0101_1011_1100_1101_0001_0101;
        long l2 = 0726746425;
        long l3 = 123456789;
        long l4 = 0x75BCD15;


        //И вывести их на экран.
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        //Создать по 2 переменные типов данных float, double и boolean.
        float f1 = 3.14f;
        float f2 = 100;

        double d1 = 3.14;
        double d2 = 3.1415926535;

        boolean bl1 = true;
        boolean bl2 = false;

        //И вывести их на экран.
        System.out.println(f1);
        System.out.println(f2);

        System.out.println(d1);
        System.out.println(d2);

        System.out.println(bl1);
        System.out.println(bl2);

        //Создать n-ное количество типа данных char всеми возможными способами.
        char c1 = 'A';
        char c2 = '\u0041';
        char c3 = 65;

        //И вывести их на экран.
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
