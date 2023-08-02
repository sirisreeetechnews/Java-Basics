
 class Pattern8 {
  public static void main(String[] a){
   /* User input 3
        *
        *  *
        *  *  *
        *  *
        *
    */
    for(int i= 1; i <= 3; i++) {
      for(int j= 1; j<=i; j++) {
        System.out.print("*  ");
      }
      System.out.println();//new line
    }
    for(int i= 2; i>=1; i--) {
      for(int j= 1; j<=i; j++) {
        System.out.print("*  ");
      }
      System.out.println();//new line
    }
  }
}
