package com.starpatterns;

import java.util.Scanner;

public class InvertedLeftTriangleStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size : ");
		int n = sc.nextInt();
		int i,k;
		for(i=1; i<=n; i++) {
			
			for( k=n; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
