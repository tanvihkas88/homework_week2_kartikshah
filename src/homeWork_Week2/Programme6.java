package homeWork_Week2;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */

    public class Programme6 {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner io = new Scanner(System.in);

            // Prompt the user to input the radius of the circle
            System.out.println("Input the radius of the circle: ");

            // Read and store the input radius
            double radius = io.nextDouble();

            // Calculate and print the perimeter of the circle
            System.out.println("Perimeter is = " + (2 * radius * Math.PI));

            // Calculate and print the area of the circle
            System.out.println("Area is = " + (Math.PI * radius * radius));
        }
    }


