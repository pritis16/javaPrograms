import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the minimum number: ");
        int minNumber = scanner.nextInt();
        System.out.print("Enter the maximum number: ");
        int maxNumber = scanner.nextInt();

        // Find the smallest number
        int smallest = minNumber;
        for (int i = minNumber + 1; i <= maxNumber; i++) {
            if (i < smallest) {
                smallest = i;
            }
        }

        // Find the greatest even number
        int greatestEven = minNumber % 2 == 0 ? minNumber : minNumber + 1;
        for (int i = minNumber + 2; i <= maxNumber; i += 2) {
            if (i > greatestEven) {
                greatestEven = i;
            }
        }

        // Find the greatest odd number
        int greatestOdd = minNumber % 2 != 0 ? minNumber : minNumber + 1;
        for (int i = minNumber + 2; i <= maxNumber; i += 2) {
            if (i % 2 != 0 && i > greatestOdd) {
                greatestOdd = i;
            }
        }

        // Find the overall greatest number
        int overallGreatest = Math.max(Math.min(smallest, greatestEven), greatestOdd);

        // Print the result
        System.out.println("The greatest number among the smallest, even, and odd numbers is: " + overallGreatest);
    }
}