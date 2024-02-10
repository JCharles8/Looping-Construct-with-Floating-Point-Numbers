import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object
        double[] numbers = new double[5]; // Create an array of 5 doubles

        // Get the numbers from the user and calculate total, max, min, and average
        double total = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter Value: "); // Prompt the user
            numbers[i] = input.nextDouble(); // Get the next double
            total += numbers[i]; // Add the current number to the total
            if (numbers[i] > max) { // If the current number is greater than the max
                max = numbers[i];
            }
            if (numbers[i] < min) { // If the current number is less than the min
                min = numbers[i];
            }
        }

        double average = total / numbers.length; // Calculate the average

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Interest on total at 20%: " + (total * 0.2));

        input.close();
    }
}
