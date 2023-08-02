
    public class BreakAndContinue {
        /*
            break    - used to terminate from the loop/switch immediately  (switch, loops)
            continue - used to skip the current iteration of a loop  (loops)
         */
        public static void main(String[] args) {
            switch (4) {
                case 1:
                    System.out.println("Monday"); break;
                case 2:
                    System.out.println("Tuesday"); break;
                case 3:
                    System.out.println("Wednesday"); break;
                case 4:
                    System.out.println("Thursday");
                case 5:
                    System.out.println("Friday"); break;
                case 6:
                    System.out.println("Saturday"); break;
                case 7:
                    System.out.println("Sunday"); break;
                default:
                    System.out.println("Please enter 1 to 7 numbers.");
            }

            for (int i=1; i<=10; i++) {
                if (i == 5) {
                    break;
                }
                System.out.println(i);
            }


            for (int i=1; i<=10; i++) {
                if (i == 5) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }
