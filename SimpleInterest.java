package com.prodapt.week1assignment;

public class SimpleInterest {

	public static int principal = 1200;
	public static int time_in_months = 2;
	public static float rate = 5.4f;

	public static void main(String[] args) throws Exception {
		// This line is for user inputs

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.print("Enter the principal : "); principal = sc.nextInt();
		 * System.out.print("Enter the rate : "); rate = sc.nextFloat();
		 * System.out.print("Enter the time in months : "); time = sc.nextInt();
		 */

		float si = (principal * rate * time_in_months) / 100;
		System.out.println("The amount to be paid after the loan duration ends is " + (principal + si));
	}

}
