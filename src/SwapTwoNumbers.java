
public class SwapTwoNumbers {
 public static void main(String[] in)
 {
  int a = 10;
  int b = 30;
  a = a + b; // a = 40
  b = a - b; // b = 40-30 = 10
  a = a - b; // a = 40-10 = 30
  System.out.println("a --> " + a);
  System.out.println("b --> " + b);
 }
}
