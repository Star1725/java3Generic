package com.geekbrains.java3Generic.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Box<T extends Fruit>{

    public float getWeight() {
        return weight;
    }

    private List<T> fruits;

    public String getTypeFruit(){
        return this.getFruits().get(0).getClass().getSimpleName();
    }

    public float getWeight1() {
        return weight;
    }

    private float weight;

    public float getWeight2() {
        if (fruits.size() != 0.0){
            return this.fruits.size() * fruits.get(0).getWeight();
        } else return 0.0f;
    }

    public Box() {
        this.fruits = new ArrayList<T>();
    }

    public List<T> getFruits() {
        return fruits;
    }

    public void setFruits(List<T> fruits) {
        this.fruits = fruits;
    }

    public void addFruit(T fruit) {
        this.fruits.add(fruit);
        weight += fruit.getWeight();
    }

    public boolean compareTo(Box<?> o) {
        return Math.abs(this.getWeight1() - o.getWeight2()) < 0.0001;
    }

    public static <T extends Fruit> void shiftFruit(Box<? super T> dist, Box<T> src){
        for (T o : src.getFruits()) {
            dist.addFruit(o);
        }
        src.getFruits().clear();
    }
}
