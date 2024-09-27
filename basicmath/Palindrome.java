package basicmath;

import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {
        // Initialize Scanner to read input from the console
        Scanner sc = new Scanner(System.in);
        
        // Read an integer from the user
        int n = sc.nextInt();
        
        // Store the original number
        int originalNum = n;
        int revNum = 0;
        
        // Calculate the reverse of the number
        while (n > 0) {
            int lastDigit = n % 10;
            revNum = (revNum * 10) + lastDigit;
            n = n / 10;
        }
        
        // Check if the original number is equal to the reversed number
        if (originalNum == revNum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        // Close the Scanner
        sc.close();
    }
}
