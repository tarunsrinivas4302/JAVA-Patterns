package com.examaskedpatterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size : ");
		int n =  sc.nextInt();
		int i,j; char ch = 'a';
		for(i =1 ; i<=n; i++) {
//			Prints spaces before the rows
			for(j=1; j<=n-1; j++) {
				System.out.print(" ");
			}
			
//			Prints Numbers
			for(int k=1; k<=i; k++) {
				System.out.print(k);
				System.out.print(" ");
			}
//			print letters again but in reverse order
			for(int l =i; l>=1; l--) {
				System.out.print(ch);
				System.out.print(" ");
			}
			ch++;
			System.out.println();
		}
		sc.close();
	}

}
// OUTPUT  :
//1 a 
//1 2 b b 
//1 2 3 c c c 
//1 2 3 4 d d d d 
//1 2 3 4 5 e e e e e 
//1 2 3 4 5 6 f f f f f f