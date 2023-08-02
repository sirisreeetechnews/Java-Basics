
public class FibonacciSeries {
 public static void main(String[] a)
 {
  /*
    0,1,1,2,3,5,8,13,21,34.....
   */
 int firstVal = 0;
 int secondVal = 1;
 System.out.println(firstVal);
 System.out.println(secondVal);
 for (int i=2; i<10; i++) {
  int nextVal = firstVal+secondVal;
  System.out.println(nextVal);
  firstVal = secondVal;
  secondVal = nextVal;
 }
 }
}
