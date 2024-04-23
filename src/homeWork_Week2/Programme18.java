package homeWork_Week2;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output : 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */

    public class Programme18 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Input first number
            System.out.print("Input first number: ");
            double num1 = input.nextDouble();

            // Input second number
            System.out.print("Input second number: ");
            double num2 = input.nextDouble();

            // Addition
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

            // Subtraction
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

            // Multiplication
            System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));

            // Division
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

            // Remainder
            System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));

            input.close();
        }
    }
