package homeWork_Week2;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
// Define a public class named Exercise29.
public class Programme19 {

    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str = "The Quick BroWn FoX!";

        // Convert the above string to all lowercase.
        String lowerStr = str.toLowerCase();

        // Display the original and lowercase strings for comparison.
        System.out.println("Original String: " + str);
        System.out.println("String in lowercase: " + lowerStr);
    }
}
