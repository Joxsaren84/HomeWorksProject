package ru.Iam.tregulov.lesson10.p4;

import static ru.Iam.tregulov.lesson10.p1.p2.B.*;
import ru.Iam.tregulov.lesson10.p1.A;
import ru.Iam.tregulov.lesson10.p1.p2.p3.C;
import ru.Iam.tregulov.lesson10.p4.p5.E;

public class D {

    public static void main(String[] args) {

        //вывод static элементов из класса B
        System.out.println(a);
        showStaticVariable();

        //вывод non-static методов классов
        A objectA = new A();
        objectA.classInfo();

        C objectC = new C();
        objectC.classInfo();

        E objectE = new E();
        objectE.classInfo();

    }
}
