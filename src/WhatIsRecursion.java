

public class WhatIsRecursion {
 /*
 * We know methods can call each other
   when required.
 * calling the same method from
   inside that method
  */
}

class FactorialUsingRecursion {
 public static void main(String[] args)
 {
     int factorial = fact(8);
     System.out.println(factorial);
 }
 public static int fact(int n) {
  if (n==1 || n==0) {
   return 1;
  }
  return n*fact(n-1);
 }
}
