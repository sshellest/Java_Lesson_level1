package ru.geekbrains.lesson6;

import java.util.Scanner;

public class HomeWorkApp6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distanceRun = 200;
        double distanceSwim = 0;
        Cat cat = new Cat (distanceRun, distanceSwim);

        distanceRun = 500;
        distanceSwim = 10;
        Dog dog = new Dog (distanceRun, distanceSwim);

        System.out.println("Кошка может пробежать:" + cat.getAnimalDistanceRun()
                + "м.\nСобака может пробежать:" + dog.getAnimalDistanceRun()+"м.");

        System.out.println("Введите дистанцию для бега:");
        double distance = scanner.nextDouble();

        System.out.println("Кошка бежит("+distance+").Результат:"+ cat.run(distance));
        System.out.println("Собака бежит("+distance+").Результат:"+ dog.run(distance));
        System.out.println("\n*********\n");


        System.out.println("Кошка может проплыть:" + cat.getAnimalDistanceSwim()
                + "м.\nСобака может проплыть:" + dog.getAnimalDistanceSwim()+"м.");

        System.out.println("Введите дистанцию для плавания:");
        distance = scanner.nextDouble();

        System.out.println("Кошка плывёт("+distance+").Результат:"+ cat.swim(distance));
        System.out.println("Собака плывёт("+distance+").Результат:"+ dog.swim(distance));
        System.out.println("\n*********\n");




    }
}
