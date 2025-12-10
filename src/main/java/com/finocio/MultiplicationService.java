package com.finocio;

/**
 * MultiplicationService provides the implementation of the "multiply" operation.
 * All other operations are not supported in this service.
 */
public class MultiplicationService implements CalculatorService {

    /**
     * This service only supports multiplication.
     * Calling add will throw an exception.
     */
    @Override
    public double add(double a, double b) {
        throw new UnsupportedOperationException("Add not supported in MultiplicationService");
    }

    /**
     * This service only supports multiplication.
     * Calling subtract will throw an exception.
     */
    @Override
    public double subtract(double a, double b) {
        throw new UnsupportedOperationException("Subtract not supported in MultiplicationService");
    }

    /**
     * Performs multiplication between two numbers.
     *
     * @param a first number
     * @param b second number
     * @return the result of a * b
     */
    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * This service only supports multiplication.
     * Calling divide will throw an exception.
     */
    @Override
    public double divide(double a, double b) {
        throw new UnsupportedOperationException("Divide not supported in MultiplicationService");
    }
}
