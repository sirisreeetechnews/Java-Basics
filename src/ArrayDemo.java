public class ArrayDemo {
  public static void main(String[] args) {
    // Array Declaration & initialization
    String[] cars = {"Volvo", "BMW", "Ford"};
    // print first element (0th index)
    System.out.println("car = " + cars[0]);
    //update first element
    cars[0] = "Audi";
    System.out.println("updated car="+cars[0]);
    System.out.println("Array Length="+cars.length);
  }
}
