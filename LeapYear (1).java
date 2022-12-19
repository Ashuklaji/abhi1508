package assignment19DEC;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year");
		int year = sc.nextInt();
		if (checkLeapYear(year)) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}

	}

	private static boolean checkLeapYear(int year) {
		boolean flag = false;
		if (year % 4 == 0) {

			if (year % 100 == 0) {
				if (year % 400 == 0) {
					flag = true;
				}
			} else {
				flag = true;
			}

		}
		return flag;
	}

}
