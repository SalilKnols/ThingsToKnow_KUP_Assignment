package Question9;

import math.Calculator;

public class Main {

    public static void main(String[] args) {

        int a = 10, b = 5;

        int sum = Calculator.add(a, b);
        int difference = Calculator.subtract(a, b);
        int product = Calculator.multiply(a, b);
        int quotient = Calculator.divide(a, b);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
