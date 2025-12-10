package com.finocio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //metodo para insertar los datos por linea de comandos

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese operación (ej: 1 + 2):");
        String input = scanner.nextLine().trim();

        // Separar por espacios
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            System.out.println("Error: Formato incorrecto. Use: número operador número (ej: 1 + 2)");
            return;
        }

        double numA;
        double numB;
        String operator = parts[1];

        try {
            numA = Double.parseDouble(parts[0]);
            numB = Double.parseDouble(parts[2]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Uno de los valores no es un número válido.");
            return;
        }



        double result;

        switch (operator) {
            case "+":
                result = new AddService().add(numA, numB);
                break;
            case "-":
                result = new SubtractService().subtract(numA, numB);
                break;
            case "*":
                result = new MultiplicationService().multiply(numA, numB);
                break;
            case "/":
                try {
                    result = new DivisionService().divide(numA, numB);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Error: Operador no soportado. Use +, -, *, /");
                return;
        }

        System.out.println("Resultado: " + result);
    }
}

