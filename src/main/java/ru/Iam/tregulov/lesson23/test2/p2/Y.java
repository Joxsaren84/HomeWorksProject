package ru.Iam.tregulov.lesson23.test2.p2;

import ru.Iam.tregulov.lesson23.test2.p1.*;

public class Y extends X {
    @Override
    public void abc(){
        System.out.println('Y');
    }

    public void def(){
        Y y = new Y();
        y.abc();
    }

    public void ghi(){
        X x = new Y();
        //x.abc(); - метод должен быть public
    }

    public static void main(String[] args) {
        Y a = new Y();
        a.abc();
        a.def();
        a.ghi();
    }
}
