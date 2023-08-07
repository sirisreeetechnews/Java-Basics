

public class ClassLevelVariablesAndScope {
/*
    * Creating a variable inside a class and outside the methods with static keyword is known as class level Variables.
    * These are also known as static variables.
    *
    * syntax:
    * Static datatype variableName;  // declaration
    *
    * Static datatype variableName =  value;  // declaration and initialization
    *
    * Example for static variable declaration:
    *       Static int num1;  // since value is not assigned, the default value get assigned to it
    *
    * Example for static variable declaration and initialisation
    *       Static String name = “sirisree tech tutorials”;
 */

    static int num1; // default value for int is 0, it will get assigned
    static String name = "Sirisree tech tutorials";

    public static void printNum1() {
        System.out.println("printing num1 " + num1);
    }

    public static void printName() {
        System.out.println("printing name " + name);
    }

    /*public static void localVariableWithoutInitialisation() {
        int n;  // local variable n (scope of this is limited to this method.)
        System.out.println("printing n " + n);
    }*/

    public static void main(String[] args) {
        printNum1();
        printName();
    }
}
