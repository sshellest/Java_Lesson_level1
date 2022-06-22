package ru.geekbrains.lesson7;


import java.util.Scanner;

public class HomeWorkApp7 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
        Tomcat[] threeCats = new Tomcat[4];
        threeCats[0] = new Tomcat("Пушок", 10, false);
        threeCats[1] = new Tomcat("Черныш", 40, false);
        threeCats[2] = new Tomcat("Мурлыка", 5, false);


        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < threeCats.length; i++) {
            if (threeCats[i].fullness == false && threeCats[i].appetite < plate.food) {
                threeCats[i].eat(plate);
                threeCats[i].fullness = true;
                System.out.println("Кот " + threeCats[i].name + " поел!");
            } else {
                System.out.println("Кот " + threeCats[i].name + " не поел!");
            }
        }
        plate.info();
        System.out.println("Сколько грамм корма добавить еще в тарелку?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
}
