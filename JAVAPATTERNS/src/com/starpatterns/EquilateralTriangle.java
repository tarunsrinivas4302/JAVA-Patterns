package com.starpatterns;

import java.util.Scanner;

public class EquilateralTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size : ");
		int n = sc.nextInt();
		int i,j;
		for(i=1; i<=n; i++) {
		
			for(int k=n-1; k>=i;k--) {
				System.out.print(" ");
			}
			for(j=1; j<=i; j++) {
				System.out.print("* ");
			}
		
			System.out.println();
		}
	}

}
