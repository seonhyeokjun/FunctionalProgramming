package com.functionalprogramming.study.chapter3;

import com.functionalprogramming.study.chapter3.util.Adder;

import java.util.function.Function;

public class Chapter3Section1 {
    public static void main(String[] args) {
        Function<Integer, Integer> myAdder = new Adder();
        int result = myAdder.apply(5);
        System.out.println(result);
    }
}
