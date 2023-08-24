package org.example;

public class Calculator {
    public int addition (int a, int b){
        return a+b;
    }
    public int subtraction (int a, int b){
        return a-b;
    }
    public int multiplication (int a, int b){
        return a*b;
    }
    public double division (int a, int b){
        if (a==0 || b == 0){ throw new IllegalArgumentException();};

        return (double) a /b;
    }
}