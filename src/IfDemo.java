public class IfDemo {
  public static void main(String[] args) {
      int x = 20;
      int y = 18;
      if (x > y) { // condition true, executes
        System.out.println("x is greater than y");
      }

      if (x < y) { //condition false, won't execute
        System.out.println("x is lesser than y");
      }
  }
}
