
public class WhatWeCanWriteInMethod {

 public static void method() {
// create variables
// local variables
// (local to this method)
  int a;
// initialize variables
  a = 10;
// write if, if-else, if-elseif-else
  if (a == 10) {
   System.out.println("inside if");
  }
// write switch case
  switch (a) {
   case 1 :
    System.out.println("it is 1");
   case 10 :
    System.out.println("it is 10");
  }
// write for loop
  for(int i=0; i<a; i++) {
   System.out.println("i = " + i);
  }

// write while loop
  while (a < 10) {
   System.out.println("a = " + a);
   a++;
  }
// write Ternary Operation
 String str= (a==10) ? "true" : "false";
  System.out.println("str = " + str);
 }

}











