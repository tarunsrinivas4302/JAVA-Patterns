package com.starpatterns;

import java.util.Scanner;

public class InvertedRightTriangleStar {

	public static void main(String[] args) {
		int i,j;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the row size : ");
		int n = sc.nextInt();
		for(i=0;i<=n; i++) {
			for(j=i; j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
