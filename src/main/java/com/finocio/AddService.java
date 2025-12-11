package com.finocio;

/**
 * AddService provides the implementation of the "add" operation.
 * All other operations are not supported in this service.
 */
public class AddService implements CalculatorService {

    /**
     * Performs addition between two numbers.
     *
     * @param a first number
     * @param b second number
     * @return the result of a + b
     */
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * This service only supports addition.
     * Calling subtract will throw an exception.
     */
    @Override
    public double subtract(double a, double b) {
        throw new UnsupportedOperationException("Subtract not supported in AddService");
    }

    /**
     * This service only supports addition.
     * Calling multiply will throw an exception.
     */
    @Override
    public double multiply(double a, double b) {
        throw new UnsupportedOperationException("Multiply not supported in AddService");
    }

    /**
     * This service only supports addition.
     * Calling divide will throw an exception.
     */
    @Override
    public double divide(double a, double b) {
        throw new UnsupportedOperationException("Divide not supported in AddService");
    }
}
