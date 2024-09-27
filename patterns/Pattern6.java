package patterns;

import java.util.Scanner;

//1 2 3
//1 2
//1
public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number which you want to :");
		int n = sc.nextInt();
		for(int i = 1; i<= n; i++) {
			for (int j = 1; j<=n-i+1; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
	
	}

}
