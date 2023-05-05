package com.starpatterns;

import java.util.Scanner;

public class RightTrianglestar {

	public static void main(String[] args) {
		int i,j;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the row size : ");
		int n = sc.nextInt();
		for(i=1; i<=n; i++) {
			for(j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
