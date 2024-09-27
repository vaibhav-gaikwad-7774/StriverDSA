package patterns;
import java.util.Scanner;

public class Demo2 {
    // Method to print the NxN forest pattern
    public static void nForest(int n) {
        for(int i = 0; i < n; i++) {        // Loop for each row
            for(int j = 0; j < n; j++ ) {    // Loop for each column
                System.out.print("* ");      // Print star with space
            }
            System.out.println();            // Move to the next line after each row
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the forest (N): ");
        int n = scanner.nextInt();            // Input for the size of the forest
        System.out.println("The forest is:");
        nForest(n);                           // Call the nForest method to print the pattern
    }
}
