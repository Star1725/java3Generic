package com.geekbrains.java3Generic.homework;

public class Apple extends Fruit{

    public Apple(float weight) {
        this.weight = weight;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    private final float weight;

}
