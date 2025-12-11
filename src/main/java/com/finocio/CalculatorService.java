package com.finocio;

/**
 * This interface defines the basic operations of a calculator.
 * Each method receives two numbers and returns the result.
 */
public interface CalculatorService {

    /**
     * Adds two numbers and returns the result.
     */
    double add(double a, double b);

    /**
     * Subtracts the second number from the first one.
     */
    double subtract(double a, double b);

    /**
     * Multiplies two numbers.
     */
    double multiply(double a, double b);

    /**
     * Divides the first number by the second one.
     * Implementations should handle division by zero.
     */
    double divide(double a, double b);
}
