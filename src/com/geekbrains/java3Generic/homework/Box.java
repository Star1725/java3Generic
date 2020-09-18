package com.geekbrains.java3Generic.homework;

import java.util.ArrayList;

public class Box<T extends Fruit>{
    private ArrayList<T> fruits;

    public float getWeight() {
        return weight;
    }

    private float weight = 0.0f;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public void addFruit(T fruit) {
        this.fruits.add(fruit);
        float weightOneFruit = fruit.getWeight();
        this.weight += weightOneFruit;
    }

    public boolean compareTo(Box<?> o) {
        return Math.abs(this.getWeight() - o.getWeight()) < 0.0001;
    }
}
