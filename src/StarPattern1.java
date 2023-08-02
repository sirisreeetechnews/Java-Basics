

class Pattern1 {
  public static void main(String[] args) {
        /* user input 5
     row-1 - 1  2  3  4  5
     row-2 - 1  2  3  4
     row-3 - 1  2  3
     row-4 - 1  2
     row-5 - 1
         */

    for (int i=0; i<5; i++) { //columns
      for (int j=1; j<=5-i; j++) { //rows
        System.out.print(j + "  ");
      }
      System.out.println();
    }
  }
}
