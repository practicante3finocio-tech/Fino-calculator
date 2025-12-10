package com.finocio;

public class DivisionService implements CalculatorService{

    @Override
    public double add(double a, double b) {
        throw new UnsupportedOperationException("Add not supported");
    }

    @Override
    public double subtract(double a, double b) {
        throw new UnsupportedOperationException("Subtract not supported");
    }

    @Override
    public double multiply(double a, double b) {
        throw new UnsupportedOperationException("Multiply not supported");
    }

    //

    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        return a / b;
    }


}
