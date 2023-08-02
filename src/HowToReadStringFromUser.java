

class HowToReadStringFromUser {
 public static void main(String[] a){
  java.util.Scanner sc =
     new java.util.Scanner(System.in);
  String str1 = sc.next();

  System.out.
    println("length="+str1.length());

  System.out.
    println(str1.toLowerCase());

 System.out.
         println(str1.toUpperCase());
 }
}
