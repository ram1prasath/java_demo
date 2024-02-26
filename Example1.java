public class ControlStatementsExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // if-else statement
        if (x < y) {
            System.out.println("x is less than y");
        } else {
            System.out.println("x is greater than or equal to y");
        }

        // switch statement
        int dayOfWeek = 4;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // while loop
        int i = 0;
        while (i < 5) {
            System.out.println("i is: " + i);
            i++;
        }

        // do-while loop
        int j = 0;
        do {
            System.out.println("j is: " + j);
            j++;
        } while (j < 5);

        // for loop
        for (int k = 0; k < 5; k++) {
            System.out.println("k is: " + k);
        }

        // break and continue statements
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                break; // exit the loop when m is 5
            }
            if (m % 2 == 0) {
                continue; // skip even numbers
            }
            System.out.println("m is: " + m);
        }
    }
}
