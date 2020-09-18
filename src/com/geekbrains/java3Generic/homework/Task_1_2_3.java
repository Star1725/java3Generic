package com.geekbrains.java3Generic.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Task_1_2_3 {
    public static void main(String[] args) {
	// write your code here
        Integer[] arrInteger = new Integer[]{1, 2, 3, 4};
        String[] arrString = new String[]{"one", "two", "tree", "four"};

        System.out.println(Arrays.toString(changeElementsOfArr(arrInteger, 0, 3)));
        System.out.println(Arrays.toString(changeElementsOfArr(arrString, 0, 3)));
        System.out.println();
        System.out.println((transformArrToArrayList(arrInteger)).toString());
        System.out.println((transformArrToArrayList(arrString)).toString());

        Box<Apple> appleBox = new Box<Apple>(new ArrayList());
        for (int i = 0; i < 150; i++) {
            appleBox.addFruit(new Apple(1.0f));
        }

        Box<Orange> orangeBox = new Box<Orange>(new ArrayList());
        for (int i = 0; i < 100; i++) {
            orangeBox.addFruit(new Orange(1.5f));
        }

        System.out.println();
        System.out.println("weight appleBox = " + appleBox.getWeight());
        System.out.println("weight orangeBox = " + orangeBox.getWeight());
        System.out.println();
        System.out.println("Is equals weight appleBox and weight orangeBox? - " + appleBox.compareTo(orangeBox));
        //новая коробка для яблок
        Box<Apple> appleBox1 = new Box<>(new ArrayList<>());
        appleBox1.setFruits(appleBox.getFruits());
        //пытаемся в новую коробку для яблок положить апельсины
        //appleBox1.setFruits(orangeBox.getFruits());
    }

    public static <T> T[] changeElementsOfArr(T[] arr, int i, int j){
        T buf = arr[i];
        arr[i] = arr[j];
        arr[j] = buf;
        return arr;
    }

    public static <E> List transformArrToArrayList(E[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }
}
