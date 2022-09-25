package com.functionalprogramming.study.chapter5.model;

public class Suv extends Car{
    public Suv(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void drive() {
        System.out.println("Driving a suv " + name + " from " + brand);
    }
}
