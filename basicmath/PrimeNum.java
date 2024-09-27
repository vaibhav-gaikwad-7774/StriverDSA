package basicmath;

import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number which you want to Check if it's prime or not: ");
        int num = sc.nextInt();
        
        // A prime number is greater than 1 and divisible only by 1 and itself.
        if (num <= 1) {
            System.out.println(num + " is not a Prime Number.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println(num + " is a Prime Number.");
            } else {
                System.out.println(num + " is not a Prime Number.");
            }
        }

        sc.close();
    }
}
