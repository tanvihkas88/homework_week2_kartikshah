package homeWork_Week2;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output : 8 x 1 = 8 8 x 2 = 16 8 x 3 = 24 ... 8 x 10 = 80
 */

    public class Programme10 {

        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner in = new Scanner(System.in);

            // Prompt the user to input a number
            System.out.print("Input a number: ");

            // Read and store the input number
            int num1 = in.nextInt();

            // Use a loop to calculate and print the multiplication table for the input number
            for (int i = 0; i < 10; i++) {
                // Calculate and print the result of num1 multiplied by (i+1)
                System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
            }
        }
    }

