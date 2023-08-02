
public class Pattern9 {
  public static void main(String[] a){
/*  user input 3
            *
           * *
          * * *
*/
    int i, j;
    // outer loop to handle rows
    for (i = 0; i < 3; i++) {
        // inner loop to print spaces.
        for (j = 3 - i; j > 1; j--) {
            System.out.print(" ");
        }
        // inner loop to print stars.
        for (j = 0; j <= i; j++) {
            System.out.print("* ");
        }
     System.out.println();//new line
    }
  }
}
