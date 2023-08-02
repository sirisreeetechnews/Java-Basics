
public class Pattern3 {
 public static void main(String[] a){
   /* User input 4
      4  3  2  1
      3  2  1
      2  1
      1
    */
//  outer for loop iterations = 4
//  inner for loop -> decrement

  for(int i= 4; i>=1; i--) {
   for(int j= i; j>=1; j--) {
    System.out.print(j + "  ");
   }
   System.out.println();
  }
 }
}
