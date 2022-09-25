package com.functionalprogramming.study.chapter5.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Car {
    protected String name;
    protected String brand;

    public abstract void drive();
}
