package com.examaskedpatterns;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size : ");
		int n = sc.nextInt();
		char currentCharacter = 'a';
		int number = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				if (i == 1) {
					System.out.print(number);
				} else if (j % 2 == 0) {
					System.out.print(currentCharacter + " ");
				} else if (j % 2 != 0) {
					System.out.print(number + " ");
				}
			}
			currentCharacter++;
			number++;
			System.out.println();
		}
		sc.close();
	}
}
