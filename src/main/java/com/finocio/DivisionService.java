package com.finocio;

/**
 * DivisionService provides the implementation of the "divide" operation.
 * All other operations are not supported in this service.
 */
public class DivisionService implements CalculatorService {

    /**
     * This service only supports division.
     * Calling add will throw an exception.
     */
    @Override
    public double add(double a, double b) {
        throw new UnsupportedOperationException("Add not supported");
    }

    /**
     * This service only supports division.
     * Calling subtract will throw an exception.
     */
    @Override
    public double subtract(double a, double b) {
        throw new UnsupportedOperationException("Subtract not supported");
    }

    /**
     * This service only supports division.
     * Calling multiply will throw an exception.
     */
    @Override
    public double multiply(double a, double b) {
        throw new UnsupportedOperationException("Multiply not supported");
    }

    /**
     * Performs division between two numbers.
     * Throws an exception if the denominator is zero.
     *
     * @param a numerator
     * @param b denominator
     * @return the result of a / b
     */
    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("The denominator cannot be zero.");
        }
        return a / b;
    }
}
