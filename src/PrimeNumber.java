

public class PrimeNumber {
 public static void main(String[] a)
 {
    /*
    A number that can only divisible
    by 1 or that number
 ex: 5 --> it is divisible by 1 or 5
     */
  int n = 5;
  for (int i=2; i<n; i++) {
   if(n%i == 0) {
    System.out.println("not prime.");
    return;
   }
  }
  System.out.println("prime.");
 }
}
