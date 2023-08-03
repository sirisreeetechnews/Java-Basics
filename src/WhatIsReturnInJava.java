
public class WhatIsReturnInJava {
    /*
        * return is a keyword, used to terminate/return the execution from method
     */

    /*
        * In this below method void is return type.
        * It means it will not return anything
        * void means nothing
     */
    public static void method1() {
        System.out.println("method1 -> statement 1");
        System.out.println("method1 -> statement 2");
        System.out.println("method1 -> statement 3");
        System.out.println("method1 -> statement 4");
        System.out.println("method1 -> statement 5");
        System.out.println("method1 -> statement 6");
        // we no need to write return statement for void return type
    }

    /*
     * In this below method int is return type.
     * It means it will return some integer value
     * void means nothing
     */

    public static int method2() {
        System.out.println("method2 -> statement 1");
        System.out.println("method2 -> statement 2");
        System.out.println("method2 -> statement 3");
        System.out.println("method2 -> statement 4");
        System.out.println("method2 -> statement 5");
        System.out.println("method2 -> statement 6");
        return 10;
    }

    /*
     * In Below method, boolean is return type
     * In single method we can have multiple return statements depends on the requirement/need
     */
    public static boolean method3(int a) {
        if(a > 10)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        method1();
        int a = method2();
        System.out.println("a = " + a);
        boolean val = method3(10);
        System.out.println("val = " + val);
    }

    /*
     * In Below method, boolean is return type
     * It has a unreachable statement of System.out.println("this is unreachable statement!!");
     * It means in any scenario, it will never execute.
     */
    public static boolean method4(int a) {
        if(a > 10)
            return true;
        else
            return false;
//        System.out.println("this is unreachable statement!!");
    }
}
