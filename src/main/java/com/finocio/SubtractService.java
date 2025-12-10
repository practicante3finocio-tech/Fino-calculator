package com.finocio;

/**
 * SubtractService provides the implementation of the "subtract" operation.
 * All other operations are not supported in this service.
 */
public class SubtractService implements CalculatorService {

    /**
     * This service only supports subtraction.
     * Calling add will throw an exception.
     */
    @Override
    public double add(double a, double b) {
        throw new UnsupportedOperationException("Add not supported in SubtractService");
    }

    /**
     * Performs subtraction between two numbers.
     *
     * @param a first number
     * @param b second number
     * @return the result of a - b
     */
    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * This service only supports subtraction.
     * Calling multiply will throw an exception.
     */
    @Override
    public double multiply(double a, double b) {
        throw new UnsupportedOperationException("Multiply not supported in SubtractService");
    }

    /**
     * This service only supports subtraction.
     * Calling divide will throw an exception.
     */
    @Override
    public double divide(double a, double b) {
        throw new UnsupportedOperationException("Divide not supported in SubtractService");
    }
}
