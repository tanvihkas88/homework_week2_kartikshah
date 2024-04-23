package homeWork_Week2;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme. *
 */
public class Programme3 {
    int a = 20;
    static String name = "Kartik";

    public static void main(String[] args) {
        Programme3 obj2 = new Programme3();
        obj2.n1();
        Programme3 obj3 = new Programme3();
        obj3.m2();
    }

    public static void n1() {
        System.out.println(name);
    }

    public void m2() {
        System.out.println(a);
    }
}
