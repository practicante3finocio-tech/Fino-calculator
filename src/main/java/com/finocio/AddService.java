package com.finocio;

public class AddService implements CalculatorService {

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        throw new UnsupportedOperationException("Subtract not supported in AddService");
    }

    @Override
    public double multiply(double a, double b) {
        throw new UnsupportedOperationException("Multiply not supported in AddService");
    }

    @Override
    public double divide(double a, double b) {
        throw new UnsupportedOperationException("Divide not supported in AddService");
    }
}
