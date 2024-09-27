package basicmath;

import java.util.Scanner;

public class Armstrong {

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int k = String.valueOf(num).length();
        int sum = 0;
        int n = num;
        
        while (n > 0) {
            int ld = n % 10; // Get the last digit
            sum += Math.pow(ld, k); // Add the power of the last digit to sum
            n = n / 10; // Remove the last digit
        }
        
        return sum == num; // Check if the sum is equal to the original number
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
