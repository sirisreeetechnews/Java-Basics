
public class StaticVsNonstatic {
/*
* static:
1. static variables gets created only once
   when class is loading by ClassLoader.
2. static variables can access in both
   static methods and non-static methods
3. static variables will create in static
   memory.

* non-static:
1. non-static variables gets created
   each time when object gets created.
2. non-static variables can only accessible
   in non-static methods.
3. non-static variables will create in heap
   memory.
*/
}

class A {
 static int a;
 int b;

 public static void main(String[] args) {
  A aObj = new A();
  A a1Obj = new A();
 }
}
