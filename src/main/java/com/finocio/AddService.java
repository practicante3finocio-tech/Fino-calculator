package com.finocio;

public class AddService implements CalculatorService {

    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return 0;
    }

    @Override
    public double multiply(double a, double b) {
        return 0;
    }

    @Override
    public double divide(double a, double b) {
        return 0;
    }
}

