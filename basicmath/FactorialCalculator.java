package basicmath;

import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		long fact = 1;
		for(int i = 1; i<=num; i++) {
			fact = fact*num;
		}
		System.out.println("the Factorial of number which is "+ num+ "is "+fact);

	}

}
