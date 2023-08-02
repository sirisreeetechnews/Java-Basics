
public class WhatIsMethod // WhatIsMethod is the class name
{
    public static void main(String[] args)  // Main Method with String array argument
    {
        // We can declare variables
        int a;
        // Scanner for reading input from user
        java.util.Scanner sc = new java.util.Scanner(System.in);
        // Initialize variables
        a = sc.nextInt();
        // we can write if conditions
        System.out.println("Usage of if elseif else blocks");
        if (a > 10) {
            System.out.println("a is more than 10.");
        } else if (a == 10){
            System.out.println("a is equal to 10.");
        } else {
            System.out.println("a is lesser than 10.");
        }

        System.out.println("Usage of switch blocks");
        switch (a) {
            case 10 :
                System.out.println("a is 10. I am printing in switch block."); break;
            case 5 :
                System.out.println("a is 5, I am printing in switch block."); break;
            default:
                System.out.println("a is not 10 and not 5. So executing default code..");
        }


        System.out.println("Usage of loops");
        for (int i=0; i<a; i++) {
            if (i == 5) {
                continue;
            }
            if (a == 10) {
                break;
            }
            System.out.println(i);
        }

        while(a <= 10) {
            System.out.println("I am in while loop. the a is " + a);
            a++;
        }

        System.out.println("Usage of Ternary operator..");
        String str = (a == 10) ? "a is 10. printing in ternary." : "a is not 10. printing in ternary operator";
        System.out.println(str);

    }
}
