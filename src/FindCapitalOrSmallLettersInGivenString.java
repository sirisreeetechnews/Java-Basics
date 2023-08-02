

class
FindCapitalOrSmallLettersInGivenString {
 public static void main(String[] args){
  java.util.Scanner sc =
      new java.util.Scanner(System.in);
  String str1 = sc.next();
  System.out.println("capital letters:");
  for(int i=0; i<str1.length(); i++) {
    if (str1.charAt(i) >= 65 &&
      str1.charAt(i) <= 90) {
      System.out.println(str1.charAt(i));
    }
  }
  System.out.println("small letters:");
  for(int i=0; i<str1.length(); i++) {
    if (str1.charAt(i) >= 97 &&
        str1.charAt(i) <= 122) {
      System.out.print(str1.charAt(i));
    }
  }
 }
}
