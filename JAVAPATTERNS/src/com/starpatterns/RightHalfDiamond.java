package com.starpatterns;

import java.util.Scanner;

public class RightHalfDiamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size : ");
		int n = sc.nextInt();
		int i, j;
		for (i = n; i>= -(n-1); i--) {
			for (j = n-1; j >= Math.abs(i); j--) {
				System.out.print("*");
			}
		
		
			System.out.println();
		}
	}
}
