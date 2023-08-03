import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator application!!!");

        // since we need to take input from user... we need Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number ");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number ");
        int num2 = sc.nextInt();

        System.out.println("What operation you want to perform? \n " +
                "'+' for addition \n " +
                "'-' for subtraction \n" +
                "'*' for multiplication and \n " +
                "'/' for division ");

        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+' :
                printAdditionValue(num1, num2); break;
            case '-' :
                printSubtractionValue(num1, num2); break;
            case '*' :
                printMultipliedValue(num1, num2); break;
            case '/' :
                printDivisionValue(num1, num2); break;
            default :
                System.out.println("The entered operation symbol is not valid. Please enter one of '+', '-', '*', or '/'");
        }

    }

    public static void printDivisionValue(int num1, int num2) {
        System.out.println("division of given numbers is " + (num1 / num2));
    }

    public static void printMultipliedValue(int num1, int num2) {
        System.out.println("Multiplication of given numbers is " + (num1 * num2));
    }

    public static void printSubtractionValue(int num1, int num2) {
        System.out.println("subtraction of given numbers is " + (num1 - num2));
    }

    public static void printAdditionValue(int num1, int num2) {
        System.out.println("addition of given numbers is " + (num1 + num2));
    }
}
