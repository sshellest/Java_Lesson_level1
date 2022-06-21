package ru.geekbrains.lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        twoNumbers();
        numberIsPositiveOrNegative();
        numberInt();
        string();




    }


    public static void twoNumbers() {
        int a = 5, b = 4;
        if ((a + b) >= 10 && (a + b) <= 20) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    public static void numberIsPositiveOrNegative () {
        int a = 5;
        if (a % 2==0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    public static void numberInt () {
        int a = 5;
        if (a % 2 == 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }


        public static void string () {
            for (int j = 0; j < 5; j++) {
                System.out.println("Отпечатать в консоль указанную строку, указанное количество раз");
            }
        }






}
