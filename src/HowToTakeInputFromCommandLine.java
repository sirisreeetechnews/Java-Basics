
class HowToTakeInputFromUser {
 public static void main(String[] a) {
/*
 read two numbers from user print sum
*/
  java.util.Scanner sc =
     new java.util.Scanner(System.in);
  System.out.println("enter num1");
  int num1 = sc.nextInt();
  System.out.println("enter num2");
  int num2 = sc.nextInt();
  int sum = num1 + num2;
  System.out.println("sum="+sum);
 }
}
