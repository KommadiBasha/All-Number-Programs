package com.pattern.programs;

import java.util.Scanner;

public class Triangle2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row...");
		int row = sc.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = i; j <= row-1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
