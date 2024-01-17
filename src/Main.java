import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Please enter a number: ");
        int n = inp.nextInt();

        // Variables to store the sum and count of divisible numbers
        int sum = 0; // Adding to the sum
        int count = 0; // Increasing the count of divisible numbers

        // Checking numbers from 0 to the n
        int i = 0; // Starting from 0
        while (i <= n) { // Including n
            // Checking numbers divisible by 3 and 4
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i; // Adding to the sum
                count++; // Increasing the count
            }
            i++; // Moving to the next number
        }

        // Calculating the average
        double average = (double) sum / count;

        // Printing the result
        System.out.println("Average of numbers divisible by 3 and 4, from 0 (inclusive) to " + n + " (inclusive): " + average);
    }
}