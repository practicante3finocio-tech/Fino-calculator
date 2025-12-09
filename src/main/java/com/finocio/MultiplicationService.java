package com.finocio;

public class MultiplicationService implements CalculatorService {

    @Override
    public double add(double a, double b) {
        throw new UnsupportedOperationException("Add not supported");
    }

    @Override
    public double subtract(double a, double b) {
        throw new UnsupportedOperationException("Subtract not supported");
    }

    //Metodo de la clase donde nos retorna la operacion de la multiplicacion

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        throw new UnsupportedOperationException("Divide not supported");
    }
}
