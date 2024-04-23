package homeWork_Week2;

/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme4 {
    // 4.1 Declare two instance and two static variables
    int a = 5;
    int b = 7;
    static int c = 10;
    static int d = 20;

    // 4.2 Declare one instance method
    public void instanceMethod() {
        // 4.4 Call all four instance and static variables into the instance method inside the print statement
        System.out.println("Instance Variable 1: " + a);
        System.out.println("Instance Variable 2: " + b);
        System.out.println("Static Variable 1: " + c);
        System.out.println("Static Variable 2: " + d);
    }

    // 4.3 Declare one static method
    public static void staticMethod() {
        // 4.4 Call all four instance and static variables into the static method inside the print statement
        Programme4 obj = new Programme4(); // Creating an object to access instance variables
        System.out.println("Instance Variable 1: " + obj.a);
        System.out.println("Instance Variable 2: " + obj.b);
        System.out.println("Static Variable 1: " + c);
        System.out.println("Static Variable 2: " + d);
    }

    // 4.5 Declare the Main method
    public static void main(String[] args) {
        // 4.6 Call both instance and static methods into the Main method and run the programme
        Programme4 obj = new Programme4(); // Creating an object to access instance method
        obj.instanceMethod();
        staticMethod();
    }
}
