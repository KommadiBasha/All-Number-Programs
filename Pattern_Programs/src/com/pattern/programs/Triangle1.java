package com.pattern.programs;

import java.util.Scanner;

public class Triangle1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row...");
		int row = sc.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = i; j <= row; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
