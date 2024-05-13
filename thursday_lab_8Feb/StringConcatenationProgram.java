/* Write a java program that method that takes a String[] as an argument and returns a String
 * containing the concatenation of all the strings in the input array. Invoke your method 3
 * times with different arguments. Make sure that your code handles the cases where the 
 * argument is null.
 */

package thursday_lab_8Feb;

import java.util.Scanner;

public class StringConcatenationProgram {

    public static String concatenateStrings(String[] strings) {
        if (strings == null) {
            return "Input array is NULL.";
        }

        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            if (str != null) {
                result.append(str);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the number of strings:");
            int numStrings = scanner.nextInt();

            String[] inputStrings = new String[numStrings];
            System.out.println("Enter " + numStrings + " strings:");

            for (int j = 0; j < numStrings; j++) {
                inputStrings[j] = scanner.next();
            }

            String result = concatenateStrings(inputStrings);
            System.out.println("Concatenated String: " + result);
        }

        scanner.close();
    }
}
