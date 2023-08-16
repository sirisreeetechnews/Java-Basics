

   class MainMethod {
     public static void main(String[] args) {
      int a = 10;
      int b = 20;
      Addition.getAdditionValue(a,b);
      Subtraction.getSubtractValue(a,b);
      Multiplications.printMultipleValue(a,b);
     }
    }

    class Addition {
     public static int getAdditionValue(int a, int b)
     {
      return a+b;
     }
    }

    class Subtraction {
     public static int getSubtractValue(int a, int b)
     {
      return a-b;
     }
    }

    class Multiplications {
     public static void printMultipleValue(int a, int b)
     {
      System.out.println(a*b);
     }
    }
