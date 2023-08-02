
public class MultipleMethods {
    /*
      * In Single class we can write multiple methods
      * Method names can be same or different
      * if method names are same, then the arguments/parameters should be different
      * if method names are different, then no need to check arguments/parameters
      *
      * what is argument/parameter ?
      *     It is the input for the method
      *
      * the method can interact with each other
      *
      * the execution will be when we are making a call to another method
      * it will complete executing the called method and return to calling method
     */

    public static void main(String[] args) {
        method1();
        method1(1);
        method1("siri sree tech tutorials");
        method2();
    }

    public static void method1() {
        System.out.println("method1 is executing");
        method2();
    }

    public static void method1(int a) {
        System.out.println("method1 with integer parameter is executing");
        method1("srikanth");
    }

    public static void method1(String a) {
        System.out.println("method1 with string parameter is executing");
    }

    public static void method2() {
        System.out.println("method2 is executing");
    }




}
