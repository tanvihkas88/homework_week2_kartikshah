package homeWork_Week2;

/**
 * Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 *
 * This program declares a class InstanceVariablesExample with two instance variables num1 and str,
 * and an instance method printVariables() which prints out the values of these variables.
 * Then, in the main method, an object of InstanceVariablesExample class is created and the printVariables()
 * method is called on it to demonstrate the usage of instance variables within an instance method.
 */
public class Programme1 {
    //1.1 Declare two instance variables.
    int a = 10;
    String str = "Kartik";

    public static void main(String[] args) {

        Programme1 hw1 = new Programme1();
        hw1.printVariables();
    }

    public void printVariables() {

        System.out.println("num: " + a);
        System.out.println("str: " + str);
    }

    }