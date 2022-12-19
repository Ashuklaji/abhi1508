package assignment19DEC;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		int sum = getSumOfDigits(num);
		System.out.println("Sum of digits : " + sum);

	}

	private static int getSumOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			int r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		return sum;
	}

}
