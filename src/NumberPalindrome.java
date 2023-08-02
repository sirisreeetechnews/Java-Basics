
public class NumberPalindrome {
 public static void main(String[] a)
 {
   /*
   number that is same after reverse
   ex: 141 --> palindrome
       123 --> not palindrome
    */
  int n = 141;
  int reverse = 0;
  int temp = n;
  while(temp > 0) {
   int reminder = temp%10;
   reverse = (reverse*10)+reminder;
   temp = temp/10;
  }
  if (n == reverse)
   System.out.println("Palindrome.");
  else
   System.out.
         println("not palindrome.");
 }
}
