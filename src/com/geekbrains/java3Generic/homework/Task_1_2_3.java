package com.geekbrains.java3Generic.homework;

import java.util.*;


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

        Box<Apple> appleBox = new Box<>();
        for (int i = 0; i < 120; i++) {
            appleBox.addFruit(new Apple());
        }

        Box<Orange> orangeBox = new Box<>();
        for (int i = 0; i < 100; i++) {
            orangeBox.addFruit(new Orange());
        }

        System.out.println();
        //расчёт веса коробки с яблоками через метод addFruit(new Apple()
        System.out.println("weight appleBox = " + appleBox.getWeight1());
        //расчёт веса коробки с апельсинами через метод getWeight2()
        System.out.println("weight orangeBox = " + orangeBox.getWeight2());
        System.out.println();

        System.out.println("Is equals weight appleBox and weight orangeBox? - " + appleBox.compareTo(orangeBox));
        //новая коробка для яблок
        Box<Apple> appleBox1 = new Box<>();
        //пытаемся в новую коробку для яблок положить апельсины
        //appleBox1.setFruits(orangeBox.getFruits());

        System.out.println();
        Box<Fruit> newBox = new Box<>();
        Box.shiftFruit(newBox, appleBox);
        System.out.println("weight newBox = " + newBox.getWeight2() + ". Type fruit - " + newBox.getTypeFruit());
        System.out.println("weight appleBox = " + appleBox.getWeight2());
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
