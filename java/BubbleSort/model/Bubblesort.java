package model;

import java.util.Random;

public class Bubblesort {

    public static void main(String[] args) {

        int[] first = { 1, 2, 3, 4, 5 };

        System.out.println(arrayToString(first));

        // Random Arrays ____ AUFGABE 1 , b
        int[] arr1 = randomArray(10);
        int[] arr2 = randomArray(20);
        int[] arr3 = randomArray(30);

        System.out.println(arrayToString(arr1));
        System.out.println(arrayToString(arr2));
        System.out.println(arrayToString(arr3));

        // AuFGABE 1 , C bubbleSort tests

        bubbleSort(arr1);
        bubbleSort(arr2);
        bubbleSort(arr3);

        System.out.println("Sort Array :  \n\n");

        System.out.println(arrayToString(arr1));
        System.out.println(arrayToString(arr2));
        System.out.println(arrayToString(arr3));

    }

    // Array_to_string Method

    static String arrayToString(int[] arr) {

        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1)
                s += Integer.toString(arr[i]) + ",";
            if (i == arr.length - 1)
                s += Integer.toString(arr[i]) + "]";

        }
        return s;

    }

    // Random Method

    static int[] randomArray(int n) {

        int[] new_array = new int[n];

        for (int i = 0; i < n; i++) {
            Random rand = new Random();
            new_array[i] = rand.nextInt(99);

        }
        return new_array;

    }

    // SORT_METHOD_BUBBLE

    public static void bubbleSort(int[] arr) {
        int elemnt = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                elemnt = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = elemnt;

            }

        }

        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1])
                j++;

        }

        if (j != 0)
            bubbleSort(arr);

    }

}
