
    public class NestedForLoop {

     public static void main(String[] args) {

        /*

            Nested For Loop  == a loop inside another loop

                for (initialization; condition; increment/decrement) {
                    // outer for loop statements

                    for (initialization; condition; increment/decrement) {
                        // inner for loop statements
                    }
                }
        */

         for(int i=1;i<=3;i++){
             for(int j=1;j<=3;j++){
                 System.out.println(i+" "+j);
             }
         }
     }
    }