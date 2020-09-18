package com.geekbrains.java3Generic.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class Task_1_2 {
    public static void main(String[] args) {
	// write your code here
        Integer[] arrInteger = new Integer[]{1, 2, 3, 4};
        String[] arrString = new String[]{"one", "two", "tree", "four"};

        System.out.println(Arrays.toString(changeElementsOfArr(arrInteger, 0, 3)));
        System.out.println(Arrays.toString(changeElementsOfArr(arrString, 0, 3)));
        System.out.println();
        System.out.println((transformArrToArrayList(arrInteger)).toString());
        System.out.println((transformArrToArrayList(arrString)).toString());
    }

    public static <T> T[] changeElementsOfArr(T[] arr, int i, int j){
        T buf = arr[i];
        arr[i] = arr[j];
        arr[j] = buf;
        return arr;
    }

    public static <E> ArrayList transformArrToArrayList(E[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }
}
