package com.gmail.katryskin;

import java.util.Scanner;

public class Main {
	
	//Треугольник существует только тогда, когда сумма любых двух его
	//сторон больше третьей. Дано: a, b, c – стороны предполагаемого
	//треугольника. Напишите программу которая укажет существует такой
	//треугольник или нет.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a;
		System.out.println("Input a");
		a = sc.nextDouble();
		double b;
		System.out.println("Input b");
		b = sc.nextDouble();
		double c;
		System.out.println("Input c");
		c = sc.nextDouble();
		if (a+b>c && a+c>b && b+c>a){
			System.out.println("Your triangle is exist.");
		}else{
			System.out.println("Your triangle doesn`t exist.");
		}
		sc.close();
	}

}
