

public class MethodInteraction {
 public static void main(String[] a)
 {
  method1();
  method1(100);
 }

 public static void method1() {
  System.out.println("Method-1");
  method2();
 }

 public static void method2() {
  System.out.println("Method-2");
 }

 public static void method1(int a)
 {
     System.out.println("a = "+ a);
 }
}
