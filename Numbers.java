package com.workspace.agila;

import java.util.Scanner;
public class Numbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting value: ");
		int x = sc.nextInt();
		System.out.print("Enter Last value: ");
		int y = sc.nextInt();
		while(x!=y) {
			System.out.println(x);
			x++;
		}
		System.out.println(y);
		
	}
}
