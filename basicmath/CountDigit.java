package basicmath;

import java.util.Scanner;

public class CountDigit {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a N numbers which you want to count: ");
			int N = sc.nextInt();
			int cnt = 0;
			while(N>0) {
				int lastDigit = N%10;
				cnt = cnt+1;
				N = N/10;
				
			}
			System.out.print(N);
			
		}
}