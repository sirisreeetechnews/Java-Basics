
public class HowToSolvePatterns {
 public static void main(String[] a){
   /*  User input 4
        1
        1  2
        1  2  3
        1  2  3  4
    */
    for(int i= 1; i<=4 ; i++) {
     for(int j= 1; j<=i ; j++) {
         System.out.print(j + "  ");
     }
     System.out.println();
    }
 }
}
