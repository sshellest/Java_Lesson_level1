package ru.geekbrains.lesson3;

import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main (String[] args) {
        integerArray();
        emptyIntegerArrayOneHundredLong();
        setAnArray();
        arrayIntegerTwoDimensionalSquare();


    }

    public static void integerArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int maxArr = arr.length;

        for (int i = 0; i < maxArr; i++) {
            System.out.print(arr[i]+" ");
            System.out.print(" ");
        }
        for (int i = 0; i < maxArr; i++)
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        for (int i = 0; i < maxArr; i++) {
            System.out.print(arr[i]+" ");
            System.out.println();
        }
        System.out.println();
    }

    public static void emptyIntegerArrayOneHundredLong() {
        int[] arr = new int[100];
        int j = 1;
        int maxArr = arr.length;
        for (int i = 0; i < maxArr; i++) {}
        for (int i = 0; i < maxArr; i++, j = j+1) {
            arr[i] = j;
        }
        for (int i = 0; i < maxArr; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void setAnArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int maxArr = arr.length;
        for (int i = 0; i < maxArr; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
        }
        for (int i = 0; i < maxArr; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void arrayIntegerTwoDimensionalSquare() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length -1;j < arr[i].length;j++,x--) {
                if (i==j || i==x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void twoArguments(int len,int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }



}
