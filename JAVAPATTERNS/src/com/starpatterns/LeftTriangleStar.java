package com.starpatterns;

import java.util.Scanner;

public class LeftTriangleStar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size : ");
		int n = sc.nextInt();
		int i,j;
		for( i=1; i<=n; i++) {
			for(j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}