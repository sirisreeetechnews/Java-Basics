import java.util.Scanner;

public class FactorialOfGivenNumber {
 public static void main(String[] args) {
  // in=5 => 5*4*3*2*1 = 120
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int fact = 1;
  for (int i=n; i>1; i--) {
   fact = fact*i;
  }
  System.out.println("factorial = " + fact);
 }
}
