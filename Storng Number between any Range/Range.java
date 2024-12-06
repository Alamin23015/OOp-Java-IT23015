import java.util.Scanner;

public class Range {

    static void NumbersInRange() {
        Scanner input = new Scanner(System.in);

        // Input the lower and upper bounds of the range
        System.out.print("Enter the lower bound: ");
        int lowerBound = input.nextInt();

        System.out.print("Enter the upper bound: ");
        int upperBound = input.nextInt();

        System.out.println("Strong numbers in the range [" + lowerBound + ", " + upperBound + "]:");

        boolean found = false; // Flag to check if any strong number exists

        // Iterate over the range
        for (int n = lowerBound; n <= upperBound; n++) {
            int temp = n;
            int sum = 0;

            // Calculate the sum of factorials of digits
            while (temp > 0) {
                int f = 1;
                int x = temp % 10;

                // Compute factorial of the digit
                for (int i = 1; i <= x; i++) {
                    f *= i;
                }

                sum += f;
                temp /= 10;
            }

            // Check if the current number is a strong number
            if (n == sum) {
                System.out.println(n);
                found = true;
            }
        }

        // If no strong numbers were found, print a message
        if (!found) {
            System.out.println("No strong numbers found in the given range.");
        }

        input.close(); // Close the scanner
    }

    public static void main(String[] args) {
       NumbersInRange(); // Call the method .
    }
}
