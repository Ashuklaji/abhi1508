package assignment19DEC;

import java.util.Scanner;

public class ConsecutiveNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Check three Input Number Consecutive or Not");
		System.out.println("Input the first number: ");
		int n1 = sc.nextInt();
		System.out.println("Input the Second number: ");
		int n2 = sc.nextInt();
		System.out.println("Input the third number: ");
		int n3 = sc.nextInt();
		if (isConsecutive(n1, n2, n3)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	private static boolean isConsecutive(int n1, int n2, int n3) {
		boolean flag = false;
		if (n1 + 1 == n2 && n2 + 1 == n3) {
			flag = true;
		}
		return flag;
	}

}
