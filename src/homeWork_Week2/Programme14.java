package homeWork_Week2;

/**
 * Write a Java program to print the area and perimeter of a rectangle. Test Data: Width = 5.5 Height = 8.5
 * Expected Output: Area is 5.6 * 8.5 = 47.60 Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Programme14 {
    public static void main(String[] strings) {
        // Define constants for the width and height of the rectangle
        final double width = 5.6;
        final double height = 8.5;

        // Calculate the perimeter of the rectangle
        double perimeter = 2 * (height + width);

        // Calculate the area of the rectangle
        double area = width * height;

        // Print the calculated perimeter using placeholders for values
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);

        // Print the calculated area using placeholders for values
        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
    }
}
