public class PercentageOperator {
  public static void main(String[] args) {
    int a = 100;
    int b = 4;
    int c = 3;

    //100 is divisible by 4, so reminder is 0
    System.out.println("a%b = " + (a%b));

    //100 is not divisible by 3, so reminder is 1
    System.out.println("a%c = " + (a%c));
  }
}
