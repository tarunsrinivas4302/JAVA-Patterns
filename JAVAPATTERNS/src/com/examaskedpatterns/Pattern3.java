package com.examaskedpatterns;
import java.util.Scanner;

public class Pattern3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size : ");
        int n = sc.nextInt();
        char currentCharacter = 'a';
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print(number + " ");
                    } else {
                        System.out.print(currentCharacter + " ");
                    }
                } else {
                    if (j == n) {
                        System.out.print(number);
                    } else {
                        if (j % 2 == 0) {
                            System.out.print(currentCharacter + " ");
                        } else {
                            System.out.print(number + " ");
                        }
                    }
                }
            }
            if (i % 2 == 0) {
                currentCharacter++;
            }
            number++;
            System.out.println();
        }
        sc.close();
    }
}
