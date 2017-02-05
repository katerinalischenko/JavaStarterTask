package com.gmail.katryskin;

import java.util.Scanner;

public class Main {
	
	//Выведите на экран прямоугольник из *. Причем высота и ширина
	//прямоугольника вводятся с клавиатуры. Например ниже представлен
	//прямоугольник с высотой 4 и шириной 5.
	//*****
	//*   *
	//*   *
	//*****

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Input a");
		a = sc.nextInt();
		System.out.println("Input b");
		b = sc.nextInt();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (i == 0 || i == a - 1 || j == 0 || j == b - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
