/*
      * Method overloading is a concept where we can create multiple methods
        with same name but different parameters in same class

      * parameters can be different in such a way, number of parameters can be different,
        The type of parameter can be different

      * By changing just return type, we can not achieve method overloading

      * useful when the operation is same but arguments can different
*/

public class MethodOverloading {

    public static void add(int a, int b) {
        System.out.println("sum of two numbers = " + (a + b));
    }

    public static void add(int a, int b, int c) {
        System.out.println("sum of three numbers = " + (a+b+c));
    }

    public static void add(double a, double b) {
        System.out.println("sum of two double numbers = " + (a + b));
    }

    public static void main(String[] args) {
        add(1,2);
        add(1,2,3);
        add(4.5, 5.9);
    }
}
