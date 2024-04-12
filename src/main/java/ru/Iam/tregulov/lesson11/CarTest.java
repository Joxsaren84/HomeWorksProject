package ru.Iam.tregulov.lesson11;

public class CarTest {

    static void changeNumberCountOfDoors(Car car, int newNumber ){
        car.numberOfDoors = newNumber;
    }

    static void changeColor(Car car1, Car car2){
        String swapColor = car1.color;
        car1.color = car2.color;
        car2.color = swapColor;
    }

    public static void main(String[] args) {
        //создаем два автомобиля
        Car car1 = new Car("Red", "V8", 4);
        Car car2 = new Car("Blue", "V6", 2);

        //выведем, что получилось
        car1.showInfo();
        car2.showInfo();

        //поменяем местами цвета и посмотрим, что получилось
        changeColor(car1, car2);
        car1.showInfo();
        car2.showInfo();

        //в car2 вьехал самокат, и оторвал открытую дверь и теперь дверь всего одна...
        changeNumberCountOfDoors(car2, 1);
        car2.showInfo();
    }
}
